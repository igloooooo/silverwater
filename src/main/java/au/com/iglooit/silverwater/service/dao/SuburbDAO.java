package au.com.iglooit.silverwater.service.dao;

import au.com.iglooit.silverwater.model.entity.Suburb;
import au.com.iglooit.silverwater.model.vo.SuburbVO;

import java.util.List;

/**
 * Created by nicholaszhu on 25/12/2014.
 */
public interface SuburbDAO extends IEntityService<Suburb> {
    void createSuburb(Suburb suburb);

    Suburb findByName(String name);

    List<SuburbVO> findByKeyword(String key);
}
