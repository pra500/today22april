package pac1;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Assertttttt {

    public static void main(String[] args) {

        //given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat().statusCode(200)
        //.body("[0].title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));


        given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat().statusCode(200)
                .body("title", hasItem("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));


        given().when().get("https://jsonplaceholder.typicode.com/posts").then().assertThat().statusCode(200)
                .body("title", hasItem("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"));





    }


}
