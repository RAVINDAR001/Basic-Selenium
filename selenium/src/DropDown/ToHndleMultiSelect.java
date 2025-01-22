package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHndleMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
		
		
		
		WebElement multiselectbox = driver.findElement(By.id("cars"));
		
		
		//To handle
		
		
		Select multiselect =new Select(multiselectbox);
		System.out.println(multiselect.isMultiple());
		
		
		//call method
		multiselect.selectByIndex(0);
		multiselect.selectByValue("99");
		Thread.sleep(2000);
		
		// to deselect
		//multiselect.deselectByIndex(0);
		//multiselect.deselectByValue("99");
		multiselect.deselectAll();
		

	}

}
