package pac12decc;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Te {

    @Test
    public void dsftestTest() {


        given().contentType("application/json")
                .when().get("https://fake-json-api.mock.beeceptor.com/users")
                .then().assertThat()
                .statusCode(200);


    }

}
