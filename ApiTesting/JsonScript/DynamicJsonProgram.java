package JsonScript;

import org.testng.annotations.Test;

import Files.Payload;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class DynamicJsonProgram {
  @Test
  public void f() {
	  RestAssured.baseURI="http://216.10.245.166";
	  String response=given().header("Content-Type","application/json").body(Payload.AddPlace())
	  .when().post("/Library/Addbook.php").then().assertThat().statusCode(200).extract().response().asString();
	  System.out.println(reponse);
	  JsonPath js=ReUsableMethods.rawToJson(response);
	  String id=js.get("ID");
	  System.out.println(id);
	  
	  
  }
}
