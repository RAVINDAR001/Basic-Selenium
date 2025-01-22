package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLaunchHarleyDavidson {
	
	
	
	@Test(groups="smoke")
	public void TolaunchHarleyDavidson() {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.harley-davidson.com/in/en/index.html");
		Reporter.log("harley got launched", true);
		driver.quit();
	}

}
