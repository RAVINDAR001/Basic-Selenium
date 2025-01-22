package Poppup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseFindElements {

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
		List<WebElement> navele = driver.findElements(By.xpath("//ul[@ class='container flex']/li"));
		for(WebElement ele:navele) {
			System.out.println(ele.getText());
		}
		driver.quit();

	}

}
