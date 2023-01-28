package swaglab_DDF_07;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v104.page.Page;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCheckOutPage 
{
	@FindBy(xpath="//span[@class='title']") private WebElement title;
	@FindBy(xpath="//input[@name='continue']") private WebElement Continue;
	@FindBy(xpath= "//h3[@data-test='error']") private WebElement sumbitbtn;
	@FindBy(xpath = "//input[@placeholder='First Name']") private WebElement FirstN;
	
	@FindBy(xpath="//input[@placeholder='Last Name']") private WebElement lastn;
	@FindBy(xpath="//input[@placeholder='Zip/Postal Code']") private WebElement post;
	
	
	public SwagLabCheckOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String VerifySwagLabCheKOutPageTitle()
	{
		String act = title.getText();
		return act;
	}
	
	public void clickSwagLabChekOutContinueButn()
	{
		Continue.click();
	}
	
	public String verifySwagLabCheKOutErrorOnSumbitButn()
	{
		String act = sumbitbtn.getText();
		return act;
		
	}
	
	
	

}