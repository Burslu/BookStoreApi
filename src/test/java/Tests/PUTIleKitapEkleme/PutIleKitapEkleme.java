package Tests.PUTIleKitapEkleme;

import Pojo.PutIleKitapEkleme.Request;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PutIleKitapEkleme {

    @Test

    public void PutKitapEkleme(){

        RequestSpecification requestSpecification = new RequestSpecBuilder().setBaseUri("https://bookstore.toolsqa.com/").build();
        Request request = new Request();
        request.setUserId("7a719a81-e0db-4e9e-9273-80ee3e4843fd");
        request.setIsbn("9781491950296");
        Response response =
            given()//requesti hazirlandi .
                        .spec(requestSpecification)
                        .contentType(ContentType.JSON)
                        .basePath("BookStore/v1/Books/9781593277574")
                        .auth().oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IkJlZ3VtIiwicGFzc3dvcmQiOiJDZXRlcjRsNCEuIiwiaWF0IjoxNjcwNDIxNTgwfQ.o_c4_ECZtfA-zKld_j6pNEQwPmjaLcHpAWZB_YKAMe4")
                        .body(request).

            when()//request yapiliyor .
                        .put().
            then()
                        .log().all()
                        .extract().response();
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
