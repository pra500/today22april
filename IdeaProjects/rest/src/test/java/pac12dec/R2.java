package pac12dec;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class R2 {


    @Test
    public void dsftestTest() {

        Response response = given().when().get("https://www.opencart.com/index.php?route=cms/feature");
        System.out.println(response.getCookies());
        System.out.println(response.getDetailedCookies());


//response.getDetailedCookies();


    }
}

