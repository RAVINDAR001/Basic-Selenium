package Screenshot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrenshotPractice {

	public static void main(String[] args) {
		
		
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://jobs.smartrecruiters.com/oneclick-ui/company/PublicisGroupe/publication/fc5bc149-2475-4cc7-8612-506cbcac4e9c?dcr_ci=PublicisGroupe");
     TakesScreenshot ts =(TakesScreenshot)driver;
     File temp = ts.getScreenshotAs(OutputType.FILE);
     

	}

}
