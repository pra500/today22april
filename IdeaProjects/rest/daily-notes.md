        json schema code practice
pom login class again chk
base calss again chk
    




    

my imp notes:
i can sayalso, required fields must be present in response as well as in properties -correct 
“Any field marked as required must exist in the API response, and as per good practice standard we always define it in the properties section to validate its data type.”







        

    
//  https://reqres.in/api/users/2

user-schema.json






**************************
study notes:
schema validation only happens for 200 (200, 201, 204) only not for any other status code







//mine:

{
"$schema": "http://json-schema.org/draft-07/schema#",
"type": "object",
"required": ["id", "name", "phone"],
"properties": {
"id": {
"type": "integer"
},
"name": {
"type": "string"
},
"phone": {
"type": "string"
},
"email": {
"type": "string",
"format": "email"
},
"additionalProperties": true
}
}






mvn -Dtest=Ca1Test test











