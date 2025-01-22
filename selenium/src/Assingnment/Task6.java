package Assingnment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial");
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Villain");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("c");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("mitravindar14@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Company")).sendKeys("byjus");
		driver.quit();
		

	}

}
