package page_object;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class addressPage extends BaseClass {

	public addressPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}

	@FindBy (xpath = "//p[@class='required']")
	private WebElement requiredLabel;
	
	@FindBy (id = "firstname")
	private WebElement txtFirstname;
	
	@FindBy (id = "lastname")
	private WebElement txtlastname;
	
	@FindBy (id = "company")
	private WebElement txtCompany;
	
	@FindBy (id = "address1")
	private WebElement txtAddress;
	
	@FindBy (xpath = "address2")
	private WebElement txtAddressLine2;
	
	@FindBy (id = "postcode")
	private WebElement txtZipCode;
	
	@FindBy (id = "city")
	private WebElement txtCity;
	
	@FindBy (id = "id_state")
	private WebElement stateDropDown;
	
	@FindBy (xpath = "//select[@id='id_state']//option")
	private List<WebElement> stateOptionlist;
	
	@FindBy (xpath = "//option[@value=236]")
	private WebElement stateBantenList;
	
	@FindBy (id = "id_country")
	private WebElement countryDropDownlist;
	
	@FindBy (id = "phone")
	private WebElement txtPhone;
	
	@FindBy (css = ".inline-infos")
	private WebElement alertPhoneLabel;
	
	@FindBy (id = "phone_mobile")
	private WebElement txtMobile;
	
	@FindBy (id = "other")
	private WebElement txtAreaAdditionalInformation;
	
	@FindBy (id = "alias")
	private WebElement txtAddressTittle;
	
	@FindBy (id = "submitAddress")
	private WebElement saveButton;
	
	@FindBy (xpath = "//span[contains(.,'Back to your addresses')]")
	private WebElement backButton;
	
	@FindBy (xpath = "//li[.='address1 is required.']")
	private WebElement address1RequiredLabel;
	
	@FindBy (xpath = "//li[.='city is required.']")
	private WebElement cityRequiredLabel;
	
	@FindBy (xpath = "//li[.='You must register at least one phone number.']")
	private WebElement phoneNumberRequiredLabel;
	
	@FindBy (xpath = "//li[.='This country requires you to chose a State.']")
	private WebElement CountryRequiredLabel;
	
	@FindBy (xpath = "//li[.=\"The Zip/Postal code you've entered is invalid. It must follow this format: 00000\"]")
	private WebElement zipCodeRequiredLabel;
	
	public void setAddress(String address) {
		txtAddress.sendKeys(address);

	}
	public void setCity(String city)
	{
		txtCity.sendKeys(city);
	}
	public void setState() {
		/*WaitUntilElementIsVisible(stateDropDown);
		stateDropDown.isDisplayed();
        WaitUntilElementIsClickable(stateDropDown);
        stateDropDown.isEnabled();*/
        stateDropDown.click();
	}
	public void setStateList() {
        stateBantenList.click();
	}
	public void setZipCode(String zipcode) {
		txtZipCode.sendKeys(zipcode);
	}
	public void setPhone (String phone)
	{
		txtPhone.sendKeys(phone);
	}
	public void clickSave() {
		saveButton.click();
	}
	public void clickBackToAddress()
	{
		backButton.click();
	}
}
