package Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TCaptureUrl {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String urlOfWebpage = driver.getCurrentUrl();
		System.out.println(urlOfWebpage);

	}

}
 
