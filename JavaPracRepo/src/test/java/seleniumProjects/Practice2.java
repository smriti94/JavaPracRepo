package seleniumProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		
		String title = driver.getTitle();
		System.out.println(title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		WebElement text = driver.findElement(By.xpath("//h5[text()='Elements']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();" , text);
		
		text.click();
		
		
		WebElement text_forms = driver.findElement(By.xpath("//h5[text()='Forms']"));
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();" , text_forms);
		
		text_forms.click();
		
//		WebElement third_text = driver.findElement(By.xpath("//h5[text() = 'Alerts, Frame & Windows']"));
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();" , third_text);
//		third_text.click();
//		
//		
//		WebElement fourth_text = driver.findElement(By.xpath("//h5[text()='Widgets']"));
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", fourth_text);
//		fourth_text.click();
//		
//		WebElement fifth_text = driver.findElement(By.xpath("//h5[text()='Interactions']"));
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();" , fifth_text);
//		fifth_text.click();
//		
//		WebElement sixth_text = driver.findElement(By.xpath("//h5[text()='Book Store Application']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();" , sixth_text);
//		sixth_text.click();
	}

}
