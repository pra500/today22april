package pac222;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

import static io.restassured.module.jsv.JsonSchemaValidator.*;


public class Schemaaaaaa {


   //     @Test
    public void getsTest() {

        given().when().get().then().assertThat()
                .statusCode(200).body(matchesJsonSchemaInClasspath("g.json"));

    }




    @Test
    public void getesTest() {



        given().when().get("https://opensource-demo.orangehrmlive.com/web/dist/img/blob.svg");

    }






}
