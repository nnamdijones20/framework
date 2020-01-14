package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BrowserFactory {
	
	 public static WebDriver driver = null;
	
	 @BeforeSuite
	public  void startBrowser()  {
	//(String browser, String url) {
			
			driver = new ChromeDriver();
		
		// We use this class to reduce redundancy of re writing codes
//		 if(browser.equalsIgnoreCase("Firefox")) {
//			//driver = new FireFox();
//		}
//		
//		else if(browser.equalsIgnoreCase("IE")) {
//			//driver = new IEDriver();
//		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		//driver.get(url);
		
		//return driver;
	}
	 
	 @AfterSuite
	 public void quitBrowser() {
		 driver.quit();
	 }

}
