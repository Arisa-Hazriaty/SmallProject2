package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class AddressDetailPage extends BaseClass {

	public AddressDetailPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy (xpath = "//h3[@class='page-subheading']")
	private WebElement myAddressLabel;

	@FindBy (xpath = "//ul[@class='last_item item box']/li[2]")
	private WebElement addressLabel;
	
	@FindBy (xpath = "//span[contains(.,'15115')]")
	private WebElement zipcodeLabel;
	
	@FindBy (xpath = "//span[@class='address_city']")
	private WebElement cityLabel;
	
	@FindBy (xpath = "//span[contains(.,'Banten')]")
	private WebElement stateLabel;
	
	@FindBy (xpath = "//li[9]/span[contains(.,'Indonesia')]")
	private WebElement countryLabel;
	
	@FindBy (xpath = "//span[@class='address_phone']")
	private WebElement phoneLabel;
	
	public void GetAddressDetail(){
        WaitUntilElementIsVisible(myAddressLabel);
        myAddressLabel.isDisplayed();
        WaitUntilElementIsVisible(addressLabel);
        addressLabel.isDisplayed();
        WaitUntilElementIsVisible(zipcodeLabel);
        zipcodeLabel.isDisplayed();
        WaitUntilElementIsVisible(cityLabel);
        cityLabel.isDisplayed();
        WaitUntilElementIsVisible(stateLabel);
        stateLabel.isDisplayed();
        WaitUntilElementIsVisible(countryLabel);
        countryLabel.isDisplayed();
        WaitUntilElementIsVisible(phoneLabel);
        phoneLabel.isDisplayed();
        
    }
}
