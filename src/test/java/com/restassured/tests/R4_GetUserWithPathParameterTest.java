package com.restassured.tests;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class R4_GetUserWithPathParameterTest {

	@Test
	public void Pathparm() {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in";
		given().pathParam("id", 2).when().get("/api/users/{id}").then().log().all().assertThat().statusCode(200);
		

	}

}
