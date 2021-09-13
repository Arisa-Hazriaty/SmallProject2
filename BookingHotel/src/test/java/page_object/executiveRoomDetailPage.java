package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class executiveRoomDetailPage extends BaseClass{

	public executiveRoomDetailPage(WebDriver webDriver) {
		super(webDriver);
		PageFactory.initElements(webDriver, this);
	}
	
	

}
