package au.com.iglooit.silverwater.service.configure;

import au.com.iglooit.silverwater.properties.WebProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BrokerConfigureService {
    private static final Logger LOG = LoggerFactory.getLogger(BrokerConfigureService.class);

    @PostConstruct
    public void init() throws Exception {
        WebProperties webProperties = WebProperties.getInstance();
        Boolean initData = Boolean.valueOf(webProperties.get("init.broker.data"));
        if (initData) {
            // delete category and categorygroup
            LOG.info("init model - all data will be removed.");
            LOG.info("Start to load category data");
            initBroker();
        }

    }

    private void initBroker() {

    }
}
