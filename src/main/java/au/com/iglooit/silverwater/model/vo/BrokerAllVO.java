package au.com.iglooit.silverwater.model.vo;

import au.com.iglooit.silverwater.model.entity.Broker;

import java.io.Serializable;

/**
 * Created by nicholaszhu on 24/12/2014.
 */
public class BrokerAllVO implements Serializable {
    public static final String MOST_POPULAR = "most-popular";
    public static final String NEW_BROKER = "new-broker";
    public static final String LATEST_UPDATE = "latest-update";

    private Broker broker;
    private String category;

    public Broker getBroker() {
        return broker;
    }

    public void setBroker(Broker broker) {
        this.broker = broker;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
