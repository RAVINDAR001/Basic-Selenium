package Assingnment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Computers")).click();
		Thread.sleep(5000);
		driver.quit();
		

	

	}

}
