package Pojo.Delete;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDeleteUserAndBooks {
    @JsonProperty("code")
    public int code;
    @JsonProperty("message")
    public String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
