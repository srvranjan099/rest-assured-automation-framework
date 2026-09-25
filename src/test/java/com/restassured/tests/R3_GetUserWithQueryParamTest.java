package com.restassured.tests;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class R3_GetUserWithQueryParamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in";
		String resp03=given().queryParam("page", 2).get("/api/users").then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		System.out.println("Resp is "+resp03);

	}

}
