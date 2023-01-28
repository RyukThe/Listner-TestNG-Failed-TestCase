package swaglab_DDF_02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	
	
	//used to fetch data from excel sheet 
	//need two inputs: 1. rowIndex, 2. cellIndex
	//@Author: Saurav
	public static String getData(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("F:\\Excel\\Book1.xlsx");
		String Result = WorkbookFactory.create(file).getSheet("Sheet5").getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return Result;
	}
	
	
	//used take screenshot of WebPage
	//need Two inputs: 1. WebDrivername, TCID
	//@Author: Saurav
	public static void captureScreenShot(WebDriver driver,int TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dec=new File("D:\\eclipse\\Listner_TestNG_FailedTestCase\\FailedTestCaseSS\\TCID"+ TCID +".png");
		FileHandler.copy(src, dec);
	}
	
	
	//used to fetch data from property file
	//need one input : String Key
	//@Author name:Saurav
	public static String getDataFromProFile(String key) throws IOException
	{
		FileInputStream m= new FileInputStream("D:\\eclipse\\Listner_TestNG_FailedTestCase\\SwagLab1.properties");
		Properties k= new Properties();
		k.load(m);
		
		String value = k.getProperty(key);
		
		return value;
	}

}