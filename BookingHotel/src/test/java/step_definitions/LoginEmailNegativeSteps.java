package step_definitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.HomepagePage;
import page_object.LoginAuthentication;

public class LoginEmailNegativeSteps {
	
	private WebDriver driver;
	
	public LoginEmailNegativeSteps()

	{
		super();
		this.driver = Hooks.driver;
	}
	
	@Given("The User on the Home Page")
	public void the_user_on_the_home_page() {
	    HomepagePage homepagePage = new HomepagePage(driver);
	    homepagePage.clickSignIn();
	}

	@When("User login \"(.*)\" as email and \"(.*)\" as password")
	public void user_login_as_email_and_as_password(String username, String password) {
	    LoginAuthentication loginauthentication = new LoginAuthentication(driver);
	    loginauthentication.inputEmailAddress(username);
	    loginauthentication.inputPassword(password);
	    loginauthentication.clickSignMenu();
	}

	@Then("Error notification should displayed")
	public void error_notification_should_displayed() 
	{
		LoginAuthentication loginauthentication = new LoginAuthentication(driver);
		loginauthentication.getDisplayedEmailInvalid();
	}
}
