package seleniumProjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ServiceNowPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
				
		driver.manage().window().maximize();
		
		
		driver.get("https://etscorp.service-now.com/");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i01161")));
		
		WebElement email_text = driver.findElement(By.id("i0116"));
		String email= "ssaha003@ets.org";
		
		email_text.sendKeys(email);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idSIButton9")));
		WebElement next_Button = driver.findElement(By.id("idSIButton9"));
		next_Button.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("i0118")));
		WebElement password_text = driver.findElement(By.id("i0118"));
		String password = "Kolkata9433791@r";
		password_text.sendKeys(password);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idSIButton9")));
		
		WebElement signin_button = driver.findElement(By.id("idSIButton9"));
		signin_button.click();

	}

}
