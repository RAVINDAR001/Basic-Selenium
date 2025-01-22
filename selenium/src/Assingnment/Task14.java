package Assingnment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task14 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Books")).click();
	 WebElement drop = driver.findElement(By.id("products-orderby"));
	 
	 Select price=new Select(drop);
	 price.selectByValue("https://demowebshop.tricentis.com/books?orderby=10");
	 
	


	}

}
