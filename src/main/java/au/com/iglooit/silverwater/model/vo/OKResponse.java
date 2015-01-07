package au.com.iglooit.silverwater.model.vo;

/**
 * Created by nicholaszhu on 5/01/2015.
 */
public class OKResponse extends JsonResponse {
    public OKResponse() {
        super(Boolean.TRUE, "");
    }

    public OKResponse(String msg) {
        super(Boolean.TRUE, msg);
    }
}
