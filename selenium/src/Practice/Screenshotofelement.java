package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotofelement {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		Thread.sleep(2000);
		File screens = driver.findElement(By.xpath("//img[@alt='Meesho Logo' and @loading='lazy']")).getScreenshotAs(OutputType.FILE);
File scr=new File("./errorShot/meesho.png");
FileHandler.copy(screens, scr);
driver.quit();
	}

}
