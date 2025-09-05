package seleniumProjects;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ServiceNowTesting {

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit 

		Wait wait = new WebDriverWait(driver,Duration.ofSeconds(10)); //explicit wait declaration
		
		
		driver.manage().window().maximize();
		driver.get("https://etscorp.service-now.com/");
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("i0116")));//explicit wait on condition
		
		WebElement email_text = driver.findElement(By.id("i0116"));
		
		
		
		String email="ssaha003@ets.org";
		email_text.sendKeys(email);
		
		WebElement next_button = driver.findElement(By.id("idSIButton9"));
		next_button.click();
		
		
		

	}

}
