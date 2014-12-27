package au.com.iglooit.silverwater.service.configure;

import au.com.bytecode.opencsv.CSVReader;
import au.com.iglooit.silverwater.model.vo.BrokerImportVO;
import au.com.iglooit.silverwater.properties.WebProperties;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;

@Component
public class BrokerConfigureService {
    private static final Logger LOG = LoggerFactory.getLogger(BrokerConfigureService.class);
    private static final Integer FORENAME = 0;
    private static final Integer SURNAME = 1;
    private static final Integer TITLE = 2;
    private static final Integer PHONE = 3;
    private static final Integer IMAGE_FILE_NAME = 4;
    private static final Integer SUBURB = 5;

    @Resource
    private BrokerImportService brokerImportService;

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

    /**
     * name;
     * surname;
     * forename;
     * email;
     * address1;
     * address2;
     * address3;
     * phone;
     * fax;
     * mobile;
     * bio;
     */
    private void initBroker() throws URISyntaxException, IOException {

        ClassLoader classloader = Thread.currentThread().getContextClassLoader();

        //  InputStream is = classloader.getResourceAsStream("data/merchant.csv");

        URL brokerURL = classloader.getResource("data/broker/");
        String[] merchantFiles = new File(brokerURL.toURI()).list();

        int j = 0;
        while (j < merchantFiles.length) {
            InputStream is = classloader.getResourceAsStream("data/broker/" + merchantFiles[j]);
            CSVReader reader = new CSVReader(new InputStreamReader(is, "UTF-8"));
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                String tradeName = nextLine[FORENAME];
                if (StringUtils.isBlank(tradeName)) {
                    continue;
                }
                brokerImportService.saveOrUpdateBroker(fillUpBrokerImportVO(nextLine));
            }
            j++;
        }

    }

    private BrokerImportVO fillUpBrokerImportVO(String[] nextLine) {
        BrokerImportVO vo = new BrokerImportVO();
        vo.setSurname(nextLine[SURNAME].trim());
        vo.setForename(nextLine[FORENAME].trim());
        vo.setName(vo.getForename() + " " + vo.getSurname());
        vo.setPhone(nextLine[PHONE].trim());
        vo.setMobile(nextLine[PHONE].trim());
        vo.setTitle(nextLine[TITLE].trim());
        vo.setImageFileName(nextLine[IMAGE_FILE_NAME].trim());
        if (nextLine.length > SUBURB) {
            for (int i = SUBURB; i < nextLine.length; i++) {
                vo.getSuburbList().add(nextLine[i].trim());
            }
        }
        return vo;
    }
}
