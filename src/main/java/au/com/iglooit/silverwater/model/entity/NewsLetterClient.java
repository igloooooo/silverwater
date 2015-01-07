package au.com.iglooit.silverwater.model.entity;

import com.google.appengine.api.search.Document;

import javax.persistence.Entity;

/**
 * Created by nicholaszhu on 28/12/2014.
 */
@Entity
public class NewsLetterClient extends NoGeoBaseEntity {
    private String clientEmail;

    @Override
    public Document toFullTextDocument() {
        return null;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }
}
