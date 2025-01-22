package Poppup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenDivisionPopup {

	public static void main(String[] args) {
		 	WebDriver driver=new ChromeDriver();
		 	driver.manage().window().maximize();
		 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		 	driver.get("https://www.agoda.com/");
		 	driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
			driver.findElement(By.xpath("check-in-box")).click();
			for(;;) {
			
			try {
				driver.findElement(By.xpath("//div[text()='December 2024']/..//span[text()='13']")).click();
				break;
			}catch (Exception e) {
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
			}
			}
	}

}
