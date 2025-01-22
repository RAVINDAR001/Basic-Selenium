package DatadrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUsetestDataUsingExcelFile {

	public static void main(String[] args) throws Exception   {
		
		
		//step: create object of FIS
		FileInputStream fis=new FileInputStream("./DataTest/testdata.xlsx");
		//step:2 create object of respective filetype
		Workbook workbook= WorkbookFactory.create(fis);
		//call the methode
		String URL = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();
		String USERNAME = workbook.getSheet("Sheet1").getRow(1).getCell(0).toString();
		String PASSWORD = workbook.getSheet("Sheet1").getRow(2).getCell(0).toString();
		
		//automate the script
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);
		
		
		
		

	}

}
