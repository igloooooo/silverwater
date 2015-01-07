package au.com.iglooit.silverwater.model.entity;

import com.google.appengine.api.search.Document;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

/**
 * Created by nicholaszhu on 24/12/2014.
 */
@Entity
@MappedSuperclass
public abstract class NoGeoBaseEntity extends BaseEntity {


    @Override
    public Document toGeoDocument() {
        return null;
    }
}
