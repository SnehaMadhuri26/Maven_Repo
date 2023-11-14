package restAssured_Class;

import static org.junit.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class TestPostAPI {

	public static void PostAPI(String reqBody) {
		// TODO Auto-generated method stub
		   
RestAssured.baseURI="https://petstore.swagger.io/";
Response res = RestAssured.given().headers("Content-type","application/json").body(reqBody).when().post("v2/store/order").then().extract().response();
ResponseBody resBody=res.getBody();
JsonPath resPath=resBody.jsonPath();
//assertEquals()

	
	}

}
