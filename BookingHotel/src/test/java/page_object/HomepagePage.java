package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class HomepagePage extends BaseClass{
	
	public HomepagePage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(css = ".user_login")
	private WebElement loginMenu;
	
	@FindBy(xpath = "//div[@class='shopping_cart']/a")
	private WebElement keranjangIcon;
	
	@FindBy(xpath = "//button[@class='nav_toggle']")
	private WebElement burgerMenu;
	
	@FindBy (xpath = "//button[@class='nav_toggle']")
	private WebElement homeMenu;
	
	@FindBy (xpath = "//a[.='Interior']")
	private WebElement interiorMenu;
	
	@FindBy (xpath = "//a[.='Amenities']")
	private WebElement amenitiesMenu;
	
	@FindBy (xpath = "//a[.='Rooms']")
	private WebElement roomMenu;
	
	@FindBy (xpath = "//a[.='Testimonials']")
	private WebElement testimoniMenu;
	
	@FindBy (xpath = "//li[6]/a")
	private WebElement kebijakanMenu;
	
	@FindBy (xpath = "//li[7]/a")
	private WebElement kamiMenu;
	
	@FindBy (xpath = "//a[.='Contact']")
	private WebElement contactMenu;
	
	@FindBy (css = ".user_login")
	private WebElement signinMenu;
	
	@FindBy (css = ".icon-close")
	private WebElement closeMenuBurger;
	
	@FindBy (css = ".header-hotel-name")
	private WebElement nameHotelLabel;
	
	@FindBy (xpath = "//span[.='Make Booking']")
	private WebElement makeBookingButton;
	
	@FindBy (id = "hotel_location")
	private WebElement txtHotelLocation;
	
	@FindBy (id = "id_hotel_button")
	private WebElement DropDownHotel;
	
	@FindBy (css = ".search_result_li")
	private WebElement DropdownTheHotelPrime;
	
	@FindBy (id = "check_in_time")
	private WebElement checkInPicker;
	
	@FindBy (xpath = "//a[.='14']")
	private WebElement dateCheckIn;
	
	@FindBy (id = "check_out_time")
	private WebElement checkOutTime;
	
	@FindBy (xpath = "//a[.='15']")
	private WebElement dateCheckOut;
	
	@FindBy (xpath = "//span[.='Search Now']")
	private WebElement BtnSearchNow;
	
	@FindBy (xpath = "//i[@class='icon-angle-left']")
	private WebElement interiorsliderLeft;
	
	@FindBy (xpath = "//i[@class='icon-angle-right']")
	private WebElement interiorsliderRight;
	
	@FindBy (xpath = "//p[.='Amenities']")
	private WebElement amenitiesSection;
	
	@FindBy (xpath = "//p[.='Our Rooms']")
	private WebElement ourRoomSection;
	
	@FindBy (xpath = "//a[@href='http://qa.cilsy.id:8080/en/the-hotel-prime/2-super-delux-rooms.html']")
	private WebElement bookingDeluxButton;
	
	public void clickSignIn()
	{
		signinMenu.click();
	}
	
	/*public boolean isDisplayed() {
		wait(loginMenu);
		wait(keranjangIcon);
		wait(burgerMenu);
		wait(signinMenu);
		return true;
	}*/
	public void setHotelLocation(String hotelLocation)
	{
		txtHotelLocation.sendKeys(hotelLocation);
	}
	public void clickSelectHotel()
	{
		DropDownHotel.click();
		DropdownTheHotelPrime.click();
		
	}
	public void clickButtonCheckIn()
	{
		checkInPicker.click();
		dateCheckIn.click();
		
	}
	public void clickButtonChecOut()
	{
		checkOutTime.click();
		dateCheckOut.click(); 
	}
	public void clickSearchNow() {
		BtnSearchNow.click();
	}
	
}