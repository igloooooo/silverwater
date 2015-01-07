package au.com.iglooit.silverwater.service.email;

import au.com.iglooit.silverwater.exception.AppX;
import au.com.iglooit.silverwater.model.entity.Broker;
import au.com.iglooit.silverwater.model.entity.Enquire;
import au.com.iglooit.silverwater.properties.WebProperties;
import au.com.iglooit.silverwater.service.dao.BrokerDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.mail.*;
import javax.mail.internet.*;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas.zhu
 * Date: 7/09/2014
 * Time: 8:34 AM
 */
@Component
public class EMailService {
    private static final Logger LOG = LoggerFactory.getLogger(EMailService.class);
    @Resource
    private BrokerDAO brokerDAO;

    public void sendEnquireEmail(Enquire enquire) {
        EnquireEmailVO enquireEmailVO = new EnquireEmailVO();
        enquireEmailVO.setEnquire(enquire);
        final Broker broker = brokerDAO.findByKey(enquire.getBrokerKey());
        enquireEmailVO.setBroker(broker);
        enquireEmailVO.setToAddressList(new ArrayList<String>() {{
            add(broker.getEmail());
        }});
        WebProperties webProperties = WebProperties.getInstance();
        String adminEmail = webProperties.get("admin.email");
        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);

        String msgBody = EmailTemplateHelper.enquireEmailTemplate(enquireEmailVO);

        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(adminEmail));
            for (String address : enquireEmailVO.getToAddressList()) {
                LOG.info("send email to " + address);
                msg.addRecipient(Message.RecipientType.TO,
                        new InternetAddress(address, "Dear " + enquireEmailVO.getBroker().getName()));
            }
            msg.setSubject("A new Enquire for you.");

            Multipart mp = new MimeMultipart();

            MimeBodyPart htmlPart = new MimeBodyPart();
            htmlPart.setContent(msgBody, "text/html");
            mp.addBodyPart(htmlPart);

            msg.setContent(mp);
            Transport.send(msg);

        } catch (AddressException e) {
            throw new AppX("Wrong address", e);
        } catch (MessagingException e) {
            throw new AppX("Wrong Message ", e);
        } catch (UnsupportedEncodingException e) {
            throw new AppX("Wrong Encode", e);
        }
    }

    public void sendContactUsEmail(ContactUsEmailVO vo) {
        WebProperties webProperties = WebProperties.getInstance();
        String adminEmail = webProperties.get("admin.email");

        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);

        String msgBody = vo.getContent();

        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(vo.getUserEmail()));
            msg.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(adminEmail, vo.getName()));
            msg.setSubject("You get email from customer.");
            msg.setText(msgBody);
            Transport.send(msg);

        } catch (AddressException e) {
            throw new AppX("Wrong address", e);
        } catch (MessagingException e) {
            throw new AppX("Wrong Message ", e);
        } catch (UnsupportedEncodingException e) {
            throw new AppX("Wrong Encode", e);
        }
    }
}
