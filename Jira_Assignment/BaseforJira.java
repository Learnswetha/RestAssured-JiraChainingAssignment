package Jira_Assignment;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseforJira {
		public static RequestSpecification inputRequest;
		public static Response response;
		public static String id;
	
		@BeforeMethod
		public void setUp() {
			
		//Specify the end point

		RestAssured.baseURI="https://krishswetha040821.atlassian.net/rest/api/2/";

		//Authentication

		RestAssured.authentication=RestAssured.preemptive().basic("krishswetha040821@gmail.com", "ATATT3xFfGF0hCuuyvKZGvb8QoyYXJuMAtDXrfBNtiqexyh3c4ZIOBnn-mNCAtJ7Xip80g7JWbRyp2VydUgOiLj4_IpST-7NDcKhHgjjAYlH6Ov54y5xYRT8THpzdpIDdL9UdYXMHFhlt9bPmuGj9uz5q2kRBTRWgEE2aTB044QGCokPKv1G7ts=9D1CCD87");
	}
	

}

