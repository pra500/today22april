package pac1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Authentication1 {

    @Test
    public void teSSddcSst2(){

        //Basic Authentication
given().auth().basic("postman", "password").when()
        .get("https://postman-echo.com/basic-auth")
        .then().assertThat().statusCode(200);


        //Preemptive Basic Authentication
        given().auth().preemptive().basic("postman","password").when()
                .get("https://postman-echo.com/basic-auth").then().assertThat().statusCode(200);


        //Digest Authentication
        given().auth().digest("postman","password").when()
                .get("https://httpbin.org/digest-auth/auth/postman/password").then().assertThat().statusCode(200);

    }
}
