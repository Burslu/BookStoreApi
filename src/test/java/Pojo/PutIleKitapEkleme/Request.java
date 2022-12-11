package Pojo.PutIleKitapEkleme;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {

    @JsonProperty("userId")
    public String userId;
    @JsonProperty("isbn")
    public String isbn;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
