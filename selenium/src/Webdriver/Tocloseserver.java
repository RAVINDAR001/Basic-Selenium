package Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tocloseserver {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://online.kfc.co.in/");
	    Thread.sleep(2000);
	    //driver.close();//for close the parent window only.it will close only window not server
		driver.quit();

	}

}
