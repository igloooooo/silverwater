package au.com.iglooit.silverwater.service.dao;

import au.com.iglooit.silverwater.model.entity.Enquire;

/**
 * Created by nicholaszhu on 24/12/2014.
 */
public interface EnquireDAO extends IEntityService<Enquire>{
    void createEnquire(Enquire enquire);
}
