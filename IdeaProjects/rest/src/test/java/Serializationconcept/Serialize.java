package Serializationconcept;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;


public class Serialize {


    public static void main(String[] args) {

        Student s1 = new Student(22, "Anshu", "qa");

        given()

                .header("Content-Type", "application/json")
                //.contentType("application/json")
                .body(s1)
                .when().post("https://reqres.in/api/users").then().assertThat().statusCode(201)
                .body("name", equalTo("Anshu"));



















    }


}
