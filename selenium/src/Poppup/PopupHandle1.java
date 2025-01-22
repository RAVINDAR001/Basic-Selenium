package Poppup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandle1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();//upcasting
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//synchronization methode
		driver.get("https://www.woodenstreet.com/");
		//driver.findElement(By.id("loginclose1")).click();
		//driver.quit();
		for( ; ;) {
			try {
				driver.findElement(By.id("loginclose1")).click();
				break;
			}
			catch (Exception e) {
				Thread.sleep(2000);
			}
		}
		

	}

}
