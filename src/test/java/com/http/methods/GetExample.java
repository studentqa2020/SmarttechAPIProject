package com.http.methods;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetExample {
	@Test
	public void test1() {
		

	Response response=RestAssured.get("http://localhost:3000/posts");
	
	response.getBody().prettyPrint();

	System.out.println(response.getStatusCode());
	Assert.assertEquals(response.getStatusCode(), 200);
	System.out.println(response.getTime());
	System.out.println(response.getContentType());
		/*
		 * System.out.println(response.getHeaders());
		 * System.out.println(response.getStatusLine());
		 * System.out.println(response.getTime());
		 * 
		 * 
		 * 
		 */
	}
	
}
