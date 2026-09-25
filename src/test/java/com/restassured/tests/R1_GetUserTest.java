package com.restassured.tests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class R1_GetUserTest {
 @Test
 public void getUserTest() {
		RestAssured.baseURI="https://reqres.in";
		String resp1=given().when().get("/api/users/2").then().log().all().assertThat()
				.statusCode(200).body("data.id", equalTo(2)).extract().response().asString();
		
		JsonPath js=new JsonPath(resp1);
		int id=js.getInt("data.id");
		System.out.println("The id is "+id);
		
		
	}
	

}
