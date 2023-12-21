package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Complete_Page extends TestBase
{

	// object Repository
	
	@FindBy(xpath="//span[text()='Checkout: Complete!']") private WebElement CompleteLable;
	@FindBy(xpath="//img[@class='pony_express']") private WebElement img;
	@FindBy(xpath="//h2[text()='Thank you for your order!']") private WebElement ThankYouText;
	@FindBy(xpath="//div[@class='complete-text']") private WebElement CompleteText;
	@FindBy(xpath="//button[@name='back-to-products']") private WebElement BackHomeBtn;
	
	//Constructor
	
	public Complete_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String verifyCompleteLable()
	{
		return CompleteLable.getText();
	}
	
	public Boolean verifyimg()
	{
		return img.isDisplayed();
	}
	
	public String verifyThankYouText()
	{
		return ThankYouText.getText();
	}
	
	public String verifyCompleteText()
	{
		return CompleteText.getText();
	}
	public String verifyBackHomeBtn()
	{
		 BackHomeBtn.click();
		 return driver.getCurrentUrl();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
