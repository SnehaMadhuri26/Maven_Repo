package programsTestng;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import filesRequired.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;

public class NewTest {
	@Test(dataProvider ="Allbooksdata")
	public void UpdatingBooksData(String aisle, int aisle2) {
		  RestAssured.baseURI="http://216.10.245.166";
		  String resp = given().header("Content-Type","application/json").body(Payload.Addbook(aisle, aisle2))
		  .when().post("/Library/Addbook.php").then().assertThat().statusCode(200).extract().response().asString();
		  System.out.println(resp);
		  JsonPath js=new JsonPath(resp);
		 
		  String id=js.get("ID");
		  System.out.println(id);
	}


	@DataProvider(name="Allbooksdata")
	public Object[][] ListOfBooks() {
		  return new Object[][] {{"ab435353cd",1287634},{"dewsfdsrwef",49893456},{"ghsdfsdfgi",78787}};
		  
	}
}
