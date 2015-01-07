package au.com.iglooit.silverwater.service.email;

import au.com.iglooit.silverwater.model.entity.Broker;
import au.com.iglooit.silverwater.model.entity.Enquire;

import java.io.Serializable;
import java.util.List;

/**
 * Created by nicholaszhu on 28/12/2014.
 */
public class EnquireEmailVO implements Serializable {
    private Enquire enquire;
    private String customerEmail;
    private String customerName;
    private Broker broker;
    private List<String> toAddressList;

    public Enquire getEnquire() {
        return enquire;
    }

    public void setEnquire(Enquire enquire) {
        this.enquire = enquire;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<String> getToAddressList() {
        return toAddressList;
    }

    public void setToAddressList(List<String> toAddressList) {
        this.toAddressList = toAddressList;
    }

    public Broker getBroker() {
        return broker;
    }

    public void setBroker(Broker broker) {
        this.broker = broker;
    }
}
