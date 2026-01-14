package pac12decc;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;


public class Restassertion {
    public static void main(String[] args) {
//
//given().when().get("https://jsonplaceholder.typicode.com/users/1").then().assertThat()
//        .statusCode(200).body("id",equalTo(1));
//
//
//
//
//        given().when().get("https://jsonplaceholder.typicode.com/users/1").then().assertThat()
//                .statusCode(200).body("name",equalTo("Leanne Graham"));
//
//
//
//






        given().accept(ContentType.JSON).when().get("");






    }
}
