package stepImplementationBDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class loginTestStepImplementation {
	
	WebDriver driver;

	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() {
		System.out.println("User is on the Login Page");
		driver = utilities.driverProp.openBrowser("Firefox");
		driver.get("https://phptravels.org/clientarea.php");

	}
	@When("^user enters correct username and correct password$")
	public void user_enters_correct_username_and_correct_password() {
		System.out.println("User enter username and pasword");
		driver.findElement(By.name("username")).sendKeys("PhpTravels@lgin.com");
		driver.findElement(By.name("password")).sendKeys("PAssword@123");
		driver.findElement(By.id("login")).click();
		
	}
	
	@When ("^user enters correct email(.*)$") 
	public void user_enters_correct_username(String username){
		driver.findElement(By.name("username")).sendKeys(username);
	}
	
	@And ("^user enters password(.*)$")
	public void user_enters_password(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@And ("^user clicks login button$")
	public void user_clicks_login_button() {
		driver.findElement(By.id("login")).click();
	}
	
	
	@Then("^user gets confirmation message$")
	public void user_gets_confirmation_message() {
		System.out.println("User gets confirmation Message");
		String errorMsg = "Please complete the captcha and try again.";
		String actualErrorMsg = driver.findElement(By.xpath("//*[@id=\"main-body\"]/div/div/div[1]/div/div[2]")).getText();
		Assert.assertEquals(errorMsg, actualErrorMsg);
		System.out.println(actualErrorMsg);
		driver.close();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
