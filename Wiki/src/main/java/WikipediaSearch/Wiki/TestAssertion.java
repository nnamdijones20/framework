package WikipediaSearch.Wiki;

//
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.*;

public class TestAssertion {
	
	WebDriver driver;
	SoftAssert sa;
	
	@BeforeMethod(description="Starting browser")
	public void invokeDriver() {
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void testHardAssert() {
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		String titleWord = "1Google";
		Assert.assertEquals(titleWord, title, "");
		System.out.println("Hard Assert worked");
	}
	
	
	@Test
	public void testSoftAssert() {
		sa = new SoftAssert();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		String titleWord = "1Google";
		sa.assertEquals(titleWord, title, "");
		sa.assertAll();
		System.out.println("Soft Assert is working");
	}
	
	
	@AfterMethod(description="Quit browser")
	public void quitBrower() {
		driver.quit();
	}
	
	
	
}
