package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createAccount {

	public static void main(String[] args) {


		// 1. Open the web browser.
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining_Udemy\\Drivers\\chromedriver.exe");

		WebDriver driver =  new ChromeDriver();

		// 2. Navigate to the URL.

		driver.get("https://phptravels.org/register.php");
		
		// 3. Filling out the form.
		
		driver.findElement(By.id("inputFirstName")).sendKeys("Rosarita");
		driver.findElement(By.id("inputLastName")).sendKeys("Bloodhound");
		driver.findElement(By.id("inputEmail")).sendKeys("rosarita.bloodhoun@phptravels.org");
		driver.findElement(By.id("inputPhone")).sendKeys("9087654321");
		driver.findElement(By.id("inputCompanyName")).sendKeys("Black Lagoon");
		driver.findElement(By.id("inputAddress1")).sendKeys("Roahnapur");
		driver.findElement(By.id("inputCity")).sendKeys("Kolkata");
		driver.findElement(By.id("inputPostcode")).sendKeys("700074");
		driver.findElement(By.id("customfield2")).sendKeys("1234567890");
		driver.findElement(By.id("inputNewPassword1")).sendKeys("Rosarita@1234");
		driver.findElement(By.id("inputNewPassword2")).sendKeys("Rosarita@1234");
		
		
		// 4. Handling Dropdown Menus
		
		new Select(driver.findElement(By.id("inputCountry"))).selectByVisibleText("India");
		new Select(driver.findElement(By.id("stateselect"))).selectByVisibleText("West Bengal");
		new Select(driver.findElement(By.id("customfield1"))).selectByVisibleText("Google");
		
		
		// 5. Clicking on Submit Button
		
		driver.findElement(By.xpath("//INPUT[@class='btn btn-large btn-primary btn-recaptcha']")).click();
		
		
		// 6. Closing the browser
		
		driver.close();
		
		
		



	}

}
