package WikipediaSearch.Wiki;

//
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WikipediaTest1 {

	@Test(groups= {"Regression"})
	public void wikipedia() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement link;
		link = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		link.sendKeys("software");
		link.submit();
		
		
		//Write in search box by creating a search box object
		WebElement searchbox;
		//searchbox = driver.findElement(By.xpath("//input[@id='searchInput']"));
		//searchbox.sendKeys("software");
		//searchbox.submit();
		driver.quit();
	}

}
