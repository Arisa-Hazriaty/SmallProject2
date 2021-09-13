package step_definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.MyAccountPage;
import page_object.OrderHistoryPage;

public class ViewOrderHistorySteps {
	
	public WebDriver driver;
	
	public ViewOrderHistorySteps(){
		super();
		this.driver = Hooks.driver;
	}

	@Given("The User Logged \"(.*)\"  as email, \"(.*)\" as password")
	public void the_user_logged_as_email_as_password(String username, String password) 
	{
	    BookingRoomsviaTransferSteps bookingroomsviatransfersteps = new BookingRoomsviaTransferSteps();
	    bookingroomsviatransfersteps.the_user_login_as_email_as_password(username, password);
	}

	@When("^The User choose Order History and Details$")
	public void the_user_choose_order_history_and_details() {
	    MyAccountPage myaccountpage = new MyAccountPage(driver);
	    myaccountpage.clickBtnOrderHistory();
	}

	@Then("The User verified order history")
	public void the_user_verified_order_history() {
	    OrderHistoryPage orderhistorypage = new OrderHistoryPage(driver);
	    orderhistorypage.getOrderHistory();
	}

	@When("The User put \"(.*)\" comment order")
	public void the_user_put_comment_order() 
	{
	    OrderHistoryPage orderhistoryPage = new OrderHistoryPage(driver);
	    orderhistoryPage.clicklistOrderReference();
	    orderhistoryPage.clickDropdownType();
	    orderhistoryPage.commentExecutiveRooms();
	    orderhistoryPage.clickBtnSendComments();
	}

	@Then("The user see Notification Message successfully sent")
	public void the_user_see_notification_message_successfully_sent() {
		OrderHistoryPage orderhistorypage = new OrderHistoryPage(driver);
		orderhistorypage.getSuccessCommentSent();
	}

}
