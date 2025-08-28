package seleniumProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo
{

	WebDriver driver =null;
	
	@BeforeMethod
	void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	void test() throws InterruptedException
	{
		
		driver.navigate().to("https://www.google.com");
		Thread.sleep(5000);
	}
	
	@AfterMethod
	void closeBrowser()
	{
		driver.quit();
	}
}
