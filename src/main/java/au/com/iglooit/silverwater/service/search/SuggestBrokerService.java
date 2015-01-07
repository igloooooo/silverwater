package au.com.iglooit.silverwater.service.search;

import au.com.iglooit.silverwater.model.entity.Broker;

import java.util.List;

/**
 * Created by nicholaszhu on 5/01/2015.
 */
public interface SuggestBrokerService {
    List<Broker> similarBrokers(Broker broker);
    List<Broker> popularBrokers();
}
