package au.com.iglooit.silverwater.service.search;

import au.com.iglooit.silverwater.model.entity.Broker;
import au.com.iglooit.silverwater.model.vo.BrokerAllVO;
import au.com.iglooit.silverwater.service.dao.BrokerDAO;
import com.google.appengine.api.datastore.Key;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nicholaszhu on 25/12/2014.
 */
@Service
public class BrokerAllServiceImpl implements BrokerAllService {
    @Resource
    private BrokerDAO brokerDAO;

    @Override
    public List<BrokerAllVO> loadBrokers() {
        Map<Key, BrokerAllVO> rawCollection = new HashMap<>();

        // get most popular
        List<Broker> mostPopular = brokerDAO.loadMostPopular();
        // get new
        List<Broker> newBrokers = brokerDAO.loadNew();
        // get last modify
        List<Broker> latestUpdate = brokerDAO.loadLatestUpdate();
        for (Broker broker : mostPopular) {
            BrokerAllVO vo = new BrokerAllVO();
            vo.setBroker(broker);
            vo.setCategory(BrokerAllVO.MOST_POPULAR);
            rawCollection.put(broker.getKey(), vo);
        }

        for (Broker broker : newBrokers) {
            BrokerAllVO vo = new BrokerAllVO();
            vo.setBroker(broker);
            vo.setCategory(BrokerAllVO.NEW_BROKER);
            if (!rawCollection.containsKey(broker.getKey())) {
                rawCollection.put(broker.getKey(), vo);
            }
        }

        for (Broker broker : newBrokers) {
            BrokerAllVO vo = new BrokerAllVO();
            vo.setBroker(broker);
            vo.setCategory(BrokerAllVO.LATEST_UPDATE);
            if (!rawCollection.containsKey(broker.getKey())) {
                rawCollection.put(broker.getKey(), vo);
            }
        }

        return new ArrayList<BrokerAllVO>(rawCollection.values());
    }
}
