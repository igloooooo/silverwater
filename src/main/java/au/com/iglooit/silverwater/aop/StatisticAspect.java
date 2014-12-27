package au.com.iglooit.silverwater.aop;

import au.com.iglooit.silverwater.model.entity.Broker;
import au.com.iglooit.silverwater.model.entity.Enquire;
import au.com.iglooit.silverwater.service.dao.BrokerDAO;
import au.com.iglooit.silverwater.service.dao.StatisticDAO;
import au.com.iglooit.silverwater.utils.DateUtils;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas.zhu
 * Date: 28/10/2014
 * Time: 11:31 AM
 */
@Aspect
@Component
public class StatisticAspect {
    private static final Logger LOG = LoggerFactory.getLogger(StatisticAspect.class);
    @Resource
    private StatisticDAO statisticDAO;
    @Resource
    private BrokerDAO brokerDAO;

    @After("execution(* au.com.iglooit.silverwater.service.dao.BrokerDAO.createBroker(..))&& args(broker)")
    public void afterCreateMerchant(Broker broker) {
        LOG.info("parameter is " + broker.getName());
        statisticDAO.addBroker();
    }

    @After("execution(* au.com.iglooit.silverwater.service.dao.EnquireDAO.createEnquire(..))&& args(enquire)")
    public void afterCreateMerchant(Enquire enquire) {
        LOG.info("parameter is " + enquire.getBrokerKey().toString());
        statisticDAO.addEnquire();
        Broker broker = brokerDAO.findByKey(enquire.getBrokerKey());
        broker.setEnquireCount(broker.getEnquireCount() + 1);
        broker.setLastEnquire(DateUtils.getNow());
        brokerDAO.update(broker);
    }

}
