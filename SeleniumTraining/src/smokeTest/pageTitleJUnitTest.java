package smokeTest;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class pageTitleJUnitTest {
	
	WebDriver driver ;
	String url = "https://phptravels.org/clientarea.php";
	
	@Test
	public void getPageTitleJUnittest() {
		
		System.out.println("Main Method");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		String expectedTitle = "Client Area - PHPTRAVELS";
		
		Assert.assertEquals(expectedTitle, pageTitle);
		
		
	}
	
	@Before
	public void openBrowser() {
		
		System.out.println("Before Method");
		driver = utilities.driverProp.openBrowser("Chrome");
		driver.get(url);
		
	}
	
	@After
	public void tearDown() {
		System.out.println("After Method");
		driver.close();
	}
}
