package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/myntra-fashion-store");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Men")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
