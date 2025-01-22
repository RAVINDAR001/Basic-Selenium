package Webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreNavigateMethod {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.facebook.com/");
         // driver.navigate().to(new URL("https://www.facebook.com/"));
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		Navigation nav =driver.navigate();
		nav.back();
		Thread.sleep(3000);
		nav.forward();
		Thread.sleep(3000);
		nav.refresh();
		
		
		driver.quit();
	}

}
