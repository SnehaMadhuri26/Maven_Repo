package restAssured_Class;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import junit.framework.Assert;

import static org.hamcrest.Matchers.*;



import static io.restassured.RestAssured.*;






import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;

public class NewTest {
	 @Test(dataProvider = "Allbooksdata")
	  public void UpdatingBooksData(String book, int bookId) {
		  RestAssured.baseURI="http://216.10.245.166";
		  String resp = given().header("Content-Type","application/json").body(restAssured_Class.Payload.Addbook(book, bookId))
		  .when().post("/Library/Addbook.php").then().assertThat().statusCode(200).extract().response().asString();
		 System.out.println(resp);
		  JsonPath js=new JsonPath(resp);
		 
		  String id=js.get("ID");
		  System.out.println(id);
	  }
	  

	 @DataProvider(name="Allbooksdata")
	  public Object[][] ListOfBooks() {
		  return new Object[][] {{"abc",345325},{"def",345353},{"ghi",345353}};
		  
	  }
	  
}
