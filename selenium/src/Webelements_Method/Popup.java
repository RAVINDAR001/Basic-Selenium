package Webelements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://woodenstreet.com/");
		for( ; ; ) {
			try {
				driver.findElement(By.id("loginclosed1")).click();
				break;
			}
			catch(Exception e) {
				Thread.sleep(2000);
				
				
			}
			
		}
		WebElement elements = driver.findElement(By.xpath("//ul[@class='container flex']/li"));
		for(WebElement ele:elements) {
		
			
			System.out.println(ele.getText());
		}
		

	}

}
