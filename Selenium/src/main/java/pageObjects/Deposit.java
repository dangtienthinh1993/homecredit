
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.BaseClass;

public class Deposit extends BaseClass {
	
public static String cus_no = NewAccountPage.getAccountNo();	

	public Deposit(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}
	
	By lnkDeposit = By.linkText("Deposit");
	By txtAccountNo = By.name("accountno");
	By txtAmount = By.name("ammount");
	By txtDescription = By.name("desc");
	By btnSubmit = By.name("AccSubmit");
	By tbDeposit = By.name("deposit");
	
	public void click_deposit_tab() throws InterruptedException {
		driver.findElement(lnkDeposit).click();
		Thread.sleep(2000);
	}
	
	public void setAccountNo()
	{
		driver.findElement(txtAccountNo).sendKeys(cus_no);
	}
	
	
	public void setAmount()
	{
		driver.findElement(txtAmount).sendKeys("100000");
	}
	
	public void setDescription()
	{
		driver.findElement(txtDescription).sendKeys("Description");
	}
	
	public void clickSubmit() throws InterruptedException {
		driver.findElement(btnSubmit).click();
		Thread.sleep(2000);
	}
	
	public void verifyDepositTableDisplays() {
		driver.findElement(tbDeposit).isDisplayed();
	}
	

}
