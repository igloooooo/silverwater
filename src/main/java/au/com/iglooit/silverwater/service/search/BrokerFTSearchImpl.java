package au.com.iglooit.silverwater.service.search;

import au.com.iglooit.silverwater.model.entity.Broker;
import au.com.iglooit.silverwater.service.IndexServiceHelp;
import au.com.iglooit.silverwater.service.dao.BrokerDAO;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.search.*;
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
            QueryOptions options = QueryOptions.newBuilder()
                    .setLimit(size)
                    .setOffset(from)
                    .build();
            StringBuilder queryStringBuilder = new StringBuilder();
            if (StringUtils.isNotBlank(keyword)) {
                queryStringBuilder.append("\"").append(keyword.replaceAll("-", " ")).append("\"");
            }
            Query query = Query.newBuilder()
                    .setOptions(options)
                    .build(queryStringBuilder.toString());

            Results<ScoredDocument> results = merchantIndex.search(query);

            // Iterate over the documents in the results
            List<Broker> merchantList = new ArrayList<Broker>();
            for (ScoredDocument document : results) {
                Key key = KeyFactory.stringToKey(document.getId());
                Broker merchant = brokerDAO.findByKey(key);
                if (merchant != null && merchant.getValid()) {
                    merchantList.add(merchant);
                }
            }

            result = merchantList;
        }
        return result;
    }

    @Override
    public List<Broker> searchByKeyWord(String keyword, String suburb, int from, int size) {
        List<Broker> result = new ArrayList<>();
        if (StringUtils.isBlank(keyword)) {
            result = brokerDAO.findAllBrokers();
        } else {
            Index merchantIndex = indexServiceHelp.getBrokerIndex();
            QueryOptions options = QueryOptions.newBuilder()
                    .setLimit(size)
                    .setOffset(from)
                    .build();
            StringBuilder queryStringBuilder = new StringBuilder();
            if (StringUtils.isNotBlank(keyword)) {
                queryStringBuilder.append("\"").append(keyword.replaceAll("-", " ")).append("\"");
                if(StringUtils.isNotBlank(suburb)) {
                    queryStringBuilder.append(" AND suburb=");
                    queryStringBuilder.append("\"").append(suburb.replaceAll("-", " ")).append("\"");
                }
            } else if (StringUtils.isNotBlank(suburb)) {
                queryStringBuilder.append("suburb=");
                queryStringBuilder.append("\"").append(suburb.replaceAll("-", " ")).append("\"");
            } else {

            }
            Query query = Query.newBuilder()
                    .setOptions(options)
                    .build(queryStringBuilder.toString());

            Results<ScoredDocument> results = merchantIndex.search(query);

            // Iterate over the documents in the results
            List<Broker> merchantList = new ArrayList<Broker>();
            for (ScoredDocument document : results) {
                Key key = KeyFactory.stringToKey(document.getId());
                Broker merchant = brokerDAO.findByKey(key);
                if (merchant != null) {
                    merchantList.add(merchant);
                }
            }

            result = merchantList;
        }
        return result;
    }
}
