package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Dhkkhkh {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com");
		//String logo = driver.getTitle();
		//WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
//System.out.println(logo);
		TakesScreenshot ts=(TakesScreenshot)driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File ds=new File("./errorShot/imageamazon.png");
	FileHandler.copy(temp, ds);

}}
