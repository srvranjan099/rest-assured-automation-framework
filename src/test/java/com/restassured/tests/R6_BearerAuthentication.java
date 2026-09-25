package com.restassured.tests;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class R6_BearerAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://httpbin.org";
		given().auth().oauth2("my-token-123").when().get("/bearer").then().log().all()
		.assertThat().statusCode(200);

	}

}
