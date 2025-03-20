package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		List<WebElement> suggestionBox = driver
				.findElements(By.xpath("(//ul[@class=\"react-autosuggest__suggestions-list\"])[2]"));
		for (WebElement sugestion : suggestionBox) {
			System.out.println(sugestion.getText());

		}
	}

}
