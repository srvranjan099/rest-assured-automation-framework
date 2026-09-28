package com.SerilizationandDeserlization;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class R9_SerelizationDescerlizatTest {
	
	@Test
	public void serlizat() {
		User u=new User();
		u.setName("Saurav");
		u.setJob("Automation Engineer");
		u.setId("543");
		
		RestAssured.baseURI="https://reqres.in";
		Response r=given().contentType("application/json").body(u).when().post("/api/users").then().log().all()
				.assertThat()
		.statusCode(201).extract().response();
		
		User user=r.as(User.class);
		String n=user.getName();
		user.getJob();
		user.getId();
		user.getcreatedAt();
		System.out.println("Name is "+n);
	}
	
	
	

}
