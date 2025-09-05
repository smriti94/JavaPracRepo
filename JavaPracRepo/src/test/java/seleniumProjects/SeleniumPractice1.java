package seleniumProjects;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); // browser OPen
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		driver.manage().window().maximize(); // Maximize browser 
		driver.get("https://demoqa.com/"); // open site
		
		String title = driver.getTitle(); // GEt the page title
		System.out.println(title); //  print the title
		
		String currentUrl = driver.getCurrentUrl(); // Get the current URL
		System.out.println(currentUrl); // Print the current URL
		
		WebElement element_text = driver.findElement(By.xpath("//h5 [text()='Elements']")); // xpath Formula : //tagname[@atributename= 'atribute Value']
		
		JavascriptExecutor js = (JavascriptExecutor) driver; // Initializing JavascriptExecutor
		js.executeScript("arguments[0].scrollIntoView();", element_text); // Srolling to a perticular  webelement 
		
		//element_text.click(); // normal click
		
		js.executeScript("arguments[0].click();", element_text); // click through javascript
		
		
		WebElement textBox_text = driver.findElement(By.xpath("//span [text() ='Text Box']"));
		
		textBox_text.click();
		
		WebElement fullName_inputbox = driver.findElement(By.id("userName"));
		String fullname = "Smriti Saha Sen";
		fullName_inputbox.sendKeys(fullname);
		
		js.executeScript("arguments[0].click();", fullName_inputbox);
		
		WebElement email_inputbox = driver.findElement(By.id("userEmail")); 
		String emaild = "smritisaha123@gmail.com";
		email_inputbox.sendKeys(emaild);
		
		WebElement currentAddress_inputbox = driver.findElement(By.id("currentAddress"));
		String address = "25/1 , Ultadanga Main Road.Kolkata-700067";
		currentAddress_inputbox.sendKeys(address);
		
		
		
		WebElement permanentaddress_inputbox = driver.findElement(By.id("permanentAddress"));
		String permanentaddress = "Ultadanga Kolkata";
		js.executeScript("arguments[0].click();", permanentaddress_inputbox);
		permanentaddress_inputbox.sendKeys(permanentaddress);
		
		WebElement submitbutton = driver.findElement(By.id("submit"));
		js.executeScript("arguments[0].click();", submitbutton);
		submitbutton.click();
		
		WebElement name_output = driver.findElement(By.id("name"));
		String getName = name_output.getText();
		if(getName.contains(fullname))
			System.out.println("Name is correctly registered");
		else
			System.out.println("Name is not correctly registered");
		
		WebElement email_output = driver.findElement(By.id("email"));
		String getEmail = email_output.getText();
		if(getEmail.contains(emaild))
			System.out.println("email is correctly registered");
		else
			System.out.println("email is not correctly registered");
		
		
		
	}

}
