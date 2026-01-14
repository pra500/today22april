package pac12decc;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Schemaddd {

    @Test
    public void tesFFtTest(){

        given().when().get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200).assertThat().body(matchesJsonSchemaInClasspath("user-schema.json")
                );




    }
}


