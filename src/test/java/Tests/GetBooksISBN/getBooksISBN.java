package Tests.GetBooksISBN;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class getBooksISBN {

    //Kitaplari kullaniciya ekledik bu asamada kitaplarin eklenip eklenmedigini kontrol edecegiz (get)


    @Test

    public void getISBNBooksKontrol(){

        RequestSpecification specification = new RequestSpecBuilder().setBaseUri("https://bookstore.toolsqa.com/").build();



        given()//requesti hazirlandi .
                .spec(specification)
                .contentType(ContentType.JSON)
                //.accept("*/*")
                .basePath("BookStore/v1/Book")
                .queryParam("ISBN", "9781449325862")
                .//queryParam("ISBN","9781449331818").
            //    .queryParam("ISBN=9781593275846").

        when()//request yapiliyor .
                .get().
        then()
                .log().all()
                .assertThat().statusCode(200)
                .extract().response();


    }
}
