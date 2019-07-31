package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.*;

import stepDefinitions.BaseClass;

public class NewCustomerPage extends BaseClass {

	public NewCustomerPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}
	
	By lnkNewCustomer = By.linkText("New Customer");
	By txtCustomerName = By.name("name");
	By rdGender = By.name("rad1");
	By txtDOB = By.name("dob");
	By txtAddress = By.name("addr");
	By txtCity = By.name("city");
	By txtState = By.name("state");
	By txtPin = By.name("pinno");
	By txtTelephone = By.name("telephoneno");
	By txtEmail = By.name("emailid");
	By txtPassword = By.name("password");
	By btnSubmit = By.name("sub");
	static By txtCustomerID = By.xpath("//*[@id=\"customer\"]/tbody/tr[4]/td[2]");
	
	public void click_new_customer_tab() throws InterruptedException {
		driver.findElement(lnkNewCustomer).click();
		Thread.sleep(2000);
	}
	
	public void setCustomerName() {
		String cus_name = BaseClass.rdString();
		driver.findElement(txtCustomerName).sendKeys(cus_name);
	}
	
	public void setGender() {
		driver.findElement(rdGender).click();
	}
	
	public void setDOB() {
		driver.findElement(txtDOB).sendKeys("01161993");
	}
	
	public void setAddress() {
		driver.findElement(txtAddress).sendKeys("No1 Street");
	}
	
	public void setCity() {
		driver.findElement(txtCity).sendKeys("HCMC");
	}
	
	public void setState() {
		driver.findElement(txtState).sendKeys("AZ");
	}
	
	public void setPin() {
		driver.findElement(txtPin).sendKeys("100000");
	}
	
	public void setTelephone() {
		driver.findElement(txtTelephone).sendKeys("1234567");
	}
	
	public void setEmail() {
		String email = BaseClass.rdString()+"@gmail.com";
		driver.findElement(txtEmail).sendKeys(email);
	}
	
	public void setPassword() {
		driver.findElement(txtPassword).sendKeys("1234567");
	}
	
	public void click_submit() throws InterruptedException {
		driver.findElement(btnSubmit).click();
		Thread.sleep(3000);
	}
	
	public static String getCustomerID() {
		 String cus_id = driver.findElement(txtCustomerID).getText();
		 return cus_id;
	}

}
