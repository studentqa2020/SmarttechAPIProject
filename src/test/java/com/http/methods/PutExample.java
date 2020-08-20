package com.http.methods;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutExample {

	@Test
	public void test1() {
		RequestSpecification request = RestAssured.given();
		request.header("Content-type","application/json");

		JsonObject json= new JsonObject();
		json.addProperty("Boro", "Bronx");
		json.addProperty("City", "New York");
		json.addProperty("Country", "USA");
		json.addProperty("id", "200");
		
		
		request.body(json.toString());
		Response response = request.put("http://localhost:3000/posts/200");
		
		int statuscode=response.getStatusCode();
		System.out.println(statuscode);
		
		Assert.assertTrue(statuscode==200);
	}
	
}
