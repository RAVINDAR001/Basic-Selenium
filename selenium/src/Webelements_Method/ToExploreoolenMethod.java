package Webelements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreoolenMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("Before entering data");
		System.out.println(loginbutton.isDisplayed());//true
		System.out.println(loginbutton.isEnabled());//false
		System.out.println("**************************");
		System.err.println("after entering data");
		driver.findElement(By.name("username")).sendKeys("mitaravindra14@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Villain@123");
		System.out.println(loginbutton.isDisplayed());//true
		System.out.println(loginbutton.isEnabled());//true
		driver.quit();
		


	}

}
