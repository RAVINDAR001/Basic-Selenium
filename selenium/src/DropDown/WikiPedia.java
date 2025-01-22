package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WikiPedia {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.wikipedia.org/");
		WebElement dropd = driver.findElement(By.id("searchLanguage"));
		Select drpodown=new Select(dropd);
		drpodown.selectByVisibleText("Polski");
		
		

	}

}
