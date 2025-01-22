package Assingnment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tasl9 {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		String errormsg = driver.findElement(By.xpath("//span[contains(text(),'First ')]")).getText();
		Thread.sleep(2000);
		String errormsg1 = driver.findElement(By.xpath("//span[contains(text(),'Last ')]")).getText();
		Thread.sleep(2000);
		String errormsg2 = driver.findElement(By.xpath("//span[contains(text(),'Email')]")).getText();
		Thread.sleep(2000);
		String errormsg3 = driver.findElement(By.xpath("//span[contains(text(),'Password ')]")).getText();
	    
		System.out.println(errormsg);
		System.out.println(errormsg1);
		System.out.println(errormsg2);
		System.out.println(errormsg3);
		System.out.println(errormsg3);
		Thread.sleep(2000);
		driver.quit();
		
	}
}