package au.com.iglooit.silverwater.security;

import org.springframework.security.core.AuthenticationException;

/**
 * Created with IntelliJ IDEA.
 * User: nicholas.zhu
 * Date: 7/10/2014
 * Time: 9:36 PM
 */
public class InvalidAuthenticationException extends AuthenticationException {
    public InvalidAuthenticationException(String msg) {
        super(msg);
    }
}
