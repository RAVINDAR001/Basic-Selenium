package Poppup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePopup {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		
		//To swich to frame
		 driver.switchTo().frame("login_page");
		 driver.findElement(By.linkText("CONTINUE")).click();
		 
		 //TO HANDLE
		 
		 Alert alertpopup = driver.switchTo().alert();
		System.out.println(alertpopup.getText());
		//alertpopup.accept();
		alertpopup.dismiss();

	}

}
