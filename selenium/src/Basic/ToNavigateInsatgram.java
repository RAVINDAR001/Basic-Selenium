package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateInsatgram {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/?hl=en");
		driver.findElement(By.name("username")).sendKeys("mitravindar14@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Villain@123");
		

	}

}
