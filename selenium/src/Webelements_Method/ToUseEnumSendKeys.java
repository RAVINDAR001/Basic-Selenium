package Webelements_Method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseEnumSendKeys {

	public static void main(String[] args) throws InterruptedException  {
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile",Keys.ENTER);
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
