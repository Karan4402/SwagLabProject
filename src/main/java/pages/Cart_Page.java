package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Cart_Page extends TestBase 
{
	
	
	// Object Repository
	@FindBy(xpath="//span[text()='Your Cart']") private WebElement yourCartText;
    @FindBy(xpath="//div[text()='Swag Labs']") private WebElement SwagLabsText;
    @FindBy(xpath="//div[text()='QTY']") private WebElement QTYText;
    @FindBy(xpath="//div[text()='Description']") private WebElement DescriptionText;
    @FindBy(xpath="//span[@class='shopping_cart_badge']") private WebElement CartBtn;
    @FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement menuBtn;
    @FindBy(xpath="//button[@id='continue-shopping']") private WebElement ContinueShoppingBtn; 
    @FindBy(xpath="//button[@id='checkout']") private WebElement CheckoutBtn;
    
    @FindBy(xpath="//a[@id='inventory_sidebar_link']") private WebElement AllItems;
    
    //Constructor
     public Cart_Page()
     {
    	 PageFactory.initElements(driver, this);
     }
     
     public String verifyURLOFApplication()
     {
     	return driver.getCurrentUrl();
     }
     
     public String verifyyourCartText()
     {
    	 return yourCartText.getText();
     }
     
     public String verifySwagLabsText()
     {
    	 return SwagLabsText.getText();
     }
     
     public String verifyQTYText()
     {
    	 return QTYText.getText();
     }
     
     public String verifyDescriptionText() 
     {
    	 return DescriptionText.getText();
     }
     
     public String verifyCartBtn()
     {
    	 CartBtn.click();
    	 return driver.getCurrentUrl();
     }
     
     public void verifymenuBtn()
     {
    	 menuBtn.click();
     }
     public String verifyContinueShoppingBtn()
     {
    	 ContinueShoppingBtn.click();
    	 return driver.getCurrentUrl();
     }
     
     public String verifyCheckoutBtn()
     {
    	 CheckoutBtn.click();
    	 return driver.getCurrentUrl();
     }
     
     
     public String verifyAllItems()
     {
    	 AllItems.click();
    	 return null;
     }







}
