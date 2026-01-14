package pac12decc;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class Jsonschemaa99 {


//
//    {
//        "id": 1,
//            "name": "Leannesddd Graham",
//            "username": "Bret",
//            "email": "Sincere@april.biz",
//            "address": {
//        "street": "Kulas Light",
//                "city": "Gwenborough"
//    }
//    }
//


    //get call:   https://jsonplaceholder.typicode.com/users/1


    @Test
    public void gTest() {

        given().when().get("https://jsonplaceholder.typicode.com/users/1").then().assertThat().statusCode(200)
                .body(matchesJsonSchemaInClasspath("ee.json"));

    }


}
