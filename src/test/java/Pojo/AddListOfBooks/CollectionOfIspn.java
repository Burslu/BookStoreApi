package Pojo.AddListOfBooks;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CollectionOfIspn {

    @JsonProperty("isbn")
    public String isbn;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
