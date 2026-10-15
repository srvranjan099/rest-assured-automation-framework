package com.restassured.tests;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class R12_LoggingTest {
	
	@Test
	public void loggMethod() {
		RestAssured.baseURI="https://reqres.in";
	//	given().when().get("/api/users/2").then().log().all()
	//	.assertThat().statusCode(200);
		
		given().when().get("/api/users/2").then().log().ifValidationFails().statusCode(200).extract().response();
		
		
		
	}

}
