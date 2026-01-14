package pac12dec;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class T5 {

    public static void main(String[] args) {

        given().when().get("https://dummy-json.mock.beeceptor.com/todos").then().assertThat().statusCode(200).log().all();


        Response response= RestAssured.given().when().get();
      int t =response.getStatusLine().compareTo("HTTP/1.1 200 OK");
        System.out.println(t);
        //wrong json schema:







    }
}
