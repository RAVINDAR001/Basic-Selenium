package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_01 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		
		
		WebElement ref1 = driver.findElement(By.xpath("//iframe[@class=\"w-full h-96\"]"));
		driver.switchTo().frame(ref1);
		WebElement ref = driver.findElement(By.id("username"));
		ref.sendKeys("ygyguyg");
		
		driver.switchTo().defaultContent();
		
		
		
	

}}
