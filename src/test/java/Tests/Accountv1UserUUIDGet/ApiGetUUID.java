package Tests.Accountv1UserUUIDGet;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiGetUUID {
    @Test

    public void getuseruuid(){

        RequestSpecification specification = new RequestSpecBuilder().setBaseUri("https://bookstore.toolsqa.com/").build();
        Response response =
                given()//requesti hazirlandi .
                        .spec(specification)
                        .contentType(ContentType.JSON)
                        //.accept("*/*")
                        .basePath("Account/v1/User/7a719a81-e0db-4e9e-9273-80ee3e4843fd").
                        auth().oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IkJlZ3VtIiwicGFzc3dvcmQiOiJDZXRlcjRsNCEuIiwiaWF0IjoxNjcwNDIxNTgwfQ.o_c4_ECZtfA-zKld_j6pNEQwPmjaLcHpAWZB_YKAMe4").
                        when()//request yapiliyor .
                        .get().
                        then()
                        .log().all()
                        .extract().response();
        Assert.assertEquals(response.getStatusCode(),200);

    }
}
