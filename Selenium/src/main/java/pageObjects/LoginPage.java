package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	By txtEmail = By.name("uid");
	By txtPassword = By.name("password");
	By btnLogin = By.name("btnLogin");
	
	public void setUserName() {
		driver.findElement(txtEmail).sendKeys("mngr213175");
	}
	
	public void setPassword() {
		driver.findElement(txtPassword).sendKeys("asYpAqu");
	}
	
	public void clickLogin() {
		driver.findElement(btnLogin).click();
	}
}
