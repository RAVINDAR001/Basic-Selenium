package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathByContains {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='log in']")).click();
		Thread.sleep(2000);
	 String	errormsg = driver.findElement(By.xpath("//span[contains(text(),'unsuccessful'")).getText();
		Thread.sleep(3000);
		System.out.println(errormsg);
	
		

	}

}
