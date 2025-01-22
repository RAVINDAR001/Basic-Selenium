package Webelements_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureCssProperty {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://actitime.com/");
		Thread.sleep(2000);
		WebElement TryfreeButton = driver.findElement(By.linkText("Try Free"));
		Thread.sleep(2000);
		System.out.println(TryfreeButton.getCssValue("font-family"));
		System.out.println(TryfreeButton.getCssValue("border-radius"));
		System.out.println(TryfreeButton.getCssValue("font-size"));
		System.out.println(TryfreeButton.getCssValue("background-color"));
		Thread.sleep(4000);
		driver.quit();

	}

}
