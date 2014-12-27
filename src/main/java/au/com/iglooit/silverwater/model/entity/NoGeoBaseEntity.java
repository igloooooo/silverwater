package au.com.iglooit.silverwater.model.entity;

import com.google.appengine.api.search.Document;

/**
 * Created by nicholaszhu on 24/12/2014.
 */
public abstract class NoGeoBaseEntity extends BaseEntity {


    @Override
    public Document toGeoDocument() {
        return null;
    }
}
