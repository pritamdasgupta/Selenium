package smokeTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class loginTestNG {
	
	WebDriver driver;
	String url = "https://phptravels.org/clientarea.php";
	
	@Test
	public void loginPageTestNG() {
		
		driver.findElement(By.id("inputEmail")).click();
		driver.findElement(By.id("inputPassword")).click();
		driver.findElement(By.id("login")).click();
		
		String errormsg = "Please complete the captcha and try again.";
		Assert.assertEquals(errormsg, "Please complete the captcha and try again");
	}
	
	@BeforeTest
	public void driverConfig() {
		
		driver = utilities.driverProp.openBrowser("Chrome");
		driver.get(url);
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
	}
}
