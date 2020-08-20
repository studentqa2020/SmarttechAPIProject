package com.http.methods;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostExample {
	@Test
	public void test1() {

		JsonObject json = new JsonObject();
		json.addProperty("Boro", "Queens");
		json.addProperty("City", "New York");
		json.addProperty("Country", "USA");
		json.addProperty("id", "200");

		RequestSpecification request = RestAssured.given();
		request.header("Content-type", "application/json");

		request.body(json.toString());
		Response response = request.post("http://localhost:3000/posts");

		int statuscode = response.getStatusCode();
		System.out.println(statuscode);

		Assert.assertEquals(response.getStatusCode(), 201);
		Assert.assertTrue(statuscode == 201);
	}

}
