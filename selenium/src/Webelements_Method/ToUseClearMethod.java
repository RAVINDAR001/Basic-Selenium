package Webelements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClearMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.vtiger.com/vtigercrm");
		Thread.sleep(2000);
		WebElement usertextfeild = driver.findElement(By.id("username"));
		Thread.sleep(2000);
		
		usertextfeild.clear();
		usertextfeild.sendKeys("Animal");
		Thread.sleep(2000);
		
		
		
		usertextfeild=driver.findElement(By.id("password"));
		usertextfeild.clear();
		Thread.sleep(2000);
		
		usertextfeild.sendKeys("Villain@123");
		Thread.sleep(5000);
		
		driver.quit();
		
		

	}

}
