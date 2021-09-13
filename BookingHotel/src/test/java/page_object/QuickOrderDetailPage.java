package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class QuickOrderDetailPage extends BaseClass {

	public QuickOrderDetailPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath = "//div[@class='col-sm-12 proceed_btn_block']//span[contains(.,'Proceed')]")
	private WebElement ButtonProceed;
	
	@FindBy (xpath = "//span[.='Rooms & Price Summary']")
	private WebElement lblPriceSummary;
	
	@FindBy (xpath = "//a[contains(.,'General Rooms')]")
	private WebElement lblGeneralRooms;
	
	@FindBy (xpath = "//p[.='CHECK IN']following-sibling::p")
	private WebElement lblCheckIn;
	
	@FindBy (xpath = "//p[.='15 Sep, Wed']")
	private WebElement lblCheckOut;
	
	@FindBy (xpath = "//div[@class='col-sm-2 col-xs-6']/p[@class='room_duration_block_value']")
	private WebElement lblRooms;
	
	@FindBy (xpath = "//p[contains(.,'02 Adults, 02 Child')]")
	private WebElement lblTotalGuests;
	
	@FindBy (xpath = "//div[@class='rooms_price_block']//span[@class='room_type_current_price']")
	private WebElement lblTotalRoomsPrice;
	
	@FindBy (xpath = "//div[@class='total_price_block']//span[@class='room_type_current_price']")
	private WebElement lblTotalPriceNight;
	
	@FindBy (xpath = "//span[.='2 000,00 Rp‎']")
	private WebElement lblTotalRoomCost;
	
	@FindBy (xpath = "//p[@class='cart_final_total_block']/span[@class='cart_total_values']")
	private WebElement lblFinalTotal;  
	
	@FindBy (xpath = "//a[contains(.,'Proceed')]")
	private WebElement btnProceed;
	
	@FindBy (xpath = "//div[.='Arisa Hazriaty']")
	private WebElement lblName;
	
	@FindBy (xpath = "//div[.='QA-Admin1@getnada.com']")
	private WebElement lblEmail;
	
	@FindBy (xpath = "//div[@id='collapse-guest-info']//div[@class='row margin-btm-10']/div[contains(.,'081234567890')]")
	private WebElement lblMobileNumber;
	
	@FindBy (xpath = "//div[@id='collapse-guest-info']//span[contains(.,'Proceed')]")
	private WebElement btnProceedTnc;
	
	@FindBy (id = "cgv")
	private WebElement chxboxTnc;
	
	@FindBy (xpath = "//div[@id='collapse-guest-info']//a[contains(.,'Proceed')]")
	private WebElement btnProceedPayment;
	
	@FindBy (css = ".bankwire")
	private WebElement btnBankWirePayment;
	
	@FindBy (css = ".cheque")
	private WebElement btnChequePayment;
	
	@FindBy (css = "//a[contains(.,'Pay with your card or your PayPal account')]")
	private WebElement btnPayPalPayment;
	
	public void clickBtnProceed()
	{
		btnProceed.click();
	}	
	public void ClickbtnProceedTnc()
	{
		btnProceedPayment.click();
	}
	public void ClickCheckBoxTnc()
	{
		chxboxTnc.click();
	}
	public void ClickbtnBankWire()
	{
		btnBankWirePayment.click();
	}
	public void GetPaymentDetail(){
        WaitUntilElementIsVisible(lblPriceSummary);
        lblPriceSummary.isDisplayed();
        WaitUntilElementIsVisible(lblCheckIn);
        lblCheckOut.isDisplayed();
        WaitUntilElementIsVisible(lblRooms);
        lblRooms.isDisplayed();
        WaitUntilElementIsVisible(lblTotalGuests);
        lblTotalGuests.isDisplayed();
        WaitUntilElementIsVisible(lblRooms);
        lblRooms.isDisplayed();
        WaitUntilElementIsVisible(lblTotalPriceNight);
        lblTotalPriceNight.isDisplayed();
        WaitUntilElementIsVisible(lblTotalRoomCost);
        lblTotalRoomCost.isDisplayed();
        WaitUntilElementIsVisible(lblFinalTotal);
        lblFinalTotal.isDisplayed();
        
    }

}

