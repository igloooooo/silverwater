package au.com.iglooit.silverwater.service.dao;

import au.com.iglooit.silverwater.model.entity.Broker;

import java.util.List;

public interface BrokerDAO extends IEntityService<Broker> {
    void createBroker(Broker broker);
    Broker findByCanonicalSlugId(String canonicalSlugId);
    List<Broker> findAllBrokers();
}
