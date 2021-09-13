package step_definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.CategoryRoomPage;
import page_object.HomepagePage;
import page_object.LoginAuthentication;
import page_object.MyAccountPage;
import page_object.OrderConfirmationPage;
import page_object.OrderSummaryPage;
import page_object.QuickOrderDetailPage;

public class BookingRoomsviaTransferSteps {
	
	public WebDriver driver;

	public BookingRoomsviaTransferSteps() {
		super();
		this.driver = Hooks.driver;
	}
	
    @Given("The User Login \"(.*)\"  as email, \"(.*)\" as password")
    public void the_user_login_as_email_as_password(String username, String password)
    {
    	LoginAuthentication login = new LoginAuthentication(driver);
    	login.inputEmailAddress(password);
    	login.inputPassword(username);
    	login.clickSignMenu();
    }
    
    @When("^The User go to HomePage$")
    public void the_user_go_to_home_page()  
    {
    	MyAccountPage myaccountpage = new MyAccountPage(driver);
    	myaccountpage.clickBtnHome();
    }
    @When("The User set \"(.*)\", select The Hotel Prime, set CheckIn and Checkout ")
    public void setHotel(String hotellocation)
    {
    	HomepagePage homepage = new HomepagePage(driver);
    	homepage.setHotelLocation(hotellocation);
    	homepage.clickSelectHotel();
    	homepage.clickButtonCheckIn();
    	homepage.clickButtonChecOut();
    }
    
    @When("^The User search hotel$")
    public void the_user_search_hotel() 
    {
    	HomepagePage homepage = new HomepagePage(driver);
    	homepage.clickSearchNow();
    }
    
   @When("^The User choose how many room input$")
   public void setQuantity()
   {
	   CategoryRoomPage categoryroompage = new CategoryRoomPage(driver);
	   categoryroompage.clickAddQtyExecutiveRooms();
	   categoryroompage.clickButtonBookingNowExececutive();
	   categoryroompage.getSucceessAddtoCart().contains("Room successfully added to your cart");
	   
   }
   @Then("The User continue process payment")
   public void clickButtonContinueProcess()
   {
	   CategoryRoomPage categoryroompage = new CategoryRoomPage(driver);
	   categoryroompage.clickCheckOutButton();
	   
   }
   @When("^The User validate Rooms & Summary$")
   public void CheckRoomsPriceSummary()
   {
	   QuickOrderDetailPage quickorderdetailpage = new QuickOrderDetailPage(driver);
	   quickorderdetailpage.GetPaymentDetail();
	   quickorderdetailpage.clickBtnProceed();
	   quickorderdetailpage.ClickbtnProceedTnc();
	   quickorderdetailpage.ClickCheckBoxTnc();
	   quickorderdetailpage.ClickbtnBankWire();
	   
   }
   @When("^The User Confirmation Order via Transfer as payment method$")
   public void viewOrderSummary()
   {
	   OrderSummaryPage ordersummarypage =new OrderSummaryPage(driver);
	   ordersummarypage.getInformationTransfer();
	   ordersummarypage.clickBtnKonfirmasiPembelian();
}
   @Then("^The User see Order Confirmation$")
   public void OrderConfirmation()
   {
	   OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage(driver);
	   orderConfirmationPage.getSuccessOrderConfirmation();
   }
}
