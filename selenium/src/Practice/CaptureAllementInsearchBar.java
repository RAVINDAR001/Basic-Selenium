package Practice;

   import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

        public class CaptureAllementInsearchBar {

	    public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("SHOE");
		Thread.sleep(2000);
		List<WebElement> suggesion = driver.findElements(By.xpath("//div[@class='search-results']/div[1]/div"));
		
        Thread.sleep(2000);
        for(WebElement element:suggesion) {
        System.out.println(element.getText());
	}
        Thread.sleep(2000);
       driver.quit();
}
	
}
