package Poppup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfermations {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1200));
		
		
		 driver.get("https://licindia.in/");
		 driver.findElement(By.xpath("//button[text()='Close']")).click();
		 driver.findElement(By.partialLinkText("Login")).click();
		 
		 
		 
		 //to handle
		 
		 Alert confermationalert = driver.switchTo().alert();
		 System.out.println(confermationalert.getText());
		 confermationalert.accept();//ok button
		// confermationalert.dismiss();//cancel button
		
		

	}

}
