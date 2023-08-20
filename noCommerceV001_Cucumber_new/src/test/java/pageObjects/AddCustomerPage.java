package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilites.waitHelper;

public class AddCustomerPage {
	
	WebDriver ldriver;
	waitHelper waithelper;
	
	public AddCustomerPage(WebDriver rdriver) {
		// TODO Auto-generated constructor stub
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		waithelper = new waitHelper(rdriver);
	}
	
	@FindBy(xpath="//a[@href='#']//p[contains(text(),'Customers')]")
	WebElement CustomerBtn;
	
	@FindBy(xpath="//a[@href='/Admin/Customer/List']//p[text()=' Customers']")
	WebElement customerOptBtn;
	
	@FindBy(xpath="//a[@href='/Admin/Customer/Create']")
	WebElement addBtn;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement pwd;
	
	@FindBy(id="FirstName")
	WebElement firststname;
	
	@FindBy(id="LastName")
	WebElement lastName;
	
	@FindBy(id="Gender_Male")
	WebElement gender;
	
	@FindBy(id="DateOfBirth")
	WebElement dobtxtbx;
	
	@FindBy(id="Company")
	WebElement company;
	
	@FindBy(xpath="//*[@id=\"customer-info\"]/div[2]/div[9]/div[2]/div/div[1]/div/div")
	WebElement newsLetter;
	
	@FindBy(xpath="//*[@id=\"customer-info\"]/div[2]/div[10]/div[2]/div/div[1]/div/div")
	WebElement custRoles;
	
	@FindBy(xpath="//*[@id=\"VendorId\"]")
	WebElement vendor;
	
	@FindBy(xpath="//*[@id=\"AdminComment\"]")
	WebElement adminContent;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/form/div[1]/div/button[1]")
	WebElement saveBtn;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/div[1]/text()")
	WebElement successMsg;
	
	public void clickCustBtn()
	{
		//waithelper.WaitForElement(CustomerBtn, 10);
		CustomerBtn.click();
	}
	public void clickCustOptnBtn()
	{
		customerOptBtn.click();
	}
	public void clickCustAddBtn()
	{
		addBtn.click(); 
	}
	public void Setusername(String userEmail)
	{
		email.sendKeys(userEmail);
	}
	public void SetPwd(String passwd)
	{
		pwd.click();
	}
	public void SetFirstName(String uname)
	{
		firststname.sendKeys(uname);
	}
	public void SetlastName(String lname)
	{
		lastName.sendKeys(lname);
	}
	public void SetGender()
	{
		gender.click();
	}
	public void SetDOB(String dob)
	{
		dobtxtbx.sendKeys(dob);
	}
	public void SetCompany(String companyname)
	{
		company.sendKeys(companyname);
	}
	public void ddnewsLetter()
	{
		Select s1 = new Select(newsLetter);
		s1.selectByVisibleText("Your Store name");
	}
	public void ddRoles()
	{
		Select s2 = new Select(custRoles);
		s2.selectByVisibleText("Guest");
	}
	public void ddVendor()
	{
		Select s3 = new Select(vendor);
		s3.selectByVisibleText("Vendor 1");
	}
	public void enterComment(String txtContent)
	{
		adminContent.sendKeys(txtContent);
	}
	public void clickSaveBtn()
	{
		saveBtn.click();
	}

	/*
	 * public String GetSuccessMsg() { String txt = successMsg.getText(); return
	 * txt;
	 * 
	 * }
	 */
	public String getPageTitle()
	{
		return ldriver.getTitle();
	}
	
		
	
	

}
