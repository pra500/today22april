package pac1;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import javax.crypto.spec.PSource;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Assertions1 {

    public static void main(String[] args) {

        given().header("Content-Type", "application/json")
                .auth().basic("", "")
                .when().get("https://api.restful-api.dev/objects")
                .then().statusCode(200);


        given().header("Content-Type", "application/json")
                .auth().basic("", "")
                .when().get("https://api.restful-api.dev/objects")
                .then().assertThat().
                statusCode(200).body("[0].id", equalTo("1"));


        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[1].name", containsString("Apple iPhone 12 Mini, 256GB, Blue"));


        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[1].name", notNullValue());


        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[2].name", notNullValue());

        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
                .body("[1].name", containsString("Apple iPhone 12 Mini, 256GB, Blue"));


//        given().when().get("https://api.restful-api.dev/objects").then().assertThat().statusCode(200)
//                .body(
//


        Response response = RestAssured.given().when().get("https://jsonplaceholder.typicode.com/albums");

        System.out.println(response.getSessionId());

        if (response.getSessionId() == null) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        System.out.println(response.getCookies());
        System.out.println(response.getBody());
        System.out.println(response.getStatusLine());
        System.out.println(response.getDetailedCookies());
        System.out.println(response.getStatusLine());


    }
}