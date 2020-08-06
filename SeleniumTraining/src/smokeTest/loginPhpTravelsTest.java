package smokeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class loginPhpTravelsTest {

	WebDriver driver;
	String url = "https://phptravels.org/clientarea.php";
	
	String mail = "pritam@gmail.com";
	String pass = "Independent12#";

	@Test
	public void aTagsTest() {
//		
//		WebElement emailaddress = driver.findElement(By.id("inputEmail"));
//		WebElement password = driver.findElement(By.id("inputPassword"));
//		WebElement loginBtn = driver.findElement(By.id("login"));
//
//		emailaddress.sendKeys(mail);
//		password.sendKeys(pass);
//		loginBtn.click();
		
		List <WebElement> aTagElements = driver.findElements(By.tagName("a"));
		int sizeOfaELements = aTagElements.size();
		System.out.println("The size of aElements is: " +sizeOfaELements );
		for(WebElement aElements  : aTagElements) {
			System.out.println(aElements.getText());
		}
	}
	
	@Test
	public void loginTest() {
		
		WebElement emailaddress = driver.findElement(By.id("inputEmail"));
		WebElement password = driver.findElement(By.id("inputPassword"));
		WebElement loginBtn = driver.findElement(By.id("login"));

		emailaddress.sendKeys(mail);
		password.sendKeys(pass);
		loginBtn.click();
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

