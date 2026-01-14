package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Tget {


    @Test
    public void getee()
    {
        given().when().get("https://api.restful-api.dev/objects").then().assertThat()
                .statusCode(200);



        given().when().get("https://api.restful-api.dev/objects/10").then().assertThat()
                .statusCode(200);


    }

}



