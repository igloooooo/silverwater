package au.com.iglooit.silverwater.service.search;

import au.com.iglooit.silverwater.model.entity.Broker;
import au.com.iglooit.silverwater.service.dao.BrokerDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicholaszhu on 5/01/2015.
 */
@Service
public class SuggestBrokerServiceImpl implements SuggestBrokerService {
    @Resource
    private BrokerFTSearch brokerFTSearch;
    @Resource
    private BrokerDAO brokerDAO;

    @Override
    public List<Broker> similarBrokers(Broker broker) {
        List<Broker> brokers = new ArrayList<>();
        for (String suburb : broker.getSuburbList()) {
            List<Broker> tmpBrokers = brokerFTSearch.searchByKeyWord(suburb, 0, 5);
            for (Broker broker1 : tmpBrokers) {
                if (!broker1.getKeyString().equals(broker.getKeyString())) {
                    if (brokers.size() < 5) {
                        brokers.add(broker1);
                    }
                }
            }
            if (brokers.size() >= 5) {
                break;
            }
        }
        return brokers;
    }

    @Override
    public List<Broker> popularBrokers() {
        List popularBrokers = brokerDAO.loadMostPopular();
        return popularBrokers.size() > 4 ? popularBrokers.subList(0, 4) : popularBrokers;
    }
}
