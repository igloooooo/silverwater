package au.com.iglooit.silverwater.service.dao;

import au.com.iglooit.silverwater.model.entity.NewsLetterClient;
import au.com.iglooit.silverwater.repository.BaseRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by nicholaszhu on 28/12/2014.
 */
@Repository
@Transactional
public class NewsLetterClientDAOImpl extends BaseRepository<NewsLetterClient> implements NewsLetterClientDAO {
    public NewsLetterClientDAOImpl() {
        super(NewsLetterClient.class);
    }

    @Override
    public void createNewsLetter(NewsLetterClient client) {
        add(client);
    }
}
