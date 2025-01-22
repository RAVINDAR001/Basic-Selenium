package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchRoyalWn {
	
	@Test(groups="smoke")
	public void TolaunchhroyalEn() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://royalenfieldindia.com/motorcycle.php");
		Reporter.log("Royal got launched", true);
		driver.quit();
	}

}
