package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleSingleSelectClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		//to locate dropdown
		WebElement daydrop = driver.findElement(By.id("day"));
		WebElement monthdrop = driver.findElement(By.id("month"));
		WebElement yeardrop = driver.findElement(By.id("year"));
		
		//to handle dropdown
		Select daySelect=new Select(daydrop);
		Select monthSelect=new Select(monthdrop);
		Select yearseSelect=new Select(yeardrop);
		
		//call method
		daySelect.selectByIndex(10);
		monthSelect.selectByValue("4");
		yearseSelect.selectByVisibleText("1995");
		  
		
		//to chek wether it is single select or not
		System.out.println(daySelect.isMultiple());
		
		//to fetch all  the months
		List<WebElement> allmonths = monthSelect.getOptions();
		
	
		for(WebElement month:allmonths) {
			System.out.println(month.getText());
			monthSelect.selectByValue(month.getText());
			Thread.sleep(2000);
			
			
		}
		
	}

}
