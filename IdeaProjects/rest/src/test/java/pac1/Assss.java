package pac1;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.checkerframework.checker.index.qual.LessThan;
import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Assss {


    @Test
    public void tXTest(){
given().when().get("https://dummy-json.mock.beeceptor.com/posts");



//response.getCookies();




    }



    @Test
    public void tXswTest(){

        Response response= RestAssured.given().when().get("https://dummy-json.mock.beeceptor.com/posts");
        System.out.println(response.getHeaders());
        //response.getHeaders().




    }

    @Test
    public void tXsTest(){

        Response response= RestAssured.given().when().get("https://dummy-json.mock.beeceptor.com/posts");
        System.out.println(response.getBody());


    }
    @Test
    public void t222XTest(){


        Response response= RestAssured.given().when().get("https://dummy-json.mock.beeceptor.com/posts");
        System.out.println(response.getCookies());



    } @Test
    public void tssXTest(){



        given().when().get("https://dummy-json.mock.beeceptor.com/posts")
                .then().assertThat().statusCode(200).log().all();




    }
    @Test
    public void t2XTest(){

        given().when().get("https://dummy-json.mock.beeceptor.com/posts")
                .then().assertThat().statusCode(200).log().all().body("[0].userId", equalTo(1));




    }



}
