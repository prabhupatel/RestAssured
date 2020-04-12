package RestAssured.RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;

public class Test01_GET {

	@Test
void test_01() {
	
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
	    System.out.println(response.getStatusLine());
	    System.out.println(response.getHeader("contant-type"));
	    System.out.println(response.getTime());
	    
	    int statusCode = response.getStatusCode();
	    
	    Assert.assertEquals(statusCode, 200);
}
	@Test
void test_02(){
	given().get("").then().statusCode(201);
	
	
}


}

