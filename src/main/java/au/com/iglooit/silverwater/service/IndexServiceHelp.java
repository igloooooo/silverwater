package au.com.iglooit.silverwater.service;

import com.google.appengine.api.search.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created with IntelliJ IDEA.
 * IGUser: nicholas.zhu
 * Date: 21/08/2014
 * Time: 11:43 AM
 */
@Component
public class IndexServiceHelp {
    private static final Logger LOG = LoggerFactory.getLogger(IndexServiceHelp.class);

    public static final String BROKER_INDEX_NAME = "broker_index";
    public static final String SUBURB_INDEX_NAME = "suburb_index";
    public static final String GEO_INDEX_NAME = "geo_index";
    private Index brokerIndex;
    private Index geoMerchantIndex;
    private Index suburbIndex;

    @PostConstruct
    public void init() throws Exception {
        LOG.info("init index");
        brokerIndex = initBrokerIndex();
        geoMerchantIndex = initMerchantGeoIndex();
        suburbIndex = initSuburbIndex();
    }

    private Index initBrokerIndex() {
        GetResponse<Index> response = SearchServiceFactory.getSearchService().getIndexes(
                GetIndexesRequest.newBuilder().setSchemaFetched(true).build());
        if (response != null) {
            // List out elements of Schema
            for (Index index : response) {
                if (index.getName().equals(BROKER_INDEX_NAME)) {
                    return index;
                }
            }
        }
        // create a new index;
        LOG.info("create new index " + BROKER_INDEX_NAME);
        IndexSpec indexSpec = IndexSpec.newBuilder().setName(BROKER_INDEX_NAME).build();
        return SearchServiceFactory.getSearchService().getIndex(indexSpec);
    }

    private Index initSuburbIndex() {
        GetResponse<Index> response = SearchServiceFactory.getSearchService().getIndexes(
                GetIndexesRequest.newBuilder().setSchemaFetched(true).build());
        if (response != null) {
            // List out elements of Schema
            for (Index index : response) {
                if (index.getName().equals(SUBURB_INDEX_NAME)) {
                    return index;
                }
            }
        }
        // create a new index;
        LOG.info("create new index " + SUBURB_INDEX_NAME);
        IndexSpec indexSpec = IndexSpec.newBuilder().setName(SUBURB_INDEX_NAME).build();
        return SearchServiceFactory.getSearchService().getIndex(indexSpec);
    }

    private Index initMerchantGeoIndex() {
        GetResponse<Index> response = SearchServiceFactory.getSearchService().getIndexes(
                GetIndexesRequest.newBuilder().setSchemaFetched(true).build());
        // List out elements of Schema
        if (response != null) {
            for (Index index : response) {
                if (index.getName().equals(GEO_INDEX_NAME)) {
                    return index;
                }
            }
        }
        // create a new index;
        LOG.info("create new index " + GEO_INDEX_NAME);
        IndexSpec indexSpec = IndexSpec.newBuilder().setName(GEO_INDEX_NAME).build();
        return SearchServiceFactory.getSearchService().getIndex(indexSpec);
    }

    public Index getBrokerIndex() {
        return brokerIndex;
    }

    public Index getGeoMerchantIndex() {
        return geoMerchantIndex;
    }

    public Index getSuburbIndex() {
        return suburbIndex;
    }
}
