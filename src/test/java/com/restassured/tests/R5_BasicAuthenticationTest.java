package com.restassured.tests;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class R5_BasicAuthenticationTest {

	@Test
	public void basicAuth() {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://httpbin.org";
		given().auth().basic("user", "passwd").when().get("/basic-auth/user/passwd").then().log().all()
		.assertThat().statusCode(200);
		

	}

}
