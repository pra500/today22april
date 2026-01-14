package pac12dec;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;

public class Jsonschemaaaa2222 {

    @Test
    public void dsftestTest() {

        Response response =
                RestAssured.given().when().get("https://jsonplaceholder.typicode.com/posts/1/comments/");
        System.out.println(response.getCookies());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeaders());
        System.out.println(response.getStatusCode());

        System.out.println(response.getHeader("Content-Type"));



    }
}
