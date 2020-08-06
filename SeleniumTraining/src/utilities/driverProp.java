package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverProp {
	
	public static WebDriver openBrowser(String browserName) {
		
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining_Udemy\\Drivers\\chromedriver.exe");
			System.out.println("Using Chrome");
			
			return new ChromeDriver();
		}
		
		else{
			System.setProperty("webdriver.gecko.driver", "D:\\SeleniumTraining_Udemy\\Drivers\\geckodriver.exe");
			System.out.println("Using firefox");
			
			return new FirefoxDriver();
		}
		
	}

}
