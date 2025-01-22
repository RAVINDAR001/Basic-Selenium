package Webelements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetAtributes {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://actitime.com/");
		Thread.sleep(2000);
		WebElement tryfreeButton = driver.findElement(By.linkText("Try Free"));
		WebElement tryfreButton;
		System.out.println(tryfreeButton.getAttribute("href")); 
		Thread.sleep(2000);
		driver.quit();

	}

}
