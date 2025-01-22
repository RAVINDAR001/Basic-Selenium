package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pr4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("gfhhhgg");
		driver.findElement(By.id("pass")).sendKeys("shjhasjhsa");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();


	}

}
