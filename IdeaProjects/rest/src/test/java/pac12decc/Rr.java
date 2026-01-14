package pac12decc;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Rr {
    public static void main(String[] args) {

        Response response=RestAssured.
        given().when().get("https://dummy-json.mock.beeceptor.com/posts");
       String s= response.getStatusLine();
        System.out.println(s);
    }
}
