package pac12decc;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class T1 {


    @BeforeMethod
    public void setup() {

        given().when().get("https://jsonplaceholder.typicode.com/posts/1/comments/").then()
                .statusCode(200);
    }


    @AfterMethod
    public void tearDown() {

        given().when().get("https://jsonplaceholder.typicode.com/posts/1/comments/").then()
                .statusCode(200);

    }

    @Test
    public void T1dddTest() {
        given().when().get("https://jsonplaceholder.typicode.com/posts/1/comments/").then()
                .assertThat()
                .statusCode(200);


    }

    @Test
    public void T1dddddTest() {
        given().when().get("https://jsonplaceholder.typicode.com/posts/1/comments/").then()
                .assertThat()
                .statusCode(200).log().all().body("[0].postId", equalTo(1));

        given().when().get("https://fake-json-api.mock.beeceptor.com/companies").then()
                .assertThat()
                .statusCode(200).body("[0].id", equalTo(1));
//
//
//        given().when().get("https://fake-json-api.mock.beeceptor.com/companies").then()
//                .assertThat()
//                .statusCode(200).body("[0].name", equalTo("Heller and Sons"));


        given().when().get("https://fake-json-api.mock.beeceptor.com/companies").then()
                .assertThat()
                .statusCode(200).body("[0].zip", equalTo(51967));


        given().when().get("https://fake-json-api.mock.beeceptor.com/companies").then()
                .assertThat()
                .statusCode(200).body("[0].marketCap", equalTo(8617222205L));


    }
}
