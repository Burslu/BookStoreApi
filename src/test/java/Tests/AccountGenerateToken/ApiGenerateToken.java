package Tests.AccountGenerateToken;

import Pojo.CreateUserAccountPost.PojoRequestUserAccount;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ApiGenerateToken {
    @Test
            public void GenerateToken(){
    RequestSpecification specification = new RequestSpecBuilder().setBaseUri("https://bookstore.toolsqa.com/").build();

    PojoRequestUserAccount pojo = new PojoRequestUserAccount();

    pojo.setUserName("Begum");
    pojo.setPassword("Ceter4l4!.");

    Response response =

            given()//requesti hazirlandi .
                    .spec(specification)
                    .contentType(ContentType.JSON)
                    //.accept("*/*")
                    .basePath("Account/v1/GenerateToken")
                    .body(pojo).

            when()//request yapiliyor .
                    .post().
            then()
                    .log().all()
                    .assertThat().statusCode(200)
                    .extract().response();
//eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IkJlZ3VtIiwicGFzc3dvcmQiOiJDZXRlcjRsNCEuIiwiaWF0IjoxNjcwNDIxNTgwfQ.o_c4_ECZtfA-zKld_j6pNEQwPmjaLcHpAWZB_YKAMe4 son dogru token bu 12  07 2022
    }
}
