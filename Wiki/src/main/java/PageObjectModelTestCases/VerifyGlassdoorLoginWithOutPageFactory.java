// THIS IS USING Page Object Model Without Page-Factory and @Find-By 
//
package PageObjectModelTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectModelLocator.LoginPageLocator;


public class VerifyGlassdoorLoginWithOutPageFactory {

	WebDriver driver;
	
    @BeforeTest
    public void beforetest() {
    driver = new ChromeDriver();
   	 driver.manage().window().maximize();
   	 
    }
	
	@Test
    public void verifyLogin() {
		
	 
	 driver.get("https://www.glassdoor.com/profile/login_input.htm?userOriginHook=HEADER_SIGNIN_LINK");
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	 //In here we will call our Locator class Constructor
	 LoginPageLocator loginpage = new LoginPageLocator(driver);
	 
	 
 //CASE 1: We will parameterize enterUserID, enterPasswrd, and Click Signing button
	 
	 loginpage.loginGlassdoorParameterization("prince", "12345");
	 
// CASE 2: We can do without parameterization	 
	 loginpage.enterUserId("Prince");
	 loginpage.enterPasswrd("12345");
	 loginpage.clickSignInButton();

	}
	
	 @AfterTest
	 public void quitTest() {
		 
	 driver.quit();
	 }
	 
	}

