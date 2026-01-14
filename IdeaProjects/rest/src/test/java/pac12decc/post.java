package pac12decc;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class post {

    @Test
    public void tTest(){



        given().when().get("https://fake-json-api.mock.beeceptor.com/users").then().assertThat().log()
                .all();




    }
}
