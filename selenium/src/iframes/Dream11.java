package iframes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dream11.com/");
		//To switch using index
		
		
		
	//	driver.switchTo().frame(0);
		//driver.findElement(By.id("regEmail")).sendKeys("7781977779");
		
		//to switch by using string id or name
		//driver.switchTo().frame("send-sms-iframe");
		
		//to switch using webelement
		
	  WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
	  driver.switchTo().frame(iframe);
	  driver.findElement(By.id("regEmail")).sendKeys("7781977779");
	  
	  //Swith back
	  //driver.switchTo().parentFrame();
	  
	  
	  driver.switchTo().defaultContent();
	  driver.findElement(By.linkText("About Us")).click();
	  
	  
	  
}
	

}
