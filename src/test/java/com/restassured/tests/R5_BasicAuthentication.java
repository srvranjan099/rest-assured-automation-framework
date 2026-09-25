package com.restassured.tests;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class R5_BasicAuthentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://httpbin.org";
		given().auth().basic("user", "passwd").when().get("/basic-auth/user/passwd").then().log().all()
		.assertThat().statusCode(200);
		

	}

}
