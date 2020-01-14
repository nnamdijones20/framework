package ListenerPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenerPackage.TestNGListerner.class)
public class ListenerPractice {
WebDriver driver;
	
	@Test
	public void googlePageTitle() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String webEle = driver.getTitle();
		System.out.println(webEle);
		driver.quit();
	}
	
//	@Test
//	public void findTitle() {
//	String webEle = driver.getTitle();
//	System.out.println(webEle);
//	driver.quit();
//	}
	
//	@AfterMethod()
//	public void quit() {
//		driver.quit();
//	}
}
