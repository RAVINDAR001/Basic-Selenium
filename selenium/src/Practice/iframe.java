package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {
	public static void main(String[] arg) {
		try {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
			driver.findElement(By.xpath("//iframe[@class=\"w-full h-96\"]"));
			WebElement textfeild = driver.findElement(By.xpath("//input[@type=\"text\"]"));
			textfeild.sendKeys("ravindar");
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("no such frame alert"+e.getMessage());
		}
		

		}
	
}
