package restassuredTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DELETE {

	@Test
	public void deleteEmpID() {
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/delete/13";
		
		//For store the information
		Response res ;
		
				given()
		
		.when()
		       .delete()
		
		.then()
		        .statusCode(200)
		        .statusLine("HTTP/1.1 200 OK")
		        .log().all()
		        .extract().response();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}


