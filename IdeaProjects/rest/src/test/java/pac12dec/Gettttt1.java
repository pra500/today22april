package pac12dec;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.*;


public class Gettttt1

{
    @Test
    public void testGetTest()
    {

//        System.out.println("vvvavv");
//
//        given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat()
//                .statusCode(200).log().all();


//
//        given().when().get("https://api.restful-api.dev/objects/7").then().assertThat().statusCode(200).log().all();
//
//        Response response=
//
//        RestAssured.given().get("https://api.restful-api.dev/objects/7");
//
//        System.out.println( response.getHeaders());
//
//
//        given().when().get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")
//                .then().assertThat().statusCode(200);
//

given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat().statusCode(200);


given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat().statusCode(200).log().all();



    }



}
