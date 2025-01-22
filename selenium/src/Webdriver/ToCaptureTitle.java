package Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTitle {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");//to launch browser
		Thread.sleep(2000);
		String titleOfWebpage = driver.getTitle();//capture title
		System.out.println(titleOfWebpage);
	}
}
