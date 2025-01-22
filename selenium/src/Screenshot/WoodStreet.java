package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WoodStreet {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(
				"https://www.woodenstreet.com/?gad_source=1&gclid=CjwKCAjw26KxBhBDEiwAu6KXt094rBKBXjvAQi5kJtf9FKs1-4QbdluXl-8DL2LQVYMSS9LZ9ixNaBoChBUQAvD_BwE");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorShot/error3.jpeg");
		FileHandler.copy(temp, dest);
		driver.quit();
	}

}
