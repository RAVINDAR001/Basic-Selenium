package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Action {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
		
	    WebElement ref = driver.findElement(By.xpath("//input[@name=\"handleInput\"]"));
		
		
		Actions act=new Actions(driver);
		act.sendKeys(ref, "a").perform();
		
	}

}
