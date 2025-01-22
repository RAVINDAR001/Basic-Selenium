package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Gmail {

	public static void main(String[] args) {
		
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&emr=1&ltmpl=default&ltmplcache=2&osid=1&passive=true&rm=false&scc=1&service=mail&ss=1&ifkv=Ab5oB3owwCyLcyG7YgCW79BRvZtlcftEUAWCeHp7ahmMkCtPyKf2xOqHwr3RKA3HftKfNGW95Uui&ddm=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
driver.findElement(By.id("identifierId")).sendKeys("mitravindar14@gmail.com");
	}

}
