package com.restassured.tests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.*;

public class R2_CreateUserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="https://reqres.in";
		String resp2=given().contentType("application/json").accept("application/json").header("x-test","Saurav").body("{\r\n"
				+ "    \"name\": \"Saurav\",\r\n"
				+ "    \"job\": \"Automation Tester\"\r\n"
				+ "}").when().post("/api/users").then().log().all().assertThat().statusCode(201)
		.body("name", equalTo("Saurav")).body("job", equalTo("Automation Tester")).extract().response().asString();
		JsonPath js1=new JsonPath(resp2);
		int id=js1.getInt("id");
		String name=js1.getString("name");
		String job=js1.getString("job");
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("job is "+job);
		Response r=given().contentType("application/json").accept("application/json").body("{\r\n"
				+ "  \"name\": \"Ravi\",\r\n"
				+ "  \"job\": \"Developer\"\r\n"
				+ "}").when().post("/api/users").then().log().all().assertThat().statusCode(201).extract().response();
		String contenttype=r.getHeader("Content-Type");
		System.out.println("Content-Type is"+contenttype);
		

	}

}
