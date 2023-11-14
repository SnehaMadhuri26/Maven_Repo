package restAssured_Class;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Validate_API {

	@Test
	void testGenderAPI() {
		restAssuredProgram1.validGenderAPI("Sneha", "female");
		restAssuredProgram1.validGenderAPI("Madhuri", "female");
		//restAssuredProgram1.validGenderAPI("SnehaMadhuri", "null");
		restAssuredProgram1.validGenderAPI("Sukanya", "female");
		restAssuredProgram1.validGenderAPI("Nishanth", "male");
		restAssuredProgram1.validGenderAPI("Subramanyam", "male");
		
	}
	@Test
	void testUniversityAPI() {
		UniversityAPI.validateUniversityAPI("India","Punjab","Gujarat Ayurved University6");
		//UniversityAPI.validateUniversityAPI("abc");
	}
	
	

	@Test
	void testWithCredentials() {
		basicAuthAPI.testAuthBasedAPI("postman", "password", 200);
		basicAuthAPI.testAuthBasedAPI("postman", "password1", 401);
	}
	@Test
	void testPostApi() {
		TestPostAPI.PostAPI("");
	String reqBody1="{\\\"id\\\": 0,\\\"petId\\\": 0,\\\"quantity\\\": 0,\\\"shipDate\\\": \\\"2023-10-19T04:21:55.067Z\\\",\\\"status\\\": \\\"placed\\\",\\\"complete\\\": true}";
	String reqBody2="{\\\"id\\\": 0,\\\"petId\\\": 0,\\\"quantity\\\": 0,\\\"shipDate\\\": \\\"2023-10-19T04:21:55.067Z\\\",\\\"status\\\": \\\"placed}";
	//TestPostAPI.PostAPI(reqBody1,true);
	//TestPostAPI.PostAPI(reqBody2,false);
	}

}
