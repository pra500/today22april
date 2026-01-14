package pac12decc;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;



public class f {
    public static void main(String[] args) {
//        given()
//                .accept(ContentType.JSON)
//                .when()
//                .get("https://reqres.in/api/users/2")
//                .then()
//                .statusCode(403);




        given()
                .when()
                .get("https://jsonplaceholder.typicode.com/users/1")
                .then()
                .statusCode(200)
                .body("email", equalTo("Sincere@april.biz"));











     

    }




}

