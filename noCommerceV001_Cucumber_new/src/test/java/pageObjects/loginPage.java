package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver ldriver;
	
	public loginPage(WebDriver rdriver) {
		
		
		ldriver = rdriver;
		PageFactory.initElements(ldriver ,this);
		
	}
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath="//button[text()='Log in']")
	@CacheLookup
	WebElement LoginBtn;
	
	@FindBy(linkText = "Logout")
	@CacheLookup
	WebElement LogoutBtn;
	
	public void enterEmailID(String emailID)
	{
		txtEmail.clear();
		txtEmail.sendKeys(emailID);
	}
	public void enterPwd(String pwd)
	{
		txtpassword.clear();
		txtpassword.sendKeys(pwd);
	}
	public void clickLoginBtn()
	{
		LoginBtn.click();
	}
	public void clickLogoutBtn()
	{
		LogoutBtn.click();
	}
	
	
	
	

}
