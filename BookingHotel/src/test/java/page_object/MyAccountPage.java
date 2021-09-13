package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class MyAccountPage extends BaseClass{

	public MyAccountPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy (xpath = "//p[@class='alert alert-success']")
	private WebElement getSuccess;
	
	@FindBy (xpath = "//span[.='Add my first address']")
	private WebElement btnAddAddress;
	
	@FindBy (xpath = "//span[contains(.,'Home')]")
	private WebElement btnHome;
	
	@FindBy (xpath = "//span[.='Order history and details']")
	private WebElement btnOrderHistory;
	
	public void getSuccessAccountCreated()
	{
		   WaitUntilElementIsVisible(getSuccess);
		   getSuccess.isDisplayed();
	}
	public void clickAddressMenu()
	{
		btnAddAddress.click();
	}
	public void clickBtnHome()
	{
		btnHome.click();
	}
	public void clickBtnOrderHistory()
	{
		btnOrderHistory.click();
	}

}
