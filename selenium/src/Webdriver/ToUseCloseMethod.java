package Webdriver;

import java.awt.Dimension;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseCloseMethod {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	//driver.get("https://online.kfc.co.in/");
    Thread.sleep(2000);
    driver.navigate().to("https://www.facebook.com/");//
    driver.manage().window().setSize(new Dimension(500,600));
    //driver.close();//for close the parent window only.it will close only parent window not server
	driver.quit();//for close the parent and child window and it also close the server
	}

}
