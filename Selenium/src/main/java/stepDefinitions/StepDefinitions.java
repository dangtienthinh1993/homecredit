package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.*;
import pageObjects.Deposit;
import pageObjects.LoginPage;
import pageObjects.NewAccountPage;
import pageObjects.NewCustomerPage;

public class StepDefinitions extends BaseClass {
	
	@Given("^user launch chrome browser to login page$")
	public void user_launch_chrome_browser_to_login_page(){
	    System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	    driver = new ChromeDriver();		
	    lp = new LoginPage(driver);
		driver.get("http://demo.guru99.com/v4/");
	    driver.manage().window().maximize();
	}

	@Given("^user enter username$")
	public void user_enter_username(){
	    lp.setUserName();
	}

	@Given("^user enter password$")
	public void user_enter_password(){
	    lp.setPassword();
	}

	@Given("^user click on login button$")
	public void user_click_on_login_button(){
	   lp.clickLogin();
	}
	
	@Then("^close browser$")
	public void close_browser() {
		driver.quit();
	}
	
	// New customer section 
	@When("^user click on new customer$")
	public void user_click_on_new_customer() throws InterruptedException{
		ncp = new NewCustomerPage(driver);
		Thread.sleep(3000);
		ncp.click_new_customer_tab();
	}

	@Then("^new customer page displays$")
	public void new_customer_page_displays(){
		Assert.assertEquals("Guru99 Bank New Customer Entry Page", BaseClass.getPageTitle());
	}

	@When("^user enter new customer information$")
	public void user_enter_new_customer_information(){
	    ncp.setCustomerName();
	    ncp.setGender();
	    ncp.setDOB();
	    ncp.setAddress();
	    ncp.setCity();
	    ncp.setState();
	    ncp.setPin();
	    ncp.setTelephone();
	    ncp.setEmail();
	    ncp.setPassword();
	}

	@When("^user click on submit button new customer page$")
	public void user_click_on_submit_button_new_customer_page() throws InterruptedException{
		ncp.click_submit();
	}
	
	@Then("^customer registered page displays$")
	public void customer_registered_page_displays(){
		Assert.assertEquals("Guru99 Bank Customer Registration Page", BaseClass.getPageTitle());
	}
	
	
	//New Account Section
	@When("^user click on new account$")
	public void user_click_on_new_account() throws InterruptedException {
		nap = new NewAccountPage(driver);
		Thread.sleep(1000);
		nap.click_new_account_tab();
	}
	
	@Then("^new account page displays$")
	public void new_account_page_displays(){
		Assert.assertEquals("Guru99 bank add new account", BaseClass.getPageTitle());
	}
	
	@When("^user enter new account information$")
	public void user_enter_new_account_information() {
		nap.setCustomerID();
		nap.setAccountType();
		nap.setIniDeposit();
	}
	
	@When("^user click on submit button new account page$")
	public void user_click_on_submit_button_new_account_page() throws InterruptedException {
		nap.clickSubmit();
	}
	
	@Then("^account generated successfully page displays$")
	public void account_generated_successfully_page_displays() {
		Assert.assertEquals("Gtpl Bank Customer Registration Page", BaseClass.getPageTitle());
	}
	
	
	//Deposit Section
	@When("^user click on deposit$")
	public void user_click_on_deposit() throws InterruptedException{
		dp = new Deposit(driver);
		dp.click_deposit_tab();
	}
	
	@Then("^deposit page displays$")
	public void deposit_page_displays() {
		Assert.assertEquals("Guru99 Bank Amount Deposit Page", BaseClass.getPageTitle());
	}
	
	@When("^user enter deposit information$")
	public void user_enter_deposit_information() {
		dp.setAccountNo();
		dp.setAmount();
		dp.setDescription();
	}
	
	@When("^user click on submit button deposit page$")
	public void user_click_on_submit_button_deposit_page() throws InterruptedException {
		dp.clickSubmit();
	}
	
	@Then("^deposit successfully table displays$")
	public void deposit_successfully_table_displays() {
		dp.verifyDepositTableDisplays();
	}
}
