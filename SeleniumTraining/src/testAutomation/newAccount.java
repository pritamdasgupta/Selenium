package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class newAccount {

	public static void main(String[] args) {

		// Parameterizing 
		String firstName = "Rosarita";
		String lastName = "Bloodhound";
		String emailAddress = "rosarita.bloodhoun@phptravels.org";
		String phoneNumber = "9087654321";
		String companyName = "Black Lagoon";
		String addrresLine1 = "Roahnapur";
		String cityName = "Kolkata";
		String postalCode = "700074";
		String mobilePhoneNumber = "1234567890";
		String newPassword = "Rosarita@1234";
		String verifyPassword = "Rosarita@1234";
		String browserName = "Chrome";
		
		
		//Define Driver
		WebDriver driver;
		driver = utilities.driverProp.openBrowser(browserName);
		driver.get("https://phptravels.org/register.php");



		// Defining Elements
		
		WebElement fNameElement = driver.findElement(By.id("inputFirstName"));
		WebElement lNameElement  = driver.findElement(By.id("inputLastName"));
		WebElement mailAddress = driver.findElement(By.id("inputEmail"));
		WebElement mphoneNumber =  driver.findElement(By.id("inputPhone"));
		WebElement company = driver.findElement(By.id("inputCompanyName"));
		WebElement address1 = driver.findElement(By.id("inputAddress1"));
		WebElement city = driver.findElement(By.id("inputCity"));
		WebElement postalcode = driver.findElement(By.id("inputPostcode"));
		WebElement customfield = driver.findElement(By.id("customfield2"));
		WebElement password = driver.findElement(By.id("inputNewPassword1"));
		WebElement verifyPass = driver.findElement(By.id("inputNewPassword2"));
		WebElement registerBtn = driver.findElement(By.xpath("//INPUT[@class='btn btn-large btn-primary btn-recaptcha']"));
		
		
		
		// 3. Filling out the form.

		fNameElement.sendKeys(firstName);
		lNameElement.sendKeys(lastName);
		mailAddress.sendKeys(emailAddress);
		mphoneNumber.sendKeys(phoneNumber);
		company.sendKeys(companyName);
		address1.sendKeys(addrresLine1);
		city.sendKeys(cityName);
		postalcode.sendKeys(postalCode);
		customfield.sendKeys(mobilePhoneNumber);
		password.sendKeys(newPassword);
		verifyPass.sendKeys(verifyPassword);


		// 4. Handling Dropdown Menus

		new Select(driver.findElement(By.id("inputCountry"))).selectByVisibleText("India");
		new Select(driver.findElement(By.id("stateselect"))).selectByVisibleText("West Bengal");
		new Select(driver.findElement(By.id("customfield1"))).selectByVisibleText("Google");


		// 5. Clicking on Submit Button

		registerBtn.click();


		// 6. Closing the browser

		driver.close();






	}

}
