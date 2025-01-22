package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAllLink {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.co.in/");
	try {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total link found"+links.size());
		int ln = links.size();
	for(int i=1;i<=ln;i++) {
	WebElement alllink = links.get(i);
	String googlelink = alllink.getText();
	System.out.println(googlelink);
	}
	}
		
	catch (Exception e) {
		
	}

	
	
	
	
	

}