package Tests.DeleteBooksAndUser;

import Pojo.Delete.ResponseDeleteUserAndBooks;
import Utilities.Helper.Helper;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteBooksAndUserApi {
    @Test

    public void DeleteBooks(){

        RequestSpecification requestSpecification = new RequestSpecBuilder().setBaseUri("https://bookstore.toolsqa.com/").build();
       // Request request = new Request();

        Response response =
                given()//requesti hazirlandi .
                        .spec(requestSpecification)
                        .contentType(ContentType.JSON)
                        .basePath("BookStore/v1/Books")
                        .queryParam("UserId","7a719a81-e0db-4e9e-9273-80ee3e4843fd")
                        .auth().oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IkJlZ3VtIiwicGFzc3dvcmQiOiJDZXRlcjRsNCEuIiwiaWF0IjoxNjcwNDIxNTgwfQ.o_c4_ECZtfA-zKld_j6pNEQwPmjaLcHpAWZB_YKAMe4").
                when()//request yapiliyor .
                        .delete().
                then()
                        .log().all()
                        .extract().response();
        Assert.assertEquals(response.getStatusCode(),204);
        Assert.assertEquals(response.getBody().asString(),"");//kitaplarin silindigi dogrulanan Assert
    }

    @Test
    public void DeleteUser(){

        RequestSpecification requestSpecification = new RequestSpecBuilder().setBaseUri("https://bookstore.toolsqa.com/").build();

        ResponseDeleteUserAndBooks responseDeleteUserAndBooks = new ResponseDeleteUserAndBooks();
        Response responseDeleteUser =
                given()//requesti hazirlandi .
                        .spec(requestSpecification)
                        .contentType(ContentType.JSON)
                        .basePath("Account/v1/User/7a719a81-e0db-4e9e-9273-80ee3e4843fd")
                        .auth().oauth2("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IkJlZ3VtIiwicGFzc3dvcmQiOiJDZXRlcjRsNCEuIiwiaWF0IjoxNjcwNDIxNTgwfQ.o_c4_ECZtfA-zKld_j6pNEQwPmjaLcHpAWZB_YKAMe4").

                when()//request yapiliyor .
                        .delete().
                then()
                        .log().all()
                        .extract().response();
        Assert.assertEquals(responseDeleteUser.getStatusCode(),200);
        Assert.assertNull(responseDeleteUserAndBooks.getMessage());





        String GetUserURL = "https://bookstore.toolsqa.com/Account/v1/User/7a719a81-e0db-4e9e-9273-80ee3e4843fd";
        Response response =
                Helper.GetTestWithToken(GetUserURL,"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IkJlZ3VtIiwicGFzc3dvcmQiOiJDZXRlcjRsNCEuIiwiaWF0IjoxNjcwNDIxNTgwfQ.o_c4_ECZtfA-zKld_j6pNEQwPmjaLcHpAWZB_YKAMe4");

        Assert.assertEquals(response.getStatusCode(),401);
    }

//    @Test
//    public void DeleteUserr(){
//eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IkJlZ3VtIiwicGFzc3dvcmQiOiJDZXRlcjRsNCEuIiwiaWF0IjoxNjcwNDIxNTgwfQ.o_c4_ECZtfA-zKld_j6pNEQwPmjaLcHpAWZB_YKAMe4
//
//    }



}
