package DemoQspider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.id("name")).sendKeys("RAVINDAR KUMAR");
		driver.findElement(By.id("email")).sendKeys("mitravindar14@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Villain@123");
		driver.findElement(By.xpath("//button[text()='Register']")).click();

	}

}
