package Webelements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSizeOfAnElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		  Dimension sizeOfWebelement = driver.findElement(By.xpath("//button[@type='submit']")).getSize();
		 
		System.out.println(sizeOfWebelement);
		System.out.println(sizeOfWebelement.getHeight());
		System.out.println(sizeOfWebelement.getWidth());
		driver.quit();
		

	}

}
