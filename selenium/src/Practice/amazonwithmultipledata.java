package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class amazonwithmultipledata {
@DataProvider(name="data1")
public Object[][] testdata(){
	Object[][] data =new Object[5][1];
	data[0][0]="shoes";
	data[1][0]="tshirt";
	data[2][0]="laptop";
	data[3][0]="maouse";
	data[4][0]="laptop";
	
	return data;
	
}
     @Test(dataProvider = "data1")
     public void testcase(String data) {
    	 WebDriver driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.get("https://www.amazon.in/");
    	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
    	search.sendKeys(data +Keys.ENTER);
    	 
    	 
     }
    	 
     }

