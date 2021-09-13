package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class CategoryRoomPage extends BaseClass {

	public CategoryRoomPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy (id = "price_ftr")
	private WebElement dropdownlistLowestPrice;
	
	@FindBy (xpath = "//p[.='General Rooms']")
	private WebElement generalRoomsLabel;
	
	@FindBy (xpath = "//p[.='Delux Rooms']")
	private WebElement deluxeRoomsLabel;
	
	@FindBy (xpath = "//p[.='Executive Rooms']")
	private WebElement executiveRoomsLabel;
	
	@FindBy (xpath = "//div[@id='category_data_cont']/div[3]//i[@class='icon-plus']")
	private WebElement iconAddQtyExecutive;
	
	@FindBy (xpath = "//p[.='luxury Rooms']")
	private WebElement luxuryRoomsLabel;
	
	@FindBy (xpath = "//div[@id='category_data_cont']/div[1]//a[.='Book Now']")
	private WebElement generalRoomBookingButton;
	
	@FindBy (xpath = "//div[@id='category_data_cont']/div[2]//span[.='Book Now']")
	private WebElement deluxeRoomBookingButton;
	
	@FindBy (xpath =  "//div[@id='category_data_cont']/div[3]//span[.='Book Now']")
	private WebElement executiveRoomBookingButton;
	
	@FindBy (xpath = "//div[@id='filter_results']//div[@class='col-sm-12 lf_sub_cont']/div[1]//input[@value='5']")
	private WebElement checkBoxBintangLima;
	
	@FindBy (xpath = "//span[.='No room available for this hotel!']")
	private WebElement alertnoRoom;
	
	@FindBy (xpath = "//div[@id='filter_results']/div[@class='col-sm-12']/div[1]//span[@class='pull-right clear_filter']")
	private WebElement clearButton;
	
	@FindBy (xpath = "//h2[contains(.,'Room successfully added to your cart')]")
	private WebElement lblSuccessAddtoCart;
	
	@FindBy (xpath = "//span[@class='ajax_cart_product_txt_s ']")
	private WebElement yourCartLabel;
	
	@FindBy (xpath = "//span[@class='continue btn btn-default button exclusive-medium']/span[contains(.,'Continue shopping')]")
	private WebElement ButtonContinueShopping;
	
	@FindBy (xpath = "//span[contains(.,'Proceed to checkout')]")
	private WebElement ButtonCheckout;
	
	@FindBy (xpath = "//div[@class='order-detail-content']/div[2]//a[contains(.,'Remove')]")
	private WebElement ButtonDeleteDeluxeRooms;
	
	@FindBy (xpath = "//div[@class='order-detail-content']/div[2]//a[contains(.,'Remove')]")
	private WebElement ButtonDeleteluxuryRooms;
	
	
	public void clickAddQtyExecutiveRooms()
	{
		iconAddQtyExecutive.click();
	}
	public void clickButtonBookingNowExececutive()
	{
		executiveRoomBookingButton.click();
	}
	public void clickCheckOutButton()
	{
		ButtonCheckout.click();
	}
	public String getSucceessAddtoCart()
	{
		return lblSuccessAddtoCart.getText();
	}
	
	//h2[contains(.,'Room successfully added to your cart')]


}
