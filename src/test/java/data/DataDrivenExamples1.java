package data;

import static org.hamcrest.CoreMatchers.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.beust.jcommander.Parameter;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;


public class DataDrivenExamples1 extends DataForTests{

	//@Test (dataProvider = "DataForPost")
	public void TestPOST(String firstName, String lastName, int subjectId){

		JSONObject request = new JSONObject();

		request.put("firstName", firstName);
		request.put("lastName", lastName);
		request.put("subjectId", subjectId);

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
	
	@Test(dataProvider = "DataForDelete")
	public void TestDelete(int subjectId){
		
		baseURI = "http://localhost:3000/";
		
		given()
		.when()
		.delete("/users/"+subjectId)
		.then()
		.statusCode(200)
		.log().all();	
		
	}
	
		//@Test()
		@Parameters({"subjectId"})
		public void TestDelete2(int subjectId){
			
			System.out.println("SubjectId is:" + subjectId);
			
			baseURI = "http://localhost:3000/";
			
			given()
			.when()
			.delete("/users/"+subjectId)
			.then()
			.statusCode(200)
			.log().all();	
			
		}

}
