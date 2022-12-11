package Pojo.AddListOfBooks;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class AddlistOfBooksResponse {

    @JsonProperty("books")
    public ArrayList<CollectionOfIspn> collectionOfIsbns;

    public ArrayList<CollectionOfIspn> getCollectionOfIsbns() {
        return collectionOfIsbns;
    }

    public void setCollectionOfIsbns(ArrayList<CollectionOfIspn> collectionOfIsbns) {
        this.collectionOfIsbns = collectionOfIsbns;
    }
    public AddlistOfBooksResponse addISBNItem(CollectionOfIspn item){
        if (collectionOfIsbns == null){
            collectionOfIsbns = new ArrayList<>();
        }
        collectionOfIsbns.add(item);
        return this;
    }
}
