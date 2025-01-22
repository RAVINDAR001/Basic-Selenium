package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://woodenstreet.com");

		driver.findElement(By.id("loginclose1")).click();
		driver.findElement(By.linkText("Sofas")).click();
        driver.findElement(By.xpath("//img[@class='lazy loaded' and @alt='Berlin 3 Seater Sofa (Velvet, Indigo Blue)']")).click();
		//driver.findElement(By.name("Berlin 3 Seater Sofa (Velvet, Indigo Blue)")).click();
		driver.findElement(By.id("button-cart-buy-now")).click(); 
		driver.quit();

	}

}
