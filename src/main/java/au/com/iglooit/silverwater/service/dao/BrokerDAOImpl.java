package au.com.iglooit.silverwater.service.dao;

import au.com.iglooit.silverwater.model.entity.Broker;
import au.com.iglooit.silverwater.repository.BaseRepository;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class BrokerDAOImpl extends BaseRepository<Broker> implements BrokerDAO {
    public BrokerDAOImpl() {
        super(Broker.class);
    }

    @Override
    public void createBroker(Broker broker) {
        String contactNumber = StringUtils.isNotBlank(broker.getMobile()) ? broker.getMobile() : "0000";
        broker.setCanonicalSlugId(broker.getForename() + " " + broker.getSurname() + " " + contactNumber);
        add(broker);
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
}
