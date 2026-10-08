package com.restassured.tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class R10_ApiChainingTest {
	
	
	@Test
	public void apiCha1() {
		RestAssured.baseURI="https://reqres.in";
		Response r1=given().contentType("application/json").body("{\r\n"
				+ "  \"name\": \"Saurav\",\r\n"
				+ "  \"job\": \"Automation Tester\"\r\n"
				+ "}").when().post("/api/users").then().log().all().assertThat().statusCode(201)
		.extract().response();
		
		String ID=r1.jsonPath().getString("id");
		System.out.println(ID);
		
	given().pathParam("id", ID).when().get("/api/users/{id}").then().log().all().assertThat().statusCode(404);
	
		
	
		
	}
}
