package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

public class tY {

    @Test
    public void test() {

        given().when().get("https://fake-json-api.mock.beeceptor.com/companies")
                .then().statusCode(200).body("[0].id", equalTo(1));


    }

}


