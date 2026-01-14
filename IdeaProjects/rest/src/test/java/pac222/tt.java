package pac222;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class tt {


    @Test
    public void tescdtTest(){


        given().when()
                .get("https://fake-json-api.mock.beeceptor.com/users").then().assertThat().statusCode(200);




        }


}
