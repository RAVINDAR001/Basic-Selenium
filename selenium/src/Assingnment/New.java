package Assingnment;

import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		

	}

}
