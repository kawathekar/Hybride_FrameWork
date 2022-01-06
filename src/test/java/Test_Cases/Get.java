package Test_Cases;

import java.net.ResponseCache;

import org.openqa.selenium.remote.Response;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Get {
	@Test
	void get() 
	{
io.restassured.response.Response response = RestAssured.get("https://gorest.co.in/public/v1/posts");
		
		System.out.println(response.getBody().asString());
		System.out.println(response.statusCode());
		System.out.println(response.getTime());
	}
	

}
