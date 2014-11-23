package au.com.iglooit.silverwater.exception;

public class AppX extends RuntimeException {
    public AppX (String error) {
        super(error);
    }

    public AppX(String error, Throwable e) {
        super(error, e);
    }
}
