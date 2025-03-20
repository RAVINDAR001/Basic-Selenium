package DropDown;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HdfcLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.hdfcbank.com/");
		WebElement login = driver.findElement(By.xpath("(//button[text()='Login'])[1]"));

		Actions act = new Actions(driver);
		act.moveToElement(login).click(driver.findElement(By.xpath("(//div[@class='login_link'])[1]"))).perform();
		Set<String> neww = driver.getWindowHandles();
		Iterator<String> i = neww.iterator();
		String parent = i.next();
		String child = i.next();
		driver.switchTo().window(child);
		WebElement frame = driver.findElement(By.xpath("//frame[@name=\"login_page\"]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@name=\"fldLoginUserId\"]")).sendKeys("12345678");
	}

}
