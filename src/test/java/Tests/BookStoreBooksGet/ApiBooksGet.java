package Tests.BookStoreBooksGet;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiBooksGet {
@Test

        public void UserUUIDGet(){
    RequestSpecification specification = new RequestSpecBuilder().setBaseUri("https://bookstore.toolsqa.com/").build();


    Response response =
            given()//requesti hazirlandi .
                    .spec(specification)
                    .contentType(ContentType.JSON)
                    .basePath("BookStore/v1/Books").

            when()//request yapiliyor .
                    .get().
            then()
                    .log().all()
                    .extract().response();
         Assert.assertEquals(response.getStatusCode(),200);
}
}



