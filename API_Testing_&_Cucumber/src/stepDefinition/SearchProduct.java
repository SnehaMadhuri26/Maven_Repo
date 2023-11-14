package stepDefinition;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProduct {
	public static WebDriver driver;
	@Before
	public void start() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\002QU9744\\Documents\\SELENIUM\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		driver = new ChromeDriver();
		
	}

	
	
	
	@Given("user is in Search page")
	public void navigateSearchPage() {
//		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//		driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo");
		//driver.navigate().to("http://tutorialsninja.com/demo");
	}
	@When("user enters {string} product")
	public void enterProduct(String product) {
		driver.findElement(By.name("search")).sendKeys(product);
	}
	
	@And("Click on Search button")
	public void clickSearch() {
		driver.findElement(By.xpath("//div[@id='search']//button")).click();
		
	}
	
	@Then("Product {string} should be displayed")
	public void verifyProduct(String sProduct)
	{
		assertTrue(driver.findElement(By.xpath("//a[contains(text(),'"+sProduct+"')]")).isDisplayed());
		driver.quit();
	}
		
}
