package Tests.AddListOfBooks;

import Pojo.AddListOfBooks.AddListOfBooks;
import Pojo.AddListOfBooks.AddlistOfBooksResponse;
import Pojo.AddListOfBooks.CollectionOfIspn;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AddListOfBooksApi {

    @Test
    public void addListBooksPost(){

        RequestSpecification specification = new RequestSpecBuilder().setBaseUri("https://bookstore.toolsqa.com/").build();
        CollectionOfIspn collectionOfIspn = new CollectionOfIspn();
        CollectionOfIspn collectionOfIspn1 = new CollectionOfIspn();
        CollectionOfIspn collectionOfIspn2 = new CollectionOfIspn();

          collectionOfIspn.setIsbn("9781593277574");
          collectionOfIspn1.setIsbn("9781449331818");
          collectionOfIspn2.setIsbn("9781593275846");

//          ArrayList<CollectionOfIspn> collectionOfIspnsArry = new ArrayList<>();
//
//          collectionOfIspnsArry.add(collectionOfIspn);
//          collectionOfIspnsArry.add(collectionOfIspn1);
//          collectionOfIspnsArry.add(collectionOfIspn2);
        AddListOfBooks addListOfBooks = new AddListOfBooks();
        addListOfBooks.setUserId("7a719a81-e0db-4e9e-9273-80ee3e4843fd");
//        addListOfBooks.setCollectionOfIsbns(collectionOfIspnsArry);
        addListOfBooks.addISBNItem(collectionOfIspn);
        addListOfBooks.addISBNItem(collectionOfIspn1);
        addListOfBooks.addISBNItem(collectionOfIspn2);


        Response response =
                given()//requesti hazirlandi .
                        .spec(specification)
                        .contentType(ContentType.JSON)
                        .basePath("BookStore/v1/Books").
                        body(addListOfBooks).
                        auth().oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IkJlZ3VtIiwicGFzc3dvcmQiOiJDZXRlcjRsNCEuIiwiaWF0IjoxNjcwNDIxNTgwfQ.o_c4_ECZtfA-zKld_j6pNEQwPmjaLcHpAWZB_YKAMe4").
                when()//request yapiliyor .
                        .post().
                then()
                        .log().all()
                        .extract().response();


        AddlistOfBooksResponse resp = response.as(AddlistOfBooksResponse.class);
        Assert.assertEquals(response.getStatusCode(),201);
      //  Assert.assertTrue(resp.getCollectionOfIsbns().);
//        Assert.assertEquals(resp.getCollectionOfIsbns(),response.getC);
    }
    }
