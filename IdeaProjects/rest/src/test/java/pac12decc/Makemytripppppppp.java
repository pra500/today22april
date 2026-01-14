package pac12decc;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Makemytripppppppp {

    @Test
    public void  egeTest()
    {

        given().when().get("https://dummy-json.mock.beeceptor.com/continents")
                .then().statusCode(200).log().all();


    }
}
