package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;
import utility.HandleDropdownList;

public class Inventory_page_2 extends TestBase
{
   // Object Repositery
	
	    @FindBy(xpath="//span[@class='title']") private WebElement productsLable;
	    @FindBy(xpath="//div[@class='app_logo']") private WebElement swagLabLable;
		@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement CartCount;
        @FindBy(xpath="//select[@class='product_sort_container']") private WebElement dropDown;
        // element added
        @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement backPackProduct;
        @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement bikeLightProduct;
        @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement boltTShirtProduct;
        @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement fleeceJacketProduct;
        @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']") private WebElement labsOnesieProduct;
        @FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement tShirtRedProduct;
    
        //element remove
        @FindBy(xpath="//button[@id='remove-sauce-labs-backpack']") private WebElement removebackPackProduct;
        @FindBy(xpath="//button[@id='remove-sauce-labs-onesie']") private WebElement removelabsOnesie;
        @FindBy(xpath="//button[@id='remove-sauce-labs-bike-light']") private WebElement removebikeLightProduct;
        @FindBy(xpath="//button[@id='remove-sauce-labs-bolt-t-shirt']") private WebElement removeboltTShirtProduct;
        @FindBy(xpath="//button[@id='remove-test.allthethings()-t-shirt-(red)']") private WebElement removetShirtRedProduct;
        @FindBy(xpath="//button[@id='remove-sauce-labs-fleece-jacket']") private WebElement removefleeceJacketProduct;
        
        
//        @FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement menuBtn;
        @FindBy(xpath="//a[text()='Twitter']") private WebElement twitterLogo;  
        @FindBy(xpath="//a[text()='Facebook']") private WebElement facebookLogo;
        @FindBy(xpath="//a[text()='LinkedIn']") private WebElement linkedinLogo;
        @FindBy(xpath="//div[@class='footer_copy']") private WebElement footerText;
        
        
        //constructor
        public Inventory_page_2 ()
        {
        	PageFactory.initElements(driver, this);
        }
        
        public String verifyCartCount()
        {
        	CartCount.click();
        	return driver.getCurrentUrl();
        }
        
        public String  verifyproductsLable()
        {
        	return productsLable.getText();
        }
        
        public String verifyswagLabLable()
        {
        	return swagLabLable.getText();
        }
        
        public Boolean verifytwitterLogo()
        {
        	return twitterLogo.isDisplayed();
        }
        
        public Boolean verifyfacebookLogo()
        {
        	return facebookLogo.isDisplayed();
        }
        
        public Boolean verifylinkedinLogo()
        {
        	return linkedinLogo.isDisplayed();
        }
        
//        public String verifymenuBtn()
//        {
//        	 menuBtn.click();
////        	return menuBtn.getText();
//        	 return null;
//        }
//        
        public String add6Products()
        {
        HandleDropdownList.handleSelectClass(dropDown, "Price (low to high)");
           backPackProduct.click();
           bikeLightProduct.click();
           boltTShirtProduct.click();
           fleeceJacketProduct.click();
           labsOnesieProduct.click();
           tShirtRedProduct.click();
           return CartCount.getText();
         
        }
        
        public String remove6Products() throws InterruptedException
        {
        	add6Products();
        	Thread.sleep(4000);
        	removebackPackProduct.click();
        	removebikeLightProduct.click();
           
            return CartCount.getText();
        }
        
        public String verifyfooterText()
        {
        	return footerText.getText();
        }
        
        
        
        






}
