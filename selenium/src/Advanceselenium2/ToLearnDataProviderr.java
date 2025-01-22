package Advanceselenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToLearnDataProviderr {
	
	
	@DataProvider(name="cred")
	public String[][] tosendData(){
		String sarr[][]{
				
		{"mitravindar14@gmail.com","Villain@123"},
		{"khushi@gmail.com","khushi@123"},
		{"villain@gmail.com","villain@123"}
		};
	
	return sarr;

}
@Test(dataProvider="cred")
public void login(String username,String password) {
	WebDriver driver=new chromedriver();
	driver.get("https//www.facebook.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)));
	driver.findelement(By.id("email")).sendkeys(username);
	driver.findelement(By.id("password")).sendkeys(password);
	
	
}
}
