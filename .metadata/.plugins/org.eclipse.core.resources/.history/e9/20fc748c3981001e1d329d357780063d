

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import junit.framework.Assert;

import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import filesRequired.Payload;

import static io.restassured.RestAssured.*;

	public class Basics {

		
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub

			//Verify if Add place API is working as excepted
			//given- all input details
			//when - submit the API
			//Then- Validate the result

			
		

		RestAssured.baseURI= "https://rahulshettyacademy.com";
		//File file = new File("C:\\Users\\002QU9744\\Documents\\Automation\\API_Testing\\Static_Json_Files\\addPlace.json");
			String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.AddPlace()).when().post("maps/api/place/add/json")
			.then().assertThat().statusCode(200).body("scope", equalTo("APP")).header("server","Apache/2.4.52 (Ubuntu)")
		.extract().response().asString();
		
		System.out.println(response);
			JsonPath js=new JsonPath(response); //for parsing Json
			String placeId=js.getString("place_id");
			
			System.out.println(placeId);
			
			//Update Place
		String newAddress = "Summer Walk, Africa";
			
			given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
			.body("{\r\n" + 
					"\"place_id\":\""+placeId+"\",\r\n" + 
				"\"address\":\""+newAddress+"\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
					"}").
			when().put("maps/api/place/update/json")
			.then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
			
			//Get Place
			
		String getPlaceResponse=	given().log().all().queryParam("key", "qaclick123")
		.queryParam("place_id",placeId)
			.when().get("maps/api/place/get/json")
			.then().assertThat().log().all().statusCode(200).extract().response().asString();
		JsonPath js1=ReUsableMethods.rawToJson(getPlaceResponse);
		String actualAddress =js1.getString("address");
		System.out.println(actualAddress);
		Assert.assertEquals(actualAddress,newAddress );
		//Cucumber Junit, Testng
		
}}