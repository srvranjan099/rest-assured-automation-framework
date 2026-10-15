package com.restassured.tests;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class R11_ResponseextractTest {
	
	@Test
	public void ResponseExtract() {
		RestAssured.baseURI="https://reqres.in";
		Response r=given().contentType("application/json").when().get("/api/users/2").then().log().all().assertThat()
		.statusCode(200).extract().response();
		int id=r.jsonPath().getInt("data.id");
		int statuscod=r.getStatusCode();
		String name=r.jsonPath().get("data.first_name");
		String email=r.jsonPath().getString("data.email");
		String last_name=r.jsonPath().getString("data.last_name");
		System.out.println("The id is "+id);
		System.out.println("First name is "+name);
		System.out.println("last name is "+last_name);
		System.out.println(statuscod);
		System.out.println("Email is "+email);
		
	}
}
