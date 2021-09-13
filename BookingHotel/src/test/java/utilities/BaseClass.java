package utilities;

import java.util.List;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver webDriver;
	
	public static WebDriverWait wait;

	public BaseClass(WebDriver webDriver) {
		BaseClass.webDriver = webDriver;
		wait = new WebDriverWait(webDriver, 10);
		wait.ignoring(WebDriverException.class);
		wait.ignoring(StaleElementReferenceException.class);
	}
	
	public void wait (WebElement webElement) {
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
	}
	
	public void click(WebElement webElement) {
		webElement.click();
	}
	
	public void input(WebElement webElement, String text) {
		webElement.clear();
		webElement.sendKeys(text);
	}
	
	protected void WaitUntilElementIsVisible(WebElement webElement) {

        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
	
	protected void WaitUntilElementIsClickable(WebElement webElement) {

        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
	protected void WaitUntilListElementIsVisible(List<WebElement> webElementList) {

        wait.until(ExpectedConditions.visibilityOfAllElements(webElementList));
    }
	
	
	
	
}