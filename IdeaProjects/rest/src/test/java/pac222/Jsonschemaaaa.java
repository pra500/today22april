package pac222;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import static org.hamcrest.Matchers.*;




public class Jsonschemaaaa {
    @Test
    public void testJsonssSchemaaaaTest() {

        given().when().get("https://reqres.in/api/users/2").then().assertThat().statusCode(403)
                .body(matchesJsonSchemaInClasspath("user-schema.json"));

//other practice set:




    }

}
