package Assingnment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/fiction");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("FirstName")).sendKeys("Ravindar");
		Thread.sleep(2000);
		
		driver.findElement(By.id("LastName")).sendKeys("kumar");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Email")).sendKeys("mitravindar14@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Password")).sendKeys("Villain@123");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Villain@123");
		Thread.sleep(2000);
		
		driver.findElement(By.name("register-button")).click();
		
		
		
		driver.quit();
		
		
		
		

	}

}
