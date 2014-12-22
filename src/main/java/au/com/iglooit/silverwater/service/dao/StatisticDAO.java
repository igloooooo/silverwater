package au.com.iglooit.silverwater.service.dao;

import au.com.iglooit.silverwater.model.entity.Statistic;

public interface StatisticDAO extends IEntityService<Statistic> {
    void createStatistic(Statistic statistic);

    Statistic findByName(String name);

    void initBroker();

    void addBroker();

    Long countBroker();
}
