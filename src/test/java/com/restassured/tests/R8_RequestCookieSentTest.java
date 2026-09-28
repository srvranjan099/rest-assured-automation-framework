package com.restassured.tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class R8_RequestCookieSentTest {
	
	@Test
	public void cookieSent() {
		RestAssured.baseURI="https://httpbin.org";
		Response r2=given().cookie("username","saurav").when().get("/cookies").then().log().all().assertThat()
		.statusCode(200).extract().response();
		//here we are extracting the same cokkie from response 
		
		String cookieVlaue=r2.jsonPath().getString("cookies.username");
		System.out.println(cookieVlaue);
	}

}
