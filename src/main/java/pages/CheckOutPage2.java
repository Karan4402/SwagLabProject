package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckOutPage2 extends TestBase
{
	
	//Object Repository
  @FindBy(xpath="//span[@class='title']") private WebElement CheckOutPage2Lable;
  @FindBy(xpath="//div[@class='cart_quantity_label']") private WebElement CartQuantityText;
  @FindBy(xpath="//div[@class='cart_desc_label']") private WebElement CartDescText;
  @FindBy(xpath="//div[text()='Payment Information']") private WebElement PaymentInformationText;
  @FindBy(xpath="//div[text()='Shipping Information']") private WebElement ShippingInformationText;
  @FindBy(xpath="//div[text()='Price Total']") private WebElement PriceTotalText;
  @FindBy(xpath="//button[@class='btn btn_secondary back btn_medium cart_cancel_link']") private WebElement CancelBtn;
  @FindBy(xpath="//button[@name='finish']") private WebElement FinishBtn;
  
	
  
  // Constructor
  
  public  CheckOutPage2()
  {
	  PageFactory.initElements(driver, this);
  }
  
  
  
  
  
  public String verifyCheckOutPage2Lable()
  {
	   return CheckOutPage2Lable.getText();
  }
  
  public String verifyCartQuantityText()
  {
	  return CartQuantityText.getText();
  }
  
  public String verifyCartDescText()
  {
	  return CartDescText.getText();
  }
  
  public String verifyPaymentInformationText()
  {
	  return PaymentInformationText.getText();
  }
  
  public String verifyShippingInformationText()
  {
	  return ShippingInformationText.getText();
  }
  
  public String verifyPriceTotalText()
  {
	  return PriceTotalText.getText();
  }
  
  public String verifyCancelBtn()
  {
	  CancelBtn.click();
	  return driver.getCurrentUrl();
  }
  
  public String verifyFinishBtn()
  {
	  FinishBtn.click();
	  return driver.getCurrentUrl();
  }
  
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
