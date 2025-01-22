package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice3 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.zomato.com/bangalore");
		   File temp = driver.findElement(By.xpath("\"//img[@src='https://b.zmtcdn.com/web_assets/b40b97e677bc7b2ca77c58c61db266fe1603954218.png' and @class='sc-yvzia9-6 hxTfPc']\"))")).getScreenshotAs(OutputType.FILE);		
		   File src = new File("./errorShots/zomato.png");
	FileHandler.copy(temp, src);

	}

}
