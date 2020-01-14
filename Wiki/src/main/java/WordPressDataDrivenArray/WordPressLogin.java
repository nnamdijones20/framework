package WordPressDataDrivenArray;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WordPressLogin {

	@Test(dataProvider = "wordPre")
	public void wordPress(String username, String pass) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.wordpress.com");
		
		
		WebElement enterUserName = driver.findElement(By.xpath("//input[@id='usernameOrEmail']"));
		enterUserName.sendKeys(username);
		
		WebElement clickbutton = driver.findElement(By.className("button form-button is-primary"));
		clickbutton.click();
		
		WebElement enterpass = driver .findElement(By.id("password"));
		enterpass.sendKeys(pass);
		
		WebElement login = driver.findElement(By.xpath("//button[@class='button form-button is-primary'])"));
		login.click();
		
		
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.getCurrentUrl().contains("https://wordpress.com/read"), "User is not able to login - invalid credentil");
		
		System.out.print("Successful login");
	}
	
	
	
	
	@DataProvider(name = "wordPre")
	public Object[][] wordPressArr() {
		
		Object[][] objt = new Object[3][2];
		
		objt[0][0] = "princely";
		objt[0][1] = "pri123";
		
		objt[1][0] = "princely";
		objt[1][1] = "pri123";
		
		objt[2][0] = "princelyihezie@yahoo.com";
		objt[2][1] = "fifa2020!!";
		
		
		return objt;
	}
	
}
