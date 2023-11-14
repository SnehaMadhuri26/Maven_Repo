package module1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import common.Base;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SampleTest1 {
  private String groups;


  @Parameters ({"Item"})
@Test(priority = 3,groups= {"regression"})
  public void test1(String value){
	  System.out.println("test1");
	  System.out.println("Name of the Mobile is: "+value);
  }
 // @Ignore
  @Test(priority = 2,groups={"smoke"})
  public void test2 () {
	  System.out.println("test2");
  }
  @Parameters ({"Item"})
  @Test
  public void ST1(String value) {
	  System.out.println("Sample Test 1 execution");
	  System.out.println("Name of the Mobile is: "+value);
  }
  @Test(priority = 1)
  public void test3() {
	  System.out.println("test3");
  }

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

 

}
