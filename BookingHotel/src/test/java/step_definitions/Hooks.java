package step_definitions;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	    public static WebDriver driver;

	    @Before
	    /**
	     * Delete all cookies at the start of each scenario to avoid
	     * shared state between tests
	     */
	    public void openBrowser() throws MalformedURLException {
	    	System.setProperty("webdriver.chrome.driver", "/Users/arisahazriaty/eclipse-workspace/SeleniumTesting/Lib/driver/chromedriver");
	    	driver = new ChromeDriver();
	    	driver.manage().deleteAllCookies();
	    	
	    	driver.manage().window().maximize();
			driver.get("http://qa.cilsy.id:8080/en/");
	    }

	 
	    
	  @After
	    /**
	     * Embed a screenshot in test report if test is marked as failed
	     */
	   public void embedScreenshot(Scenario scenario) {
	      
	      if (scenario.isFailed()) {        try {
	        scenario.write("Current Page URL is " + driver.getCurrentUrl());
//	         byte[] screenshot = getScreenshotAs(OutputType.BYTES);
//	         byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//	         scenario.attach(screenshot, "image/png", "blah.png");
	        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
	            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
	        }        
	        }
	 //       driver.quit();
	       
	   }

}
