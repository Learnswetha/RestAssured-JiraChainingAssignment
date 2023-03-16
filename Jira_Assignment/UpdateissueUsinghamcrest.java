package Jira_Assignment;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateissueUsinghamcrest extends BaseforJira{
	
		
	@Test(dependsOnMethods = "Jira_Assignment.CreateissueUsinghamcrest.Creatjira")  //packagename.classname.methodname
		public void update() {
		//Request body
		File file=new File("./data/Updatejira.json");
	    inputRequest = RestAssured.given().contentType("application/json").when().body(file);
		//Initiate the Request
		response = inputRequest.put("issue/"+id);
		int Statuscode=  response.getStatusCode();
		System.out.println(Statuscode);
		
		response.then().assertThat().statusCode(Matchers.equalTo(204));
		  }
}
