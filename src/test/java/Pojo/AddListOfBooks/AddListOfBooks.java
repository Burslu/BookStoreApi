package Pojo.AddListOfBooks;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class AddListOfBooks {


    @JsonProperty("userId")
    public String userId;
    @JsonProperty("collectionOfIsbns")
    public ArrayList<CollectionOfIspn> collectionOfIsbns;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ArrayList<CollectionOfIspn> getCollectionOfIsbns() {
        return collectionOfIsbns;
    }

    public void setCollectionOfIsbns(ArrayList<CollectionOfIspn> collectionOfIsbns) {
        this.collectionOfIsbns = collectionOfIsbns;
    }
    public AddListOfBooks addISBNItem(CollectionOfIspn item){
        if (collectionOfIsbns == null){
            collectionOfIsbns = new ArrayList<>();
        }
        collectionOfIsbns.add(item);
        return this;
    }
}
