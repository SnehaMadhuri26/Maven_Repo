package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BlogPage {
	@Before(order=1)
	public void beforeCucumber1() {
		System.out.println("before1");
	}
	@Before(order=2)
	public void beforeCucumber2() {
		System.out.println("before2");
	}
	@BeforeStep()
	public void beforeStep() {
		System.out.println("before step");
	}


	@Given("user is in Blog Page")
	public void userInBlogPage() {
		System.out.println("given section");
	}
	@When("user enters data in search field")
	public void userEntersData() {
		System.out.println("when section");
	}
	@Then("data should appear in search field")
	public void dataShouldAppear() {
		System.out.println("Then Section");
	}
	@AfterStep
	public void afterStep() {
		System.out.println("after step");
	}
	@After
	public void afterCucumber1() {
		System.out.println("after1");
	}

}
