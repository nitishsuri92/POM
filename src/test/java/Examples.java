import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class Examples {

	//@Test
	public void TestGET(){
		
		baseURI = "http://localhost:3000/";
		
		given()
		.param("name", "Automation")
		.get("/subjects")
		.then()
		.statusCode(200)
		.log().all();
		
		
	}
	
		//@Test
		public void TestPOST(){
			
			JSONObject request = new JSONObject();
			
			request.put("firstName", "Rakesh");
			request.put("lastName", "Suri");
			request.put("subjectId", 1);
			
			baseURI = "http://localhost:3000/";
			
			given()
			.header("Content-Type", "application/json")
			.contentType(ContentType.JSON).accept(ContentType.JSON)
			.body(request.toJSONString())
			.when()
			.post("/users")
			.then()
			.statusCode(201)
			.log().all();	
			
		}
		
				//@Test
				public void TestPatch(){
					
					JSONObject request = new JSONObject();
					
					request.put("lastName", "Suri");
				
					baseURI = "http://localhost:3000/";
					
					given()
					.header("Content-Type", "application/json")
					.contentType(ContentType.JSON).accept(ContentType.JSON)
					.body(request.toJSONString())
					.when()
					.patch("/users/4")
					.then()
					.statusCode(200)
					.log().all();	
					
				}
				
				@Test
				public void TestPut(){
					
					JSONObject request = new JSONObject();
					
					request.put("firstName", "Rakesh");
					request.put("lastName", "Suri");
					request.put("subjectId", 1);
					
					baseURI = "http://localhost:3000/";
					
					given()
					.header("Content-Type", "application/json")
					.contentType(ContentType.JSON).accept(ContentType.JSON)
					.body(request.toJSONString())
					.when()
					.put("/users/4")
					.then()
					.statusCode(200)
					.log().all();	
					
				}
				
				//@Test
				public void TestDelete(){
					
					baseURI = "http://localhost:3000/";
					
					given()
					.when()
					.delete("/users/4")
					.then()
					.statusCode(200)
					.log().all();	
					
				}
}
