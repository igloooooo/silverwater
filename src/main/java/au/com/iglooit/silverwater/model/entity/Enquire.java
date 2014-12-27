package au.com.iglooit.silverwater.model.entity;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.search.Document;

import javax.persistence.Basic;
import java.util.Date;

/**
 * Created by nicholaszhu on 24/12/2014.
 */
public class Enquire extends NoGeoBaseEntity {
    private String enquireName;
    private String enquireEmail;
    private String enquireMobile;
    @Basic
    private Key brokerKey;
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

    public Key getBrokerKey() {
        return brokerKey;
    }

    public void setBrokerKey(Key brokerKey) {
        this.brokerKey = brokerKey;
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

    @Override
    public Document toFullTextDocument() {
        return null;
    }
}
