package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckOutPage1 extends TestBase
{
   // object Repository
	@FindBy(xpath="//span[@class='title']") private WebElement titleOfCheckOutPage;
	@FindBy(xpath="//input[@name='firstName']") private WebElement firstNameTextBox;
	@FindBy(xpath="//input[@name='lastName']") private WebElement lastNameTextBox;
	@FindBy(xpath="//input[@name='postalCode']") private WebElement ZipCodeTextBox;
	@FindBy(xpath="//input[@name='continue']") private WebElement continueBtn;
	
	//Constructor
	
	public CheckOutPage1()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyURLOfCheckOutPage()
	{
		return driver.getCurrentUrl();
	}
	
	public String verifyTitleOfApplicatio()
	{
		return titleOfCheckOutPage.getText();
	}
	
	public String InputInformation()
	{
		firstNameTextBox.sendKeys("karan");
		lastNameTextBox.sendKeys("wankhade");
		ZipCodeTextBox.sendKeys("431001");
	    continueBtn.click();  
	    return driver.getCurrentUrl();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
