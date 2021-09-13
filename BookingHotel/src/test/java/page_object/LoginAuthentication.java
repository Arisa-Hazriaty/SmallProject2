package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LoginAuthentication extends BaseClass {
		
		public LoginAuthentication(WebDriver webDriver) {
			super(webDriver);
			PageFactory.initElements(webDriver, this);
		}
		
		@FindBy (id = "email_create")
		private WebElement txtEmailAddress;
		
		@FindBy (xpath = "//span[contains(.,'Create an account')]")
		private WebElement createAccountButton;
		
		@FindBy (id = "email")
		private WebElement txtEmail;
		
		@FindBy (id = "passwd")
		private WebElement txtPassword;
		
		@FindBy(xpath = "//a[.='Forgot your password?']")
		private WebElement forgotPassword;
		
		@FindBy (id = "authentication")
		private WebElement signInButton;
		
		@FindBy (css = ".page-heading")
		private WebElement atuthenticationLabel;
		
		@FindBy (css = "//span[@class='hide_xs']")
		private WebElement signInMenu;
		
		@FindBy (xpath = "//a[@title='View my booking cart']")
		private WebElement cartIcon;
		
		@FindBy (xpath = "//button[@class='nav_toggle']/span[2]")
		private WebElement burgerMenu;
		
		@FindBy (id = "create_account_error")
		private WebElement emailEmptyLabel;
		
		@FindBy (css = ".form-error")
		private WebElement txtEmailInvalid;
		
		public void registerEmailAddress(String emailAddress) 
		{
			txtEmailAddress.sendKeys(emailAddress);
		}
		
		public void clickSubmit() 
		{
		createAccountButton.click();
		}
		
		public void inputEmailAddress(String email)
		{
			txtEmail.sendKeys(email);
		}
		public void inputPassword(String password)
		{
			txtPassword.sendKeys(password);
		}
		public void clickSignMenu()
		{
			signInButton.click();
		}
		public boolean getDisplayedEmailInvalid()
		{
			WaitUntilElementIsVisible(txtEmailInvalid);
			txtEmailInvalid.isDisplayed();
			return true;
		}
		
		
		
		

}
