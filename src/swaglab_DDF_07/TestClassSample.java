package swaglab_DDF_07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClassSample 
{
	@Test
	
	public void m1() throws InterruptedException
	{
		WebDriver m = new ChromeDriver();
		Thread.sleep(2000);
		m.close();
	}

}
