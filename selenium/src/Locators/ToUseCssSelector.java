package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCssSelector {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/fiction");
		Thread.sleep(2000);
		driver.findElement(By.id("small-searchterms")).sendKeys("sofa");
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		Thread.sleep(5000);
	//	driver.quit();

	}

}
