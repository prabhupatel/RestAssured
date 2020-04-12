package restassuredTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class Demo1_GET {

	@Test
	public void getWeatherDetais() {
		
		given()
		     .when()
		          .get("https://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		     .then()
		         .statusCode(200)
		         .statusLine("HTTP/1.1 200 OK")
		         .assertThat().body("City", equalTo("Hyderabad"))
		    	.header("Content-Type","application/json");
	}
	
	
	
	
	
}
