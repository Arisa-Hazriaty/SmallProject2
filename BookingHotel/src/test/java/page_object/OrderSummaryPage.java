package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class OrderSummaryPage extends BaseClass {

	public OrderSummaryPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy (css = ".page-subheading")
	private WebElement lblPembayaranViaTransfer;
	
	@FindBy (xpath = "//strong[contains(.,'Anda memilih untuk membayar via transfer bank Uraian singkat pembelanjaan anda')]")
	private WebElement lblTransferSelected;
	
	@FindBy(xpath = "//span[contains(.,'Konfirmasi pembelian')]")
	private WebElement btnKonfirmasiPembelian; 
	
	public void clickBtnKonfirmasiPembelian()
	{
		btnKonfirmasiPembelian.click();
	}
	public void getInformationTransfer()
	{
		WaitUntilElementIsVisible(lblPembayaranViaTransfer);
		lblPembayaranViaTransfer.isDisplayed();
		WaitUntilElementIsVisible(lblTransferSelected);
		lblTransferSelected.isDisplayed();
	}
	

}
