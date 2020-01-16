package PageObjectModelLocator;

//
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageLocator {

/**
 * This class will store all the locator and method of login
 
 */
	WebDriver driver;
	
	By userId = By.id("userEmail");
	By passwrd = By.xpath("//input[@id='userPassword']");
	
	By signInButton = By.name("gd-ui-button minWidthBtn css-r97zbm");
	
	
	public LoginPageLocator(WebDriver idriver) {
		
		this.driver = idriver;
			
	}
	
	// CASE 1: WE can use Parameterization Here
	
	public void loginGlassdoorParameterization(String useId, String passId) {
		
		driver.findElement(userId).sendKeys(useId);
		driver.findElement(passwrd).sendKeys(passId);
		driver.findElement(signInButton).click();
		
	}
	
	
	// CASE 2: Or we can write out the program without Parameterization. Using the below
	
	public void enterUserId(String uid) {
		
		driver.findElement(userId).sendKeys(uid);
	}
	
	public void enterPasswrd(String pid) {
		
		driver.findElement(passwrd).sendKeys(pid);
	}
	
	public void clickSignInButton() {
		
		driver.findElement(signInButton).click();
	}
	
}
