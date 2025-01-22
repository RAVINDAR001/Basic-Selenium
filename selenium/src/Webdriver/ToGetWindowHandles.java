package Webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetWindowHandles {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//Dimension d=new Dimension(1000,1200);
		//driver.manage().window().setSize(d);
		driver.quit();

	}

}
