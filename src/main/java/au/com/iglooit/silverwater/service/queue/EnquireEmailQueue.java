package au.com.iglooit.silverwater.service.queue;

import au.com.iglooit.silverwater.model.entity.Enquire;
import au.com.iglooit.silverwater.model.entity.Suburb;
import au.com.iglooit.silverwater.service.dao.EnquireDAO;
import au.com.iglooit.silverwater.service.dao.SuburbDAO;
import au.com.iglooit.silverwater.service.email.EMailService;
import com.google.appengine.api.datastore.KeyFactory;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * Created by nicholaszhu on 5/01/2015.
 */
@Controller
public class EnquireEmailQueue {
    private static final Logger LOG = LoggerFactory.getLogger(EnquireEmailQueue.class);
    public static final String ENQUIRE_EMAIL_QUEUE_URL = "/pq/enquireemail/";
    public static final String ENQUIRE_EMAIL_QUEUE_NAME = "enquire-email-q";
    @Resource
    private EnquireDAO enquireDAO;
    @Resource
    private EMailService eMailService;

    @RequestMapping(value = ENQUIRE_EMAIL_QUEUE_URL,
            method = RequestMethod.POST)
    public ResponseEntity QuoteHandler(@RequestParam("keyString") String keyString) {
        if(StringUtils.isNotBlank(keyString)){
            Enquire enquire = enquireDAO.findByKey(KeyFactory.stringToKey(keyString));
            if(enquire != null) {
                eMailService.sendEnquireEmail(enquire);
            }else {
                LOG.error("Can NOT find the enquire for key " + keyString);
            }
        }else {
            LOG.error("enquire key is null.");
        }

        return new ResponseEntity<String>(HttpStatus.OK);
    }
}
