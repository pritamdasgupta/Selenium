/**
 * 
 */
package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author PDasgup00
 *
 */
public class testLogin {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) {
		// 1. Open the web browser.
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining_Udemy\\Drivers\\chromedriver.exe");

		WebDriver driver =  new ChromeDriver();

		//driver.manage().window().maximize();

		// 2. Navigate to the URL.

		driver.get("https://phptravels.org/clientarea.php");

		// 3. Click on Login

		//driver.findElement(By.xpath("//A[@href='https://phptravels.org'][text()='Log in']")).click();
		
		// 4. Enter email.

		driver.findElement(By.id("inputEmail")).sendKeys("auto.test@gmail.com");

		// 5. Enter Password.

		driver.findElement(By.id("inputPassword")).sendKeys("Autotest@1234");
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 6. Click on Login.

		driver.findElement(By.id("login")).click();

		
		
		String pageTitle = driver.getTitle();
		
		System.out.println("Title of the page is:" + pageTitle );

		// 7. Get Confirmation.

		//		String message = driver.findElement(By.className("dropdown__toggle-button")).getText();
		//
		//		System.out.println("Confirmation "+ message);

		// 8. Close the Browser.

		driver.quit();

	}

}
