package smokeTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import elementsPage.loginElementsPage;

public class LoginPHPTravelsPOM {
	@Test
	public void loginPOM() {
		
		WebDriver driver = utilities.driverProp.openBrowser("Firefox");
		driver.get("https://phptravels.org/clientarea.php");
		
		loginElementsPage loginelementsPage = new loginElementsPage(driver);
//		loginelementsPage.userNameELement("phptravels@gmail.com");
//		loginelementsPage.passwordElement("Password@123");
//		loginelementsPage.loginButton();
		loginelementsPage.doLogin("phptravels@gmail.com", "Password@123");
		String title = loginelementsPage.pageTitle();
		System.out.println(title);
		
		driver.quit();
	}

}
