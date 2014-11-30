package au.com.iglooit.silverwater.service.search;

import au.com.iglooit.silverwater.model.entity.Broker;

import java.util.List;

public interface BrokerFTSearch {
    public List<Broker> searchByKeyWord(String keyword, int from, int size);
}
