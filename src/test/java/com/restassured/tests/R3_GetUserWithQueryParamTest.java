package com.restassured.tests;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class R3_GetUserWithQueryParamTest {

	@Test
	public void queryParm() {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in";
		String resp03=given().queryParam("page", 2).get("/api/users").then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		System.out.println("Resp is "+resp03);

	}

}
