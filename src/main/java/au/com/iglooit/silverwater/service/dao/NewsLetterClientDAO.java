package au.com.iglooit.silverwater.service.dao;

import au.com.iglooit.silverwater.model.entity.NewsLetterClient;

/**
 * Created by nicholaszhu on 28/12/2014.
 */

public interface NewsLetterClientDAO extends IEntityService<NewsLetterClient> {
    void createNewsLetter(NewsLetterClient client);
}
