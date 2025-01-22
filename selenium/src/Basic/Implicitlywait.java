package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicitlywait {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		driver.get("https://www.shoppersstack.com/products_page/7");
		driver.findElement(By.id("Check Delivery")).sendKeys("560011");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		
	  driver.findElement(By.id("Check")).click();
		driver.quit();

	}

}
