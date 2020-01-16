package PageObjectModelTestCases;

//
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModelLocator.LoginPageLocatorUsingPageFactory;
import Utility.BrowserFactory;

public class VerifyGlassdoorLoginForPageFactory extends BrowserFactory{

	
	@Test
	public void checkValidUserNew() {
		
		//This will launch browser and specific url
	//WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.goal.com");
	System.out.println("found url");
	
		// Created page object using PageFactory
	LoginPageLocatorUsingPageFactory login_page = PageFactory.initElements(driver, LoginPageLocatorUsingPageFactory.class);
	
	
		//Here, we used our object "login_page" with the method from our initialize class to enter username and password
	login_page.login_glassdoorPageFactory("ihe15001@byui.edu", "Fifa2018");
	
	}
}
