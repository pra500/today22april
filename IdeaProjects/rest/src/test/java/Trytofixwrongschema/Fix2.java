package Trytofixwrongschema;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.*;


public class Fix2 {

    @Test
    public void testcdd1Test() {

        given().when().get("https://jsonplaceholder.typicode.com/users").then().assertThat().statusCode(200)
                .body(matchesJsonSchemaInClasspath("ab2.json"));


    }
}
