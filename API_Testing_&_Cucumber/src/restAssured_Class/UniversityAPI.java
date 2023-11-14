package restAssured_Class;

import static org.junit.Assert.assertEquals;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class UniversityAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static void validateUniversityAPI(String country,String state,String WhUniExists) {
		RestAssured.baseURI="http://universities.hipolabs.com/";
				//http://universities.hipolabs.com/searc h?country=india
		Response res=RestAssured.given().queryParam("country",country).get("search").then().extract().response();
		 System.out.println(res.getStatusCode());
		 assertEquals(200,res.getStatusCode());
		 
		 ResponseBody resBody = res.getBody();
		 JsonPath resPath = resBody.jsonPath();
		 List<String> stateList=resPath.getList("state-province");
		 System.out.println(stateList);
		 
		 int c=0;
		 for(int i=0;i<stateList.size();i++) {
			 if(stateList.get(i)!=null) {
			 if(stateList.get(i).equals(state))
			 {
				c=c+1; 
			 }
			 
			 }
		 }
	
		 System.out.println("Count of the universities present for the sate given is : "+c); 	
		 List<String> UnivList=resPath.getList("name");
		 Boolean found=false;
		 for(int j=0;j<stateList.size();j++)
		 {
			 if(UnivList.get(j)!=null) {
			 if(UnivList.get(j).equals(WhUniExists))
			 {
				 found=true;
				 break;
			 }
		 }
			 }
		 if(found==true) {
		System.out.println(WhUniExists+" exists");}
		 else {
			 System.out.println(WhUniExists+" not exists");}
			 
		 
		 
		}
	

}
