import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import java.util.HashMap;
import java.util.Map;

public class Tests_POST {

	//@Test
	public void Post_1() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
//	map.put("name", "Nitish");
//	map.put("job", "Tester");
//	
//	System.out.println(map);
	
	JSONObject request = new JSONObject(map);
	
	request.put("name", "Nitish");
	request.put("job", "Tester");
	
	System.out.println(request);
	System.out.println(request.toJSONString());
	
	given()
	.header("Content-Type", "application/json")
	.contentType(ContentType.JSON).accept(ContentType.JSON)
	.body(request.toJSONString())
	.when()
	.post("https://reqres.in/api/users")
	.then()
	.statusCode(201);
		
		
	}
	
	//@Test
	public void Put_2() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
//	map.put("name", "Nitish");
//	map.put("job", "Tester");
//	
//	System.out.println(map);
	
	JSONObject request = new JSONObject(map);
	
	request.put("name", "Nitish");
	request.put("job", "Tester");
	
	System.out.println(request);
	System.out.println(request.toJSONString());
	
	given()
	.header("Content-Type", "application/json")
	.contentType(ContentType.JSON).accept(ContentType.JSON)
	.body(request.toJSONString())
	.when()
	.put("https://reqres.in/api/users/2")
	.then()
	.statusCode(200)
	.log().all();		
		
	}
	
	//@Test
	public void Patch_3() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
//	map.put("name", "Nitish");
//	map.put("job", "Tester");
//	
//	System.out.println(map);
	
	JSONObject request = new JSONObject(map);
	
	request.put("name", "Nitish");
	request.put("job", "Developer");
	
	System.out.println(request);
	System.out.println(request.toJSONString());
	
	given()
	.header("Content-Type", "application/json")
	.contentType(ContentType.JSON).accept(ContentType.JSON)
	.body(request.toJSONString())
	.when()
	.patch("https://reqres.in/api/users/2")
	.then()
	.statusCode(200)
	.log().all();		
		
	}
	@Test
	public void Delete_4() {
		
		Map<String, Object> map = new HashMap<String, Object>();
		
//	map.put("name", "Nitish");
//	map.put("job", "Tester");
//	
//	System.out.println(map);
	

	when()
	.delete("https://reqres.in/api/users/2")
	.then()
	.statusCode(204)
	.log().all();		
		
	}
	
}
