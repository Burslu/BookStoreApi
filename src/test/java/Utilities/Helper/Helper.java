package Utilities.Helper;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Helper {


    public static Response GetTestWithToken(String url, String token) {

        Response response =
                given()
                        .accept("application/json")
                        .contentType(ContentType.JSON)
                        .auth().oauth2(token).
                when()
                        .get(url).
                then()
                        .log()
                        .all()
                        .extract().response();
        return response;
    }
    public static Response postTestWithToken(String url, Object object, String token) {

        Response response =
                given()
                        .accept("application/json")
                        .contentType(ContentType.JSON)
                        .auth().oauth2(token)
                        .body(object).
                when()
                        .post(url).
                then()
                        .log()
                        .all()
                        .extract().response();
        return response;
    }
    public static void PatchTestWithToken(String url, Object object, String token) {

        Response response =
                given()
                        .accept("application/json")
                        .contentType(ContentType.JSON)
                        .auth().oauth2(token)
                        .body(object).
                when()
                        .patch(url).
                then()
                        .log()
                        .all()
                        .extract().response();
    }

    public static void PutTestWithToken(String url, Object object, String token) {

        Response response =
                given()
                        .accept("application/json")
                        .contentType(ContentType.JSON)
                        .auth().oauth2(token)
                        .body(object).
                when()
                        .put(url).
                then()
                        .log()
                        .all()
                        .extract().response();
    }

    public static void DeleteTestWithToken(String url,  String token) {

        Response response =
                given()
                        .accept("application/json")
                        .contentType(ContentType.JSON)
                        .auth().oauth2(token).

                when()
                        .delete(url).
                then()
                        .log()
                        .all()
                        .extract().response();
    }
    public static Response getAfadHelp(String url, String start , String end){


        return given()
               // .accept("application/json")
                .contentType(ContentType.JSON)
                .accept("*/*")
                .queryParam("start",start)
                .queryParam("end",end)
                .queryParam("minrad","50000")
                .queryParam("maxrad","100000")
                .queryParam("lon","40")
                .queryParam("lat","33").
        when()
                .get(url).
        then()
                .log()
                .all()
                .extract().response();
}
    public static Response TrendyolGetHelper(String url, int _quantity ){


        return given()
                // .accept("application/json")
                .contentType(ContentType.JSON)
                .accept("*/*")
                .queryParam("_quantity",_quantity).
        when()
                .get(url).
        then()
                .log()
                .all()
                .extract().response();

    }
    public static Response TrendyolGetHelperText(String url, int _quantity, int _characters){


        return given()
                // .accept("application/json")
                .contentType(ContentType.JSON)
                .accept("*/*")
                .queryParam("_quantity",_quantity)
                .queryParam("_characters",_characters).
                when()
                .get(url).
                then()
                .log()
                .all()
                .extract().response();

    }
    public static Response TrendyolContentTypeLenght(String url, int _quantity, int _characters){


        return
       given()
                // .accept("application/json")
                .contentType(ContentType.JSON)
                .accept("*/*")
                .queryParam("_quantity",_quantity)
                .queryParam("_characters",_characters).
        when()
                .get(url).
        then()
                .log()
                .all()
                .extract().response();
    }
    public static Response Trendyolproduct(String url, int _quantity, int _taxes, String _categories_type){


        return
                given()
                        // .accept("application/json")
                        .contentType(ContentType.JSON)
                        .accept("*/*")
                        .queryParam("_quantity",_quantity)
                        .queryParam("_taxes",_taxes)
                        .queryParam("_categories_type",_categories_type).
                when()
                        .get(url).
                then()
                        .log()
                        .all()
                        .extract().response();
    }

}


