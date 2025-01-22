package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		boolean facebooklogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		
		System.out.println(facebooklogo);
		driver.quit();
		
	}

}
