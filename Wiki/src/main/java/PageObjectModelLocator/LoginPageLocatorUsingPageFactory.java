package PageObjectModelLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPageLocatorUsingPageFactory {

	WebDriver driver;
	
	public LoginPageLocatorUsingPageFactory(WebDriver driver) {
		this.driver = driver;
	}
	
	//Here you use "How" keyword to specify path and with "Using" keyword you specify UI page element
	@FindBy(how = How.XPATH, using = "(//input[@class='inputtext login_form_input_box'])[1]") 
	//@CacheLookup
	WebElement username;
	
	//Here you use "How" keyword to specify path and with "Using" keyword you specify UI page element

	@FindBy(how = How.XPATH, using = "(//input[@class='inputtext login_form_input_box'])[2]")
	//@CacheLookup
	WebElement password;
	
	//Here you use "How" keyword to specify path and with "Using" keyword you specify UI page element

	@FindBy(how = How.XPATH, using = "//input[@type = 'submit']") 
	//@CacheLookup
	WebElement clickSignInButton;
	
	
	public void login_glassdoorPageFactory(String uid, String pass) {
		
		username.sendKeys(uid);
		password.sendKeys(pass);
		clickSignInButton.click();
		
	}
}


