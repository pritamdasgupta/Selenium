package elementsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginElementsPage {
	WebDriver driver;
	
	public void userNameELement(String userName) {
		driver.findElement(By.id("inputEmail")).sendKeys(userName);
	}
	
	public void passwordElement(String password) {
		driver.findElement(By.id("inputPassword")).sendKeys(password);
	}
	
	public void loginButton() {
		driver.findElement(By.id("login")).click();
	}
	
	public String pageTitle() {
		return driver.getTitle();
	}
	
	public void doLogin(String username, String password) {
		userNameELement(username);
		passwordElement(password);
		loginButton();
		pageTitle();
		
	}
	
	public loginElementsPage(WebDriver driver) {
		this.driver = driver;
	}

}
