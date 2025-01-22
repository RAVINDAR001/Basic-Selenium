package validation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToChekFacebooklogo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		boolean facebooklogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		if(facebooklogo== true) {
			System.out.println("facebook logo is displaying");
		}else{
			System.out.println("facebook logo is not displaying");
		}
		
		driver.quit();

	}

}
