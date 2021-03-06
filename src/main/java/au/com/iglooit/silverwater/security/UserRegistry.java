package au.com.iglooit.silverwater.security;

import au.com.iglooit.silverwater.model.entity.IGUser;

/**
 * Created with IntelliJ IDEA.
 * IGUser: nicholas.zhu
 * Date: 28/08/2014
 * Time: 12:13 PM
 */
public interface UserRegistry {
    IGUser findUser(String userId);

    void registerUser(IGUser newIGUser);

    void removeUser(String userId);
}
