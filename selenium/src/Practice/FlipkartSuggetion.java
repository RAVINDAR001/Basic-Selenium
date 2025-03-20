package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSuggetion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com");
		WebElement SearchBox=driver.findElement(By.name("q"));
		SearchBox.sendKeys("mobile");
		Thread.sleep(2000);
		List<WebElement> List = driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc\"]"));
		int Suggetion = List.size();
		System.out.println(Suggetion);
		List.get(4).click();
		
		

	}

}
