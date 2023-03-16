package Jira_Assignment;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateissueUsinghamcrest extends BaseforJira{
	
	@Test
	public void Creatjira() {
		//Request body
		 File file =new File ("./data/CreateIssue.json");
		
		 inputRequest = RestAssured.given().
				contentType("application/json").when().body(file);

		// Initiate the Request
		response = inputRequest.post("issue");
		
		//Validate Response
        id = response.jsonPath().get("id");
        System.out.println("id from create issue" +id);
		response.then().assertThat().statusCode(Matchers.equalTo(201));
		response.then().assertThat().body("id",Matchers.equalTo(id));
		
	
	

}
}