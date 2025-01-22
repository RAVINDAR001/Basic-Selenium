package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForAutosuggetion {

	public static void main(String[] args) {
	
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://amazon.in");
    WebElement s1 = driver.findElement(By.id("twotabsearchtextbox"));
    s1.sendKeys("TCL TV");
    List<WebElement> s2 = driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div"));
    int count = s2.size();
    s2.get(count-1).click();
	}

}
