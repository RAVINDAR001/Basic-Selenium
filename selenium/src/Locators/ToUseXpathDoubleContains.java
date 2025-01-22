package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathDoubleContains {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/login");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@type='submit' and @value='search']")).click();
		 Thread.sleep(4000);
		 //driver.quit();
		 

	}

}
