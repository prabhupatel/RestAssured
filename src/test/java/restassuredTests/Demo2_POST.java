package restassuredTests;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.core.IsEqual.equalTo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Demo2_POST {

	
	public static HashMap map = new HashMap();
	
@BeforeClass
public void postdata() {
	
	map.put("FirstName", RestUtiles.getFirstName());
	map.put("LastName", RestUtiles.getFirstName());
	map.put("UserName", RestUtiles.getFirstName());
	map.put("Password", RestUtiles.getFirstName());
	map.put("Email", RestUtiles.getFirstName());

	RestAssured.baseURI="http://restapi.demoqa.com/customer/register";
	RestAssured.basePath ="/register";
	
}
	@Test
	public void testPost() {
		
		given()
		       .contentType(ContentType.JSON).body(map)
		
		.when()
		       .post()
		
		.then()
		       .statusCode(201)
		       .and()
		       .body("SuccessCode",equalTo("OPERATION_SUCCESS"))
		       .and()
		       .body("Message", equalTo("Operation completed successfully"));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
