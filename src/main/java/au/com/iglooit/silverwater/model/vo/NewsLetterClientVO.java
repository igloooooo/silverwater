package au.com.iglooit.silverwater.model.vo;

import au.com.iglooit.silverwater.model.entity.NewsLetterClient;

import java.io.Serializable;

/**
 * Created by nicholaszhu on 28/12/2014.
 */
public class NewsLetterClientVO implements Serializable {
    private String clientEmail;

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public NewsLetterClient toNewsLetterClient() {
        NewsLetterClient newsLetterClient = new NewsLetterClient();
        newsLetterClient.setClientEmail(clientEmail);
        return newsLetterClient;
    }
}
