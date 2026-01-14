package pac1;


import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Assertionsinsideassertions {

    @Test
    public void AsssTest() {


        given().when().get("https://dummy-json.mock.beeceptor.com/posts")
                .then().statusCode(200).body("", hasSize(greaterThan(8)));


    }




    @Test
    public void Asss1Test(){

            given().when().get("https://dummy-json.mock.beeceptor.com/posts")
                    .then().statusCode(200).body("",hasSize(greaterThanOrEqualTo(10)));

    }


    @Test
    public void Asss2Test(){

        given().when().get("https://dummy-json.mock.beeceptor.com/posts")
                .then().statusCode(200).body("",hasSize(lessThan(20)));
    }









    @Test
    public void Asss33Test(){

        given().when().get("https://dummy-json.mock.beeceptor.com/posts")
                .then().statusCode(200).body("",hasSize(lessThanOrEqualTo(10)));
    }




}
