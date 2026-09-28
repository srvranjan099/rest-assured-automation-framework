package com.restassured.tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

public class R7_ApikeyAuthenticationTest {
	
	@Test
	public void apiKey() {
		RestAssured.baseURI="https://reqres.in";
		String apikey="free_user_3JrRoFaSClF6cDlN5XkueM1jIYx";
		given().header("x-api-key",apikey).when().get("/api/users/2").then().log().all().assertThat().statusCode(200);
		
		
	}

}
