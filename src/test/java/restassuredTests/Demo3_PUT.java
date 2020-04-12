package restassuredTests;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class Demo3_PUT {

	public static HashMap map = new HashMap();
	
	String empName = RestUtiles.empName();
	String empSal = RestUtiles.empSal();
	String empAge = RestUtiles.empAge();

	int emp_id=10;
	
	
	@BeforeClass
	public void putData() {
		
		map.put("name", empName);
		map.put("salalry", empSal);
		map.put("age", empAge);
		
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/update/"+emp_id;
	}
		
	@Test
	public void testPUT()
		{
	given().contentType(ContentType.JSON)
	.body(map)
	.when().put()
	.then().statusCode(200)
	.log().all();
			
			
	}
	
	
	
	
	
	
	
	
	
}
