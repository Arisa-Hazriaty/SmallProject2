package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class OrderHistoryPage extends BaseClass {

	public OrderHistoryPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy (xpath = "//th[@class='first_item footable-first-column']")
	private WebElement tblOrderReference;
	
	@FindBy (xpath = "//th[.='Date']")
	private WebElement tblDate;
	
	@FindBy (xpath = "//th[.='Total price']")
	private WebElement tblTotalprice;
	
	@FindBy (xpath = "//th[@class='item footable-last-column footable-sortable']")
	private WebElement tblStatus;
	
	@FindBy(xpath = "//td[contains(.,'UFQOIRUJQ')]")
	private WebElement listOrderReference;
	
	@FindBy(name = "id_product")
	private WebElement dropDownRoomType;
	
	@FindBy (xpath = "//option[@value='3']")
	private WebElement dropdownExecutiveRooms;
	
	@FindBy (name = "msgText")
	private WebElement txtAreaComments;
	
	@FindBy (xpath = "//span[.='Send']")
	private WebElement btnSendComments;
	
	@FindBy (css = ".alert")
	private WebElement alertSuccessMessageSent;
	
	
	public void getOrderHistory()
	{
		WaitUntilElementIsVisible(tblOrderReference);
		tblOrderReference.isDisplayed();
		WaitUntilElementIsVisible(tblDate);
		tblDate.isDisplayed();
		WaitUntilElementIsVisible(tblTotalprice);
		tblTotalprice.isDisplayed();
		WaitUntilElementIsVisible(tblStatus);
		tblStatus.isDisplayed();
	}
	
	public void clicklistOrderReference()
	{
		listOrderReference.click();
	}
	public void clickDropdownType()
	{
		dropDownRoomType.click();
		dropdownExecutiveRooms.click();
	}
	public String commentExecutiveRooms() {
		return txtAreaComments.getText();
	}
	public void clickBtnSendComments()
	{
		btnSendComments.click();
	}
	public void getSuccessCommentSent()
	{
		WaitUntilElementIsVisible(alertSuccessMessageSent);
		alertSuccessMessageSent.isDisplayed();
	}

	
	
	
	

}
