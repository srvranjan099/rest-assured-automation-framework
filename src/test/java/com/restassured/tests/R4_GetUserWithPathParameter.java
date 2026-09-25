package com.restassured.tests;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class R4_GetUserWithPathParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in";
		given().pathParam("id", 2).when().get("/api/users/{id}").then().log().all().assertThat().statusCode(200);
		

	}

}
