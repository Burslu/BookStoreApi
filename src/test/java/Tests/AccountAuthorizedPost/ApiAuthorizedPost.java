package Tests.AccountAuthorizedPost;

import Pojo.Authorized.RequestAuthorized;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiAuthorizedPost {

    @Test

    public void Authorized(){

        RequestSpecification specification = new RequestSpecBuilder().setBaseUri("https://bookstore.toolsqa.com/").build();

        RequestAuthorized requestAuthorized = new RequestAuthorized();

        requestAuthorized.setUserName("Begum");
        requestAuthorized.setPassword("Ceter4l4!.");

        Response response =
                given()//requesti hazirlandi .
                        .spec(specification)
                        .contentType(ContentType.JSON)
                        //.accept("*/*")
                        .basePath("Account/v1/Authorized")
                        .body(requestAuthorized).

                when()//request yapiliyor .
                        .post().
                then()
                        .log().all()
                        .extract().response();
        Assert.assertEquals(response.getStatusCode(),200);
        Assert.assertEquals(response.asString(),"true");

//userId = 7a719a81-e0db-4e9e-9273-80ee3e4843fd
//"token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IkJlZ3VtIiwicGFzc3dvcmQiOiJDZXRlcjRsNCEuIiwiaWF0IjoxNjcwMjY0MzA0fQ.mfQgSj-5niIoZi6dHXyTfAxwNKJmoqtlE3amPyIk7qQ",

    }
    }

