package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		
		WebElement text = driver.findElement(By.xpath("//h5[text()='Elements']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();" , text);
		text.click();
		
		WebElement textbox = driver.findElement(By.xpath("//span[text()='Text Box']"));
		textbox.click();
		
		WebElement name_input = driver.findElement(By.id("userName"));
		String name ="Smriti Saha";
		name_input.sendKeys(name);
		
		WebElement email_input = driver.findElement(By.id("userEmail"));
		String email ="smriti123@gmail.com";
		email_input.sendKeys(email);
		
		WebElement C_address = driver.findElement(By.id("currentAddress"));
		String address = "Ultadanga";
		C_address.sendKeys(address);
		
		WebElement P_address = driver.findElement(By.id("permanentAddress"));
		String paddress = "Ultadanga";
		P_address.sendKeys(paddress);
		
		WebElement submit_button = driver.findElement(By.id("submit"));
		submit_button.click();
		
		

		
		

	}

}
