package Assingnment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ScreenshotAmazonChild {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone15 pro max");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		driver.findElement(By.partialLinkText("iPhone 15 Pro (1 TB) - Blue Titanium")).click();
		//driver.switchTo().parentFrame();
	//	TakesScreenshot ts =(TakesScreenshot)driver;
		//File temp = ts.getScreenshotAs(OutputType.FILE);
		//File src=new File("./errorShot/amazonchild.png");
		//FileHandler.copy(temp, src);
		
		

	}

}
