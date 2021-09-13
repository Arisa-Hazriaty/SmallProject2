package step_definitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page_object.AccountCreationPage;
import page_object.AddressDetailPage;
import page_object.HomepagePage;
import page_object.LoginAuthentication;
import page_object.MyAccountPage;
import page_object.addressPage;

public class CreateAccountSteps {
	
	private WebDriver driver;

	private Faker faker = new Faker();
	
	public CreateAccountSteps() {
		super();
		this.driver = Hooks.driver;
	}

    @Given("^User on the Homepage$")
    public void clickSignInMenu()throws Throwable
    {
    	HomepagePage homepagePage = new HomepagePage(driver);
    	//Thread.sleep(3000);
    	homepagePage.clickSignIn();
    }
    @When ("User register \"(.*)\" as Email Address")
    public void registerEmailAddress(String email) throws Throwable
    {
    	if (email.equals("valid")) {
			email = faker.name().username();
			email = email+"@getnada.com";
		}
    	
    	LoginAuthentication myAccountPage = new LoginAuthentication(driver);
    	myAccountPage.registerEmailAddress(email);
    	myAccountPage.clickSubmit();
    }
    
    @When ("User set \"(.*)\" as firstname, \"(.*)\" as lastname, \"(.*)\" as password")
    public void setPersonaInformation (String firstname, String lastname, String password) throws InterruptedException
    {
    	if (firstname.equals("valid")) {
    		firstname = faker.name().firstName();
    	}if (lastname.equals("valid")) {
    		lastname = faker.name().lastName();
    	} 

    	AccountCreationPage accountCreationPage = new AccountCreationPage(driver);
    	assertTrue(accountCreationPage.isDisplayed());
    	accountCreationPage.setfirstName(firstname);
    	accountCreationPage.setlastName(lastname);
    	accountCreationPage.setPassword(password);
    	accountCreationPage.clickRegister();
    			
    }
    @Then("^User see my Account Page$")
    public void getMyAccount()
    {
    	MyAccountPage myAccountPage = new MyAccountPage(driver);
    	myAccountPage.getSuccessAccountCreated();
    	myAccountPage.clickAddressMenu();
    }
    
    @When("User set the Address \"(.*)\" as address, \"(.*)\" as city, \"(.*)\" as zipcode, \"(.*)\" as phone")
    public void setAddresses(String address, String city, String zipcode, String phone)throws InterruptedException
    {
   
    	addressPage addressPage = new addressPage(driver);
    	addressPage.setAddress(address);
    	addressPage.setZipCode(zipcode);
    	addressPage.setCity(city);
    	Thread.sleep(3000);
    	addressPage.setState();
    	addressPage.setStateList();
    	addressPage.setPhone(phone);
    	addressPage.clickSave();
 
    }
    @Then("User see His Address")
    public void getAddress()
    {
    	AddressDetailPage addressDetailPage = new AddressDetailPage(driver);
    	addressDetailPage.GetAddressDetail();
    }
    
}
