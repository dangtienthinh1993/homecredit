package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.*;
import pageObjects.NewCustomerPage;
import stepDefinitions.BaseClass;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.Static;

public class NewAccountPage extends BaseClass {
	
public static String cus_id = NewCustomerPage.getCustomerID();	

	public NewAccountPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}
	
	By lnkNewAccount = By.linkText("New Account");
	By txtCustomerID = By.name("cusid");
	By drpSelectAccount = By.name("selaccount");
	By txtInitDeposit = By.name("inideposit");
	By btnSubmit = By.name("button2");
	static By txtAccountNo = By.xpath("//*[@id=\"account\"]/tbody/tr[4]/td[2]");
	
	public void click_new_account_tab() throws InterruptedException {
		driver.findElement(lnkNewAccount).click();
		Thread.sleep(2000);
	}
	
	public void setCustomerID()
	{
		driver.findElement(txtCustomerID).sendKeys(cus_id);
	}
	
	public void setAccountType()
	{
		Select drpAccType = new Select(driver.findElement(drpSelectAccount));
		drpAccType.selectByVisibleText("Current");
	}
	
	public void setIniDeposit()
	{
		driver.findElement(txtInitDeposit).sendKeys("12345");
	}
	
	public void clickSubmit() throws InterruptedException {
		driver.findElement(btnSubmit).click();
		Thread.sleep(2000);
	}
	
	public static String getAccountNo() {
		 String account_no = driver.findElement(txtAccountNo).getText();
		 return account_no;
	}
	
	

}
