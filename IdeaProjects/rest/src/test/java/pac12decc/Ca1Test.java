package pac12decc;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ca1Test {
    @Test
    public void teDDsTest(){


        Response response= RestAssured.given().when().get("https://www.wanderfly.in/blogs/");
        int responsecode=response.getStatusCode();

        Assert.assertEquals(responsecode, 200);









    }
}
