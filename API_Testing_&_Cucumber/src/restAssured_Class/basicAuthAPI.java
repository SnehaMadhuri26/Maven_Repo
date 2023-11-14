package restAssured_Class;

import static org.junit.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class basicAuthAPI {

	public static void testAuthBasedAPI(String UN,String PWD,int expectedCode) {
		RestAssured.baseURI="https://postman-echo.com/";
		Response res = RestAssured.given().auth().preemptive().basic(UN, PWD).get("basic-auth").then().extract().response();
		assertEquals(expectedCode,res.getStatusCode());
	}
}
