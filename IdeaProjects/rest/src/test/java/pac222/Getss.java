package pac222;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Getss {

    @Test
    public void getsTest() {


        given().when().get("https://platforms.makemytrip.com/contents/eb3735d5-32a7-49f9-9fef-11946023e07a").then().statusCode(200)
                .log().all();






    }
}


