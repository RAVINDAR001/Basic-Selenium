package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssesmentForJob {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://fitpeo.com/home");
		driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();
		Thread.sleep(3000);
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,400)");
		
		
		WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
		Thread.sleep(3000);
        WebElement sliderHandle = driver.findElement(By.cssSelector(".slider-handle")); 
        Actions action=new Actions(driver);
        action.clickAndHold(sliderHandle).moveByOffset(100, 0).release().perform(); 
        WebElement sliderTextField = driver.findElement(By.id("slider-text-field")); 
        sliderTextField.clear();
        sliderTextField.sendKeys("820");


		
		
		
		
		//driver.quit();
		
	
	}

		}
