package Trytofixwrongschema;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.module.
        jsv.JsonSchemaValidator.*;


public class Fix1 {
//api:
    //https://jsonplaceholder.typicode.com/users/1


//response:
//    {
//        "id": 1,
//            "name": "Leanne Graham",
//            "username": "Bret",
//            "email": "Sincere@april.biz",
//            "address": {
//        "street": "Kulas Light",
//                "city": "Gwenborough"
//    }
//    }


//WRONG JSON SCHEMA:
    //{
    //  "$schema": "http://json-schema.org/draft-07/schema#",
    //  "type": "object",
    //  "required": ["id", "name", "phone"],
    //  "properties": {
    //    "id": {
    //      "type": "string"
    //    },
    //    "name": {
    //      "type": "number"
    //    },
    //    "email": {
    //      "type": "number"
    //    }
    //  }
    //}


    @Test
    public void geTest() {

        given().when().get("https://jsonplaceholder.typicode.com/users/1")
                .then().statusCode(200).body(matchesJsonSchemaInClasspath("ab1.json"));











    }


}
