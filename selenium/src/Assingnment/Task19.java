package Assingnment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task19 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("ram siya ram");
		Thread.sleep(2000);
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("title-wrapper")).click();
		for(;;) {
			try {
				driver.findElement(By.xpath("//span[@class='ytp-ad-skip-button-icon-modern']")).click();
				break;
			}
			catch(Exception e) {
				Thread.sleep(2000);
				
				
			}
			
		}
		driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button' and @aria-label='Full screen keyboard shortcut f']")).click();
		

		
		

	}

}
