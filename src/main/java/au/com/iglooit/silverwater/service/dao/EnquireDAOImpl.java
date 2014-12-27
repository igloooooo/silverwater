package au.com.iglooit.silverwater.service.dao;

import au.com.iglooit.silverwater.model.entity.BaseEntity;
import au.com.iglooit.silverwater.model.entity.Broker;
import au.com.iglooit.silverwater.model.entity.Enquire;
import au.com.iglooit.silverwater.repository.BaseRepository;
import au.com.iglooit.silverwater.utils.DateUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by nicholaszhu on 24/12/2014.
 */
@Repository
@Transactional
public class EnquireDAOImpl extends BaseRepository<Enquire> implements EnquireDAO{
    public EnquireDAOImpl(){
        super(Enquire.class);
    }

    @Override
    public void createEnquire(Enquire enquire) {
        enquire.setCreatedOn(DateUtils.getNow());
        add(enquire);
    }
}
