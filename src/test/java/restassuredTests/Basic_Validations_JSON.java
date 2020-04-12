package restassuredTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
//import static org.hamcrest.core.IsEqual.equalTo;

//import org.hamcrest.collection.HasItemInArray;

/* 
1)Test status code
2)Log Response
3)Verifying Single content in response body
4)Verifying Multiple content in response body
5)Setting parameters & headers
 */

public class Basic_Validations_JSON {

	// 1)Test status code
	
	@Test(priority = 1)
	public void teststatuscode() {
		
		given()
		
		.when().get("http://jsonplaceholder.typicode.com/posts/5")
		
		.then().statusCode(200);
		
		//For Detail information test response)
		//.log().all();
		
	}
	//2)Log Response
	@Test(priority = 2)
	public void testlogresponse() {
		
given()
		.when().get("http://www.groupkt.com/country/get/iso2code/IN")
		
		.then().statusCode(200)
		.log().all();
		
	}
	//3)Verifying Single content in response body
	@Test(priority = 3)
	public void testingsinglecontain() {
		
         given()
		.when().get("http://www.groupkt.com/country/get/iso2code/IN")
		.then().statusCode(200)
		        .body("RestResponse.result.name", equalTo("India"));
	}
	
	//4)Verifying Multiple content in response body
	@Test(priority = 4)
	public void testingMultipleContains() {
		
         given()
		.when().get("http://www.groupkt.com/country/get/all")
		.then()
		        .statusCode(200)
		        .body("RestResponse.result.name",hasItems("India","Australia"));
	}
	//5)Setting parameters & headers
	
	@Test(priority = 5)
	public void testingParamsandHeaders() {
		
         given()
         .param("MyName", "Palak")
         .header("MyHeader","Indian")
		.when().get("http://www.groupkt.com/country/get/iso2code/IN")
		.then().statusCode(200);
		        
	}
	
}
