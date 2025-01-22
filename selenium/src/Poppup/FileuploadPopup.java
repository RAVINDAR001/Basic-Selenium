package Poppup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileuploadPopup {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=CjwKCAjw7-SvBhB6EiwAwYdCASWfuw74SZWqrnWJ5vMcLnMM34kuQJgVd6d4EdbYSruTaZR0qW2IlRoCACsQAvD_BwE&gclsrc=aw.ds");

		
		//to use action class
		Actions action =new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\kumar\\Downloads\\Ravindar_cv0056.pdf");
		
	}

}
