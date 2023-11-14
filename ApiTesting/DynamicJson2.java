import org.testng.annotations.Test;

import Files.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import static io.restassured.RestAssured.given;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DynamicJson2 {
  @Test(dataProvider = "Allbooksdata")
  public void UpdatingBooksData(String book, String bookId) {
	  RestAssured.baseURI="http://216.10.245.166";
	  String resp = given().header("Content-Type","application/json").body(Payload.Addbook(book, bookId))
	  .when().post("/Library/Addbook.php").then().assertThat().statusCode(200).extract().response().asString();
	  System.out.println(resp);
	  JsonPath js=new JsonPath(resp);
	 
	  String id=js.get("ID");
	  System.out.println(id);
  }
  

  @Dataprovider(name="Allbooksdata")
  public Object[][] ListOfBooks() {
	  return new Object[][]= {{"abc","123"},{"def","456"},{"ghi","789"}};
	  
  }
  

}
