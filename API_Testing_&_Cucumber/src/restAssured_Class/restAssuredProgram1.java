package restAssured_Class;

import static org.junit.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class restAssuredProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//API Call
	}	

public static void validGenderAPI(String name,String gender) {
	RestAssured.baseURI="https://api.genderize.io/";
	RequestSpecification req=RestAssured.given();
	req.queryParam("name", name);
	Response res=req.get();
	int StatusCode=res.statusCode();
	System.out.println("Status code is "+StatusCode);
	System.out.println("Status line is "+res.statusLine());
	System.out.println("Status line is "+res.getHeader("Content-Type"));
	Headers reshd=res.getHeaders();
	for(Header h:reshd)
	{
		System.out.println("name: "+h.getName());
		System.out.println("     ");
		System.out.println("Value: "+h.getValue());
	}
	
	//get response body
	ResponseBody resBody=res.getBody();
	JsonPath path=resBody.jsonPath();
	System.out.println("name: "+path.getString("name"));
	System.out.println("gender: "+path.getString("gender"));
	//System.out.println("probability: "+path.getString("probability"));
	//System.out.println("count: "+path.getString("count"));
	
	assertEquals(name,path.getString("name"));
	assertEquals(gender,path.getString("gender"));
	


}
	
}
