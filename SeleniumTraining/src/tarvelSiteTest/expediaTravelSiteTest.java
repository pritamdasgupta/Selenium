package tarvelSiteTest;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class expediaTravelSiteTest {

	WebDriver driver;

	String browserName = "Firefox";
	String hotelName = "Kolkata";
	String checkInDate = "07/31/2020";
	String checkOutDate = "08/04/2020";
	//String selectTravelers = "2";
	String numOfSTars = "4";

	@Test
	public void bookingAndReservationTest() {

		driver.findElement(By.id("tab-hotel-tab-hp")).click();
		driver.findElement(By.id("hotel-destination-hp-hotel")).clear();
		driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys(hotelName);
		driver.findElement(By.id("hotel-checkin-hp-hotel")).clear();
		driver.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys(checkInDate);
		driver.findElement(By.id("hotel-checkout-hp-hotel")).clear();
		driver.findElement(By.id("hotel-checkout-hp-hotel")).sendKeys(checkOutDate);
		//new Select(driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-hotel\"]/div/ul/li/button"))).selectByValue("selectTravelers");
		driver.findElement(By.xpath("//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[13]/label/button")).click();
		driver.findElement(By.id("price-1-1")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div/div/div[1]/main/div[2]/div/div[2]"
				+ "/section[2]/ol/li[4]/div/div/a")).click();
		
		
		// Handling Elements on a Popup
		
		ArrayList<String> windows =  new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		String hotelName = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div[1]/section/div[1]"
				+ "/div/div[4]/div[1]/div/div[1]/h1")).getText();
		System.out.println("HOTEL NAME IS :" +hotelName);
		
		
	}

	@BeforeMethod
	public void setUp() {
		driver = utilities.driverProp.openBrowser(browserName);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.expedia.com");


	}

	@AfterMethod
	public void tearDown() {
	//driver.quit();
}

}
