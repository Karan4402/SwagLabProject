package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Cart_Page;
import pages.CheckOutPage1;
import pages.Inventory_page_2;
import pages.LoginPage;
import utility.CaptureScreenshot;

public class CheckOutPage1_Test extends TestBase
{
	
	LoginPage login;
	Inventory_page_2  invent;
	Cart_Page cart;
	CheckOutPage1 check1;
	
	@BeforeMethod
	
	public void setup() throws InterruptedException
	{
		initialization();
		login= new LoginPage();
		invent = new Inventory_page_2();
		cart = new Cart_Page();
		check1 =new CheckOutPage1();
		login.loginToApplication();
		invent.add6Products();
		invent.verifyCartCount();
		cart.verifyCheckoutBtn();
		
	}
	
	@Test
	public void verifyURLOfCheckOutPageTest()
	{
		String expURL="https://www.saucedemo.com/checkout-step-one.html";
		String actURL=check1.verifyURLOfCheckOutPage();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("The URL of CheckOutPage is ="+actURL);
	}
	
	@Test
	
	public void verifyTitleOfApplicatioTest()
	{
		String expTitle="Checkout: Your Information";
		String actTitle=check1.verifyTitleOfApplicatio();
		Assert.assertEquals(expTitle, actTitle);
		Reporter.log("Title Of CheckOutPage1 is ="+actTitle);
	}
	
	@Test
	public void InputInformationTest()
	{
		String expURL="https://www.saucedemo.com/checkout-step-two.html";
		String actURL=check1.InputInformation();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("Title of Check out Page 2 is ="+actURL);
	}
	
	
	
    
    
    
    
    
    
    
    @AfterMethod
    
    public void closeBrowser(ITestResult it) throws IOException
	  {
		 if(it.FAILURE==it.getStatus())
		 {
			 CaptureScreenshot.screenshot(it.getName());
		 }
		 
		  
		  
		  driver.close();
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
