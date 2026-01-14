package pac12decc;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class Get55 {


    public static void main(String[] args) {

        given().contentType("application/json").
                when().get("https://jsonplaceholder.typicode.com/users/1").then().assertThat().statusCode(200);


        given().contentType("application/json").
                when().get("https://jsonplaceholder.typicode.com/users/1").then().assertThat().statusCode(200).log().all();


        Response response= RestAssured.given().when().get("https://dummy-json.mock.beeceptor.com/posts");

        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());







//
//
//        given().contentType("application/json").
//                when().get("https://reqres.in/api/users/2").then()
//                .assertThat().statusCode(200).log().all().body(matchesJsonSchemaInClasspath("fg.json"));
//
//









//
//        given().when().get("https://jsonplaceholder.typicode.com/users/1").then().assertThat().statusCode(200)
//                .body(

    }



    





}
