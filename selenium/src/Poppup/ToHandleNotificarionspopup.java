package Poppup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToHandleNotificarionspopup {

	public static void main(String[] args) {
		
		
		
		
		ChromeOptions Setting =new ChromeOptions();
		Setting.addArguments("--disable-notifications");
	//	Setting.addArguments("--incognito");
		
		
		WebDriver driver =new ChromeDriver(Setting);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.yatra.com/");
		
		

	}

}
