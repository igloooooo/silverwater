package au.com.iglooit.silverwater.service.dao;

import au.com.iglooit.silverwater.model.entity.Broker;
import au.com.iglooit.silverwater.model.entity.Enquire;
import au.com.iglooit.silverwater.model.entity.Statistic;
import au.com.iglooit.silverwater.repository.BaseRepository;
import au.com.iglooit.silverwater.utils.DateUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class StatisticDAOImpl extends BaseRepository<Statistic> implements StatisticDAO {

    public StatisticDAOImpl() {
        super(Statistic.class);
    }

    @Override
    public void createStatistic(Statistic statistic) {
        add(statistic);
    }

    @Override
    public Statistic findByName(String name) {
        Query q = getEntityManager()
                .createQuery("select q from Statistic q " +
                        "where q.statisticName=:statisticName ")
                .setParameter("statisticName", name);
        List<Statistic> result = q.getResultList();
        if (result.size() <= 0) {
            return null;
        } else {
            return result.get(0);
        }
    }

    @Override
    public void initBroker() {
        initClass(Broker.class);
    }

    @Override
    public void addBroker() {
        addClass(Broker.class);
    }

    @Override
    public Long countBroker() {
        return countClass(Broker.class);
    }

    @Override
    public void initEnquire() {
        initClass(Enquire.class);
    }

    @Override
    public void addEnquire() {
        addClass(Enquire.class);
    }

    @Override
    public Long countEnquire() {
        return countClass(Enquire.class);
    }

    private void addClass(Class clazz) {
        Query q = getEntityManager()
                .createQuery("select q from Statistic q " +
                        "where q.statisticName=:statisticName ")
                .setParameter("statisticName", clazz.getName());
        List<Statistic> result = q.getResultList();
        if (result.size() <= 0) {
            throw new UnsupportedClassVersionError("Class " + clazz.getName() + " has not been supported");
        } else {
            Statistic statistic = result.get(0);
            statistic.setStatisticCount(statistic.getStatisticCount() + 1);
            statistic.setUpdateDate(DateUtils.getNow());
            update(statistic);
        }
    }

    private void initClass(Class clazz) {
        Query q = getEntityManager()
                .createQuery("select q from Statistic q " +
                        "where q.statisticName=:statisticName ")
                .setParameter("statisticName", clazz.getName());
        List<Statistic> result = q.getResultList();
        if (result.size() <= 0) {
            Statistic statistic = new Statistic();
            statistic.setStatisticCount(0L);
            statistic.setStatisticName(clazz.getName());
            statistic.setUpdateDate(DateUtils.getNow());
            add(statistic);
        }
    }

    private Long countClass(Class clazz) {
        Query q = getEntityManager()
                .createQuery("select q from Statistic q " +
                        "where q.statisticName=:statisticName ")
                .setParameter("statisticName", clazz.getName());
        if (q.getResultList().size() <= 0) {
            return 0L;
        }
        Statistic statistic = (Statistic) q.getResultList().get(0);
        return statistic.getStatisticCount();
    }
}
