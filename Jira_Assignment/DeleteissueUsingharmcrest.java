package Jira_Assignment;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;



	public class DeleteissueUsingharmcrest extends BaseforJira {
		
		@Test(dependsOnMethods = "Jira_Assignment.UpdateissueUsinghamcrest.update")
		public void delete() {
			
			 response = RestAssured.delete("issue/"+id);
			
			
			//Extract status line from delete
			String statusLine = response.getStatusLine();
			System.out.println("Statusline for Delete"+statusLine);
			//Extract Status code from delete
			int Statuscode=  response.getStatusCode();
		     System.out.println(Statuscode);
		 
		     //validate the status code and status line
		     response.then().assertThat().statusCode(204);
		     response.then().assertThat().statusLine("HTTP/1.1 204 No Content");
		     response.then().assertThat().statusCode(Matchers.equalTo(204));
		     response.then().assertThat().statusLine(Matchers.equalTo("HTTP/1.1 204 No Content"));
		     
			
		}

	}



