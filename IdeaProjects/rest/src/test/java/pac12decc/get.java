package pac12decc;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class get

{
    @Test
    public void testGetTest()
    {

        System.out.println("vvvavv");

        given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat()
                .statusCode(200).log().all();






    }



}
