package pac12decc;

import static io.restassured.RestAssured.given;

public class Geeee {
    public static void main(String[] args)
    {
        given().when().get("https://jsonplaceholder.typicode.com/posts/1");


        //   https://fake-json-api.mock.beeceptor.com/users


        given().when().get("https://api.restful-api.dev/objects/7").then().assertThat().statusCode(200).log().all();
    }
}
