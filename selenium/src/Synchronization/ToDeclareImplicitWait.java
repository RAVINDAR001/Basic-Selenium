package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDeclareImplicitWait {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//To declare implicitly
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com");
		driver.findElement(By.name("username")).sendKeys("mitravindar14@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Villain@123");
		driver.quit();

	}

}
