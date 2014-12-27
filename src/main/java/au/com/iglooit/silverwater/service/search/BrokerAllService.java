package au.com.iglooit.silverwater.service.search;

import au.com.iglooit.silverwater.model.entity.Broker;
import au.com.iglooit.silverwater.model.vo.BrokerAllVO;

import java.util.List;

/**
 * Created by nicholaszhu on 25/12/2014.
 */
public interface BrokerAllService {
    /**
     * load most popular, last update and new
     * @return
     */
    List<BrokerAllVO> loadBrokers();
}
