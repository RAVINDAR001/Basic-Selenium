package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();//upcasting
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in/home");
		Thread.sleep(4000);

		TakesScreenshot ts = (TakesScreenshot) driver;//typecasting(because there is no connectin btw webdriver to screenshot

		File temp = ts.getScreenshotAs(OutputType.FILE);
		File src = new File("./errorShot/hotstar1.jpeg");

		FileHandler.copy(temp, src);

	}

}
