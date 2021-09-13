package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class OrderConfirmationPage extends BaseClass {

	public OrderConfirmationPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy (css = ".alert")
	private WebElement alertSuccess;
	
	@FindBy (xpath = "//tfoot[1]/tr[1]//span[.='2 200,00 Rp‎']")
	private WebElement lblRoomTaxIncL;
	
	@FindBy (xpath = "//tr[@class='totalprice item']//span[.='2 200,00 Rp‎']")
	private WebElement lblFinalBookingTotal;
	
	@FindBy (xpath = "'//tfoot[1]/tr[1]//span[.='2 200,00 Rp‎']'")
	private WebElement lblDueAmount;
	
	public void getSuccessOrderConfirmation()
	{
	 alertSuccess.isDisplayed();
	 lblRoomTaxIncL.isDisplayed();
	 lblFinalBookingTotal.isDisplayed();
	 lblDueAmount.isDisplayed();
	}
	

}
