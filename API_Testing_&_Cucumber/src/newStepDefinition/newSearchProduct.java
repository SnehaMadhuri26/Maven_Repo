package newStepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class newSearchProduct {
	public static WebDriver driver;
	@Before
	public void start() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\002QU9744\\Documents\\SELENIUM\\Drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe"); 
	driver = new FirefoxDriver();
	}
	@Given("I hit API")
	public void i_hit_API() {
		RestAssured.baseURI="https://postman-echo.com/";
		Response res = RestAssured.given().auth().preemptive().basic("postman", "password").get("basic-auth").then().extract().response();
		assertEquals(200,res.getStatusCode());
		System.out.println(res.getStatusCode());
	    
	}



	
	@Given("User is on Home Page")
	public void navigateSearchPage() {
		 
		driver.get("http://tutorialsninja.com/demo");
		driver.manage().window().maximize();
	
		}
	
		@When("User enters {string} in search field")
		public void enterProduct(String product) throws InterruptedException {
			System.out.println("enter product");
			Thread.sleep(3000);
			driver.findElement(By.name("search")).sendKeys(product);
		}
		@And("user click on search button")
		public void ClickSearch() {
		driver.findElement(By.cssSelector(".btn.btn-default.btn-lg")).click();
	
		}
		
		@Then("Product {string} should be displayed")
		public void ValidateProductDisplayed(String product) {
			assertTrue(driver.findElement(By.xpath("//a[contains(text(),'"+product+"')]")).isDisplayed());
			
		}
		@After
		public void end() {
			driver.quit();	
			
		}

}
