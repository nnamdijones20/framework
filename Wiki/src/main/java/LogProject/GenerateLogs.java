package LogProject;

//
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import jdk.nashorn.internal.runtime.Property;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenerateLogs {

	@Test
	//public static void main(String[] args) {
	public void logClass() {
		Logger logger = Logger.getLogger("GenerateLogs");
		
		//Configure Your Log4J Property File By using PropertyConfigurator.configure Method
		PropertyConfigurator.configure("log4j.properties");
		
		
		WebDriver driver = new ChromeDriver();
		logger.info("Chrome driver initiated");
		
		driver.get("https://outlook.live.com/owa/");
		logger.info("Navigate to hotmail.com");
		
		driver.manage().window().maximize();
		logger.info("Maximize windom");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement clickSignIn = driver.findElement(By.xpath("//a[@class='internal sign-in-link']"));
		clickSignIn.click();
		
		WebElement username = driver.findElement(By.id("i0116"));
		
		username.clear();
		
		username.sendKeys("nnamdijones20@hotmail.com");
		logger.info("Enter username");
		
		
		WebElement nextButton = driver.findElement(By.xpath("//input[@id='idSIButton9']"));
		nextButton.click();
		
		WebElement password = driver.findElement(By.id("i0118"));
		logger.info("Enter password");
		password.sendKeys("123456");
	}
	
}
