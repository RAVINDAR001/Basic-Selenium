package Locators;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("mitravindar14@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Villain@123");

		Thread.sleep(3000);
		driver.quit();

	}

}
