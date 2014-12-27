package au.com.iglooit.silverwater.model.vo;

import au.com.iglooit.silverwater.model.entity.Enquire;
import com.google.appengine.api.datastore.KeyFactory;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by nicholaszhu on 24/12/2014.
 */
public class EnquireVO implements Serializable {

    private String enquireName;
    private String enquireEmail;
    private String enquireMobile;
    private String brokerKeyString;
    private Date enquireDate;
    private String enquireDescription;

    public String getEnquireName() {
        return enquireName;
    }

    public void setEnquireName(String enquireName) {
        this.enquireName = enquireName;
    }

    public String getEnquireEmail() {
        return enquireEmail;
    }

    public void setEnquireEmail(String enquireEmail) {
        this.enquireEmail = enquireEmail;
    }

    public String getEnquireMobile() {
        return enquireMobile;
    }

    public void setEnquireMobile(String enquireMobile) {
        this.enquireMobile = enquireMobile;
    }

    public String getBrokerKeyString() {
        return brokerKeyString;
    }

    public void setBrokerKeyString(String brokerKeyString) {
        this.brokerKeyString = brokerKeyString;
    }

    public Date getEnquireDate() {
        return enquireDate;
    }

    public void setEnquireDate(Date enquireDate) {
        this.enquireDate = enquireDate;
    }

    public String getEnquireDescription() {
        return enquireDescription;
    }

    public void setEnquireDescription(String enquireDescription) {
        this.enquireDescription = enquireDescription;
    }

    public Enquire toEnquire() {
        Enquire enquire = new Enquire();
        if (StringUtils.isNotBlank(brokerKeyString)) {
            enquire.setBrokerKey(KeyFactory.stringToKey(brokerKeyString));
        }
        enquire.setEnquireDate(enquireDate);
        enquire.setEnquireDescription(enquireDescription);
        enquire.setEnquireEmail(enquireEmail);
        enquire.setEnquireMobile(enquireMobile);
        enquire.setEnquireName(enquireName);
        return enquire;
    }
}
