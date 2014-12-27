package au.com.iglooit.silverwater.model.vo;

import java.io.Serializable;

/**
 * Created by nicholaszhu on 24/12/2014.
 */
public class JsonResponse implements Serializable {
    public JsonResponse() {
        this.result = true;
    }

    public JsonResponse(Boolean result, String msg) {
        this.result = result;
        this.errorMsg = msg;
    }

    private Boolean result;
    private String errorMsg;

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
