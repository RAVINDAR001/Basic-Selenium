package Webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.matcher.ElementMatcher.Junction.Disjunction;

public class ToExploreManageMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.skillrary.com/");
       //driver.manage().window().maximize();//maximize
       Thread.sleep(3000);
       //driver.manage().window().minimize();//minimize
       //driver.manage().window().fullscreen();//fullscreen
      //  Dimension SizeOfWindow = driver.manage().window().getSize();//to get size
      //  System.out.println(SizeOfWindow);
      // driver.manage().window().setSize(new Dimension(500,500));//to set size
       //or
       //Dimension d= new Dimension(500,700);
       //driver.manage().window().setSize(d);
       
    //  Point pos = driver.manage().window().getPosition();//to get position
     //  System.out.println(pos);
      driver.manage().window().setPosition(new Point(70,80));
      
      
      
      driver.quit();

       
	}

}
