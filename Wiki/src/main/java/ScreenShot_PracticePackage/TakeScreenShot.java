package ScreenShot_PracticePackage;

//
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenShot {
	
	static WebDriver driver;
	
	@Test
	public void navigateGmail() throws IOException {
		
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		//1. Take screenshot and store it as a file format
		TakesScreenshot takeScreenshot = (TakesScreenshot)driver;
		File file = takeScreenshot.getScreenshotAs(OutputType.FILE);
				
		//2. Now copy the screenshot to desired location using copyfile method:
		FileUtils.copyFile(file, new File("./ScreenShotFolder/google.png"));
		driver.quit();
		//takeTheScreenshot("screenshot");
	}	
		
	//@Test
//	public static void takeTheScreenshot(String filename) throws IOException {
//		//1. Take screenshot and store it as a file format
//		TakesScreenshot takeScreenshot = (TakesScreenshot)driver;
//		File file = takeScreenshot.getScreenshotAs(OutputType.FILE);
//		
//		//2. Now copy the screenshot to desired location using copyfile method:
//		FileUtils.copyFile(file, new File("/Users/DELL/Documents/workspace-sts-3.9.10.RELEASE/Wiki/src/main/java/ScreenShot_PracticePackage" +filename + "png" ));
//		//driver.quit();
		
	//	}
	


	
	
}
