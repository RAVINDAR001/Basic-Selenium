package Assingnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Task10 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
	    	driver.manage().window().maximize();
		
		    driver.get("https://demowebshop.tricentis.com");
		Thread.sleep(2000);
		
		   driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		
		
		    driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		
		
		WebElement errormsg = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        System.out.println(errormsg.getCssValue("color"));

		Thread.sleep(4000);
		driver.quit();
		
		
		

	}

}
