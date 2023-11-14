import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alltypes {

	public static void main(String[] args) throws InterruptedException {
		//This is Selenium 
		//And this has all methods we use
		//Added another line as of test2
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				  "C:\\Users\\002QU9744\\Documents\\SELENIUM\\Drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://the-internet.herokuapp.com/");
		 driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
		 driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).click();
		 driver.get("https://the-internet.herokuapp.com/");
		 driver.findElement(By.xpath("//a[@href=\"/abtest\"]")).click();
		 System.out.println(driver.findElement(By.xpath("/html/body/div[2]")).getText());
		 driver.get("https://the-internet.herokuapp.com/");
		 
driver.findElement(By.xpath("//*[text()='Form Authentication']")).click();
driver.findElement(By.cssSelector("input#username")).sendKeys("SnehaMadhuri");
driver.findElement(By.cssSelector("input#password")).sendKeys("abc");
driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();

driver.get("https://demoqa.com/browser-windows");
driver.findElement(By.cssSelector("button#tabButton")).click();
Thread.sleep(3000);
driver.findElement(By.cssSelector("button#windowButton")).click();
Thread.sleep(3000);
driver.findElement(By.cssSelector("button#messageWindowButton")).click();
String MainwindowHandle=driver.getWindowHandle();
Set<String> Allwindowhandles=driver.getWindowHandles();
java.util.Iterator<String> iterator=Allwindowhandles.iterator();

while(iterator.hasNext()) {
	String ChildWindow = iterator.next();
	if(!MainwindowHandle.equalsIgnoreCase(ChildWindow)) {
		driver.switchTo().window(ChildWindow);
		driver.close();
		System.out.println("The child window is closed");
	}
	
}
driver.switchTo().window(MainwindowHandle);
driver.close();
	}

}
