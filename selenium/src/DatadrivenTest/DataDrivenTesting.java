package DatadrivenTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTesting {

	public static void main(String[] args) throws IOException {

		// step1: Create an object of FileInputStream / FileReade
		FileInputStream fis = new FileInputStream("./DataTest/DataTest.properties");
		// step 2: Create File type Object
		Properties prop = new Properties();
		// step3:Call read method
		prop.load(fis);
		
		String Url = prop.getProperty("URL");
		String Username = prop.getProperty("Username");
		String Password = prop.getProperty("Password");
		
		
		// to launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(Url);
		
		// to pass the value
		driver.findElement(By.id("email")).sendKeys(Username);
		driver.findElement(By.id("pass")).sendKeys(Password);

		driver.quit();

	}

}
