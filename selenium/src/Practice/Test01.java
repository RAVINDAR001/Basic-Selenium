package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("abishek1808@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Test@123");

		//river.findElement(By.xpath("(//img[@class=\"card-img-top\"])[1]")).click();

		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		Thread.sleep(2000);
		WebElement addcart = driver.findElement(By.xpath(" (//button[contains(text(),'Add To Cart')])[1]"));
		addcart.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Cart ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class=\"input txt text-validated\"])[2]")).sendKeys("ind");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"ta-item list-group-item ng-star-inserted\"]/..//span[contains(text(), 'India')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Place Order ')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath(" //button[contains(text(),'Sign Out ')]")).click();
	    driver.quit();
	
	
	}}

