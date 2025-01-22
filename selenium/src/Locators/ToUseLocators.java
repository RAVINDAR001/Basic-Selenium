package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUseLocators {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("villain");
		Actions action=new Actions(driver);
		action.sendKeys("villain",Keys.CONTROL+"a");
		action.sendKeys(Keys.CONTROL+"c");
		
		driver.findElement(By.name("password")).sendKeys("12345");
		action.sendKeys(Keys.CONTROL+"v");
		
		
			
				
	
		
	
		driver.quit();
		
		

	}

}
