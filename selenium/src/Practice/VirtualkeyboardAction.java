package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VirtualkeyboardAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0");
		WebElement click = driver.findElement(By.xpath("//div[@class=\"bg-blue-500 hover:bg-blue-700 text-white font-medium py-0.5 px-1 text-2xl rounded focus:outline-none focus:shadow-outline\"]"));
		click.click();
		
		

	}

}
