package stepDefinitions;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjects.Deposit;
import pageObjects.LoginPage;
import pageObjects.NewAccountPage;
import pageObjects.NewCustomerPage;

public class BaseClass {
	public static WebDriver driver;
	public LoginPage lp;
	public NewCustomerPage ncp;
	public NewAccountPage nap;
	public Deposit dp;
	
	public static String rdString()
	{
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
	
	public static String getPageTitle() {
		return driver.getTitle();
	}
}
