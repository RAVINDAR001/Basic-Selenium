package Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSessionId {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		
		    driver.get("https://www.facebook.com/");
		    Thread.sleep(2000);
		
		
		String sessionId=driver.getWindowHandle();//only parent session Id
		System.out.println(sessionId);
		
	driver.quit();

	}

}
