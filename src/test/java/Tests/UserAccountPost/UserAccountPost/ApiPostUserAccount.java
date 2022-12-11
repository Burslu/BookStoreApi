package Tests.UserAccountPost.UserAccountPost;

import Pojo.GenerateToken.RequestGenerateToken;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiPostUserAccount {


    @Test

    public void userCreatePost(){

        RequestSpecification specification = new RequestSpecBuilder().setBaseUri("https://bookstore.toolsqa.com/").build();

        RequestGenerateToken reqToken = new RequestGenerateToken();
        reqToken.setUserName("Begum");
        reqToken.setPassword("Ceter4l4!.");


        Response response =
        given()//requesti hazirlandi .
                .spec(specification)
                .contentType(ContentType.JSON)
                //.accept("*/*")
                .basePath("Account/v1/User")
                .body(reqToken).

        when()//request yapiliyor .
                .post().
        then()
                .log().all()
                 .assertThat().statusCode(201)
                .extract().response();




    }
}
