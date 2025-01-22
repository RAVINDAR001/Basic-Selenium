package advancesellenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import graphql.schema.diff.reporting.CapturingReporter;

public class ToLearnTestNG {

	@Test(priority = 2,invocationCount = 3,threadPoolSize = 2,enabled = true)
	public void criccbuzz() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("cricbuzz got executed", true);
		driver.quit();

	}

	@Test(priority = 1,invocationCount = 5,threadPoolSize = 3,enabled = true)
	public void baskinrobbin() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("baskinrobbin got executed", true);
		driver.quit();
	}

	@Test(priority = 0,invocationCount = 4,threadPoolSize = 2,enabled = false)
	public void amazon() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Reporter.log("amazon got executed", true);
		driver.quit();
	}

}
