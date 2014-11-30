package au.com.iglooit.silverwater.service.dao;

import au.com.iglooit.silverwater.exception.AppX;
import au.com.iglooit.silverwater.model.entity.Broker;
import au.com.iglooit.silverwater.model.vo.AddressVO;
import au.com.iglooit.silverwater.repository.BaseRepository;
import au.com.iglooit.silverwater.service.IndexServiceHelp;
import au.com.iglooit.silverwater.service.search.GeoSearchService;
import com.google.appengine.api.search.Index;
import com.google.appengine.api.search.PutException;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.Query;
import java.math.BigDecimal;
import java.util.List;

@Repository
@Transactional
public class BrokerDAOImpl extends BaseRepository<Broker> implements BrokerDAO {
    private static final Logger LOG = LoggerFactory.getLogger(BrokerDAOImpl.class);
    @Resource
    private GeoSearchService geoSearchService;
    @Resource
    private IndexServiceHelp indexServiceHelp;

    public BrokerDAOImpl() {
        super(Broker.class);
    }

    @Override
    public void createBroker(Broker broker) {
        // find the geo point
        AddressVO result = geoSearchService.formatAddress(broker.convertToAddress());
        if (result != null) {
            broker.setLatitude(new BigDecimal(result.getGeoPoint().getLatitude()));
            broker.setLongitude(new BigDecimal(result.getGeoPoint().getLongitude()));
            broker.setPostcode(result.getPostcode());
            broker.setSuburb(result.getSuburb());
            broker.setFormatAddress(result.getFormatAddress());
        }
        String contactNumber = StringUtils.isNotBlank(broker.getMobile()) ? broker.getMobile() : "0000";
        broker.setCanonicalSlugId(broker.getForename() + " " + broker.getSurname() + " " + contactNumber);
        add(broker);

        getEntityManager().flush();
        // get full index
        Index merchantIndex = indexServiceHelp.getBrokerIndex();
        // get geo index
        Index geoIndex = indexServiceHelp.getGeoMerchantIndex();
        try {
            merchantIndex.put(broker.toFullTextDocument());
        } catch (PutException e) {
            throw new AppX("Can't create document for " + broker.getKey(), e);
        }

        try {
            geoIndex.put(broker.toGeoDocument());
        } catch (PutException e) {
            throw new AppX("Can't create document for " + broker.getKey(), e);
        }
    }

    @Override
    public Broker findByCanonicalSlugId(String canonicalSlugId) {
        Query q = getEntityManager()
                .createQuery("select q from Broker q " +
                        "where q.canonicalSlugId=:canonicalSlugId ")
                .setParameter("canonicalSlugId", canonicalSlugId);
        List<Broker> result = q.getResultList();
        if (result.size() <= 0) {
            return null;
        } else {
            return result.get(0);
        }
    }

    @Override
    public List<Broker> findAllBrokers() {
        List<Broker> result = findAll();
        LOG.info("size:" + result.size());
        return result;
    }
}
