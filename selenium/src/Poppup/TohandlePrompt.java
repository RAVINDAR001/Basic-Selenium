package Poppup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TohandlePrompt {

	public static void main(String[] args) {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		
		//to handle
		 Alert promptpopup = driver.switchTo().alert();
		 promptpopup.sendKeys("Villain");
	 promptpopup.accept();
	//	promptpopup.dismiss();
		//driver.quit();

	}

}
