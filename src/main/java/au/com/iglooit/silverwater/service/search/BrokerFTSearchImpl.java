package au.com.iglooit.silverwater.service.search;

import au.com.iglooit.silverwater.model.entity.Broker;
import au.com.iglooit.silverwater.service.IndexServiceHelp;
import au.com.iglooit.silverwater.service.dao.BrokerDAO;
import au.com.iglooit.silverwater.utils.ListUtils;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.search.Index;
import com.google.appengine.api.search.Results;
import com.google.appengine.api.search.ScoredDocument;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class BrokerFTSearchImpl implements BrokerFTSearch {
    @Resource
    private BrokerDAO brokerDAO;
    @Resource
    private IndexServiceHelp indexServiceHelp;

    @Override
    public List<Broker> searchByKeyWord(String keyword, int from, int size) {
        List<Broker> result = new ArrayList<>();
        if (StringUtils.isBlank(keyword)) {
            result = brokerDAO.findAllBrokers();
        } else {
            Index merchantIndex = indexServiceHelp.getBrokerIndex();
            Results<ScoredDocument> results = merchantIndex.search(keyword.replaceAll("-", " "));

            // Iterate over the documents in the results
            List<Broker> merchantList = new ArrayList<Broker>();
            for (ScoredDocument document : results) {
                Key key = KeyFactory.stringToKey(document.getId());
                Broker merchant = (Broker) brokerDAO.findByKey(key);
                if (merchant != null) {
                    merchantList.add(merchant);
                }
            }

            result = merchantList;
        }
        if (from >= 0 && size > 0) {
            return (List<Broker>) ListUtils.getSubList(result, from, size);
        } else {
            return result;
        }
    }
}
