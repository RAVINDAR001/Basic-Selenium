package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.instagram.com/accounts/login/?next=%2Faccounts%2Flo%2F&source=desktop_nav");
            WebElement get = driver.findElement(By.xpath("//input[@name='username']"));
           get.sendKeys("mitravindar14@gmail.com");
           String printtext = get.getAttribute("value");
           System.out.println(printtext);
           driver.quit();

	}

}
