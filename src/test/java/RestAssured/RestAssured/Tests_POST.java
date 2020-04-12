package RestAssured.RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class Tests_POST {
	
//@Test
public void test1_post() {
//		
//		Map<String, Object> map =new HashMap<String, Object>();
//		
//		map.put("name", "Madhu");
//		map.put("job", "student");
//		System.out.println(map);
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Madhu");
		request.put("job", "student");
		
		System.out.println(request);
		
		given().
		header("Content-Type","application/jason").contentType(ContentType.JSON).
		body(request.toJSONString()).
		when().post("https://reqres.in/api/users").
		then().statusCode(201);
	}

@Test
public void test2_put() {
//		
//		Map<String, Object> map =new HashMap<String, Object>();
//		
//		map.put("name", "Madhu");
//		map.put("job", "student");
//		System.out.println(map);
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Madhu");
		request.put("job", "student");
		
		System.out.println(request);
		
		given().
		header("Content-Type","application/jason").contentType(ContentType.JSON).
		body(request.toJSONString()).
		when().put("https://reqres.in/api/users/2").
		then().statusCode(200).
		       log().all();
	}





}