package Step_Definitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AddCustomerPage;
import pageObjects.loginPage;

public class StepDef extends BaseClass {
	
	
	
	
	@Given("user Launches the Browser")
	public void user_launches_the_browser() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		lp=new loginPage(driver);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	   
	}

	@When("user opens the URL {string}")
	public void user_opens_the_url(String url) {
	   driver.get(url);
	}

	@When("user enter the credentials {string} and {string}")
	public void user_enter_the_credentials_and(String username, String password) throws InterruptedException {
	   lp.enterEmailID(username);
	   lp.enterPwd(password);
	   Thread.sleep(2000);
	}

	@When("Click on Login button")
	public void click_on_login_button() { 
	   lp.clickLoginBtn();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
	   if(driver.getPageSource().contains("Login was unsuccessful."))
	   {
		   driver.close();
		   Assert.assertTrue(false);
	   }
	   else
	   {
		   Assert.assertEquals(title, driver.getTitle());
	   }
	}

	@When("user click on Logout button")
	public void user_click_on_logout_button() throws InterruptedException {
	   lp.clickLogoutBtn();
	   Thread.sleep(2000);
	}

	@Then("close the browser")
	public void close_the_browser() {
	   driver.quit();
	}
	
	//------------------------- Add customer code  ---------------------------------
	
	
	/*
	 * @When("Click on Login button") public void click_on_login_button() { // Write
	 * code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 */
	@Then("user can view dashboard")
	public void user_can_view_dashboard() throws InterruptedException {
		ap = new AddCustomerPage(driver);
		
		String currentPageTitle = "Dashboard / nopCommerce administration";
		Assert.assertEquals(currentPageTitle, ap.getPageTitle());
		System.out.println("The page Title is : "+currentPageTitle);
		Thread.sleep(1000);
	  
	}
	@When("user click on Customer menu")
	public void user_click_on_customer_menu() throws InterruptedException {
	  ap.clickCustBtn();
	  Thread.sleep(1000);
	}
	@When("click on customer menu item")
	public void click_on_customer_menu_item() throws InterruptedException {
	  ap.clickCustOptnBtn();
	  Thread.sleep(1000);
	}
	@When("click on Add new button")
	public void click_on_add_new_button() throws InterruptedException {
	   ap.clickCustAddBtn();
	   Thread.sleep(1000);
	}
	@Then("user can view Add new customer page")
	public void user_can_view_add_new_customer_page() throws InterruptedException {
		String addcustTitle = "Add a new customer / nopCommerce administration";
		Assert.assertEquals(addcustTitle, ap.getPageTitle());
		System.out.println("The Page title is : "+addcustTitle);
		Thread.sleep(1000);
	    
	}
	@When("user enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
		String email=randomString()+"@gmail.com";
		
		ap.Setusername(email);
		Thread.sleep(1000);
		ap.SetPwd("hello@123");
		Thread.sleep(1000);
		ap.SetFirstName("Tom");
		Thread.sleep(1000);
		ap.SetlastName("Smasher");
		Thread.sleep(1000);
		ap.SetGender();
		Thread.sleep(1000);
		ap.SetDOB("8/15/1998");
		Thread.sleep(1000);
		ap.SetCompany("Apple");
		Thread.sleep(1000);
		//ap.ddnewsLetter();
		Thread.sleep(1000);
		//ap.ddRoles();
		Thread.sleep(1000);
		//ap.ddRoles();
		Thread.sleep(1000);
		ap.ddVendor();
		Thread.sleep(1000);
		ap.enterComment("This is for Testing");
		Thread.sleep(1000);
		
	   
	}
	@When("click on save button")
	public void click_on_save_button() throws InterruptedException {
		ap.clickSaveBtn();
		Thread.sleep(1000);
	   
	}
	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String stringMsg) {
	  // String expTxt ="The new customer has been added successfully";
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains(stringMsg));
		System.out.println("The success Message is : "+stringMsg);
	}
	/*
	 * @Then("close the browser") public void close_the_browser() { // Write code
	 * here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 */
	
	
	
	
	

}
