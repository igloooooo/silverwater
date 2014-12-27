package au.com.iglooit.silverwater.service.configure;

import au.com.iglooit.silverwater.properties.WebProperties;
import au.com.iglooit.silverwater.service.dao.StatisticDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * Created by nicholaszhu on 20/12/2014.
 */
@Component
public class StatisticInitService {
    private static final Logger LOG = LoggerFactory.getLogger(StatisticInitService.class);
    @Resource
    private StatisticDAO statisticDAO;

    @PostConstruct
    public void init() throws Exception {
        WebProperties webProperties = WebProperties.getInstance();
        Boolean initData = Boolean.valueOf(webProperties.get("init.statistic"));
        if (initData) {
            // delete category and categorygroup
            LOG.info("init model - all data will be removed.");
            LOG.info("Start to load category data");
            initStatic();
        }

    }

    private void initStatic() {
        statisticDAO.initBroker();
        statisticDAO.initEnquire();
    }

}
