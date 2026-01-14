package pac1;

import org.apache.commons.compress.harmony.unpack200.IMatcher;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;



public class JsonSchemaValidation {

    /*
    //data:

    {
        "title": "New Blog Post",
            "content": "This is the content of the blog post...",
            "publishedDate": "2023-08-25T15:00:00Z",
            "author": {
        "username": "authoruser",
                "email": "author@example.com"
    },
        "tags": ["Technology", "Programming"]
    }


    //schema:

    {
        "$id": "https://example.com/address.schema.json",
            "$schema": "https://json-schema.org/draft/2020-12/schema",
            "description": "An address similar to http://microformats.org/wiki/h-card",
            "type": "object",
            "properties": {
        "postOfficeBox": {
            "type": "string"
        },
        "extendedAddress": {
            "type": "string"
        },
        "streetAddress": {
            "type": "string"
        },
        "locality": {
            "type": "string"
        },
        "region": {
            "type": "string"
        },
        "postalCode": {
            "type": "string"
        },
        "countryName": {
            "type": "string"
        }
    },
        "required": [ "locality", "region", "countryName" ],
        "dependentRequired": {
        "postOfficeBox": [ "streetAddress" ],
        "extendedAddress": [ "streetAddress" ]
    }
    }

*/




    @Test
    public void validateJsonSchemaTest() {

//        given().when().get("https://api.restful-api.dev/objects").then().assertThat()
//                .statusCode(200)
//                .body(matchesJsonSchemaInClasspath("product-schema.json"));
//

















        given().when().get("https://api.restful-api.dev/objects").then().assertThat()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("product-schema.json"));










    }
}
