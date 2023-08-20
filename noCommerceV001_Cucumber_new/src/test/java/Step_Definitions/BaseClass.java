package Step_Definitions;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObjects.AddCustomerPage;
import pageObjects.loginPage;
import utilites.waitHelper;

public class BaseClass {
	
	public WebDriver driver;
	public loginPage lp;
	public AddCustomerPage ap;
	public waitHelper wh;
	
	
	// for generating unique emaild
	public static String randomString()
	{
	String genrateString = RandomStringUtils.randomAlphabetic(5);
	return genrateString;
	}
	
	
}
