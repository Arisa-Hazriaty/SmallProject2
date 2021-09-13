package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class AccountCreationPage  extends BaseClass{

	public AccountCreationPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "//input[@value='2']")
	private WebElement titleLabel;
	
	@FindBy(id = "customer_firstname")
	private WebElement setFirstName;
	
	@FindBy(id = "customer_lastname")
	private WebElement setLastName;
	
	@FindBy(id = "passwd")
	private WebElement setPassword;
	
	@FindBy (id = "email")
	private WebElement getEmail;
	
	@FindBy (id = "submitAccount")
	private WebElement clickRegister;
	
	@FindBy (xpath = "//div[@class='alert alert-danger']")
	private WebElement getAlert;
	
	@FindBy (xpath = "//p[.='There are 3 errors']")
	private WebElement getErrorAllEmpty;
	
	@FindBy (id = "days")
	private WebElement dayDropDown;
	
	@FindBy (id = "months")
	private WebElement monthDropDown;
	
	@FindBy (id = "years")
	private WebElement yearsDropdown;
	
	@FindBy (id = "newsletter")
	private WebElement newsLetterCheckBox;
	
	@FindBy (id = "optin")
	private WebElement specialOfferMenu;
	
	@FindBy (xpath = "//span[.='*Required field']")
	private WebElement requiredFieldLabel;
	
	public void setfirstName(String firstname)
	{
		setFirstName.sendKeys(firstname);
	}
	
	public void setlastName(String lastname)
	{
		setLastName.sendKeys(lastname);
	}
	
	public void setPassword(String password)
	{
		setPassword.sendKeys(password);
	}
	public void clickRegister()
	{
	clickRegister.click();
	}
	public void clickRegisterEmpty()
	{
		 WaitUntilElementIsVisible(getAlert);
		 getAlert.isDisplayed();
		 WaitUntilElementIsVisible(getErrorAllEmpty);
		 getErrorAllEmpty.isDisplayed();
	}
	
	public boolean isDisplayed() {
		wait(setFirstName);
		wait(setLastName);
		wait(setPassword);
		return true;
	}

}
