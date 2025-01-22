package Webelements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSubmitEleements {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("mitravindra14@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Villain@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(4000);
		driver.quit();
		

	}

}
