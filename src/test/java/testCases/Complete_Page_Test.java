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
import pages.CheckOutPage2;
import pages.Complete_Page;
import pages.Inventory_page_2;
import pages.LoginPage;
import utility.CaptureScreenshot;

public class Complete_Page_Test extends TestBase
{
	LoginPage login;
	Inventory_page_2  invent;
	Cart_Page cart;
	CheckOutPage1 check1;
	CheckOutPage2 check2;
	Complete_Page comp;
	
	@BeforeMethod
	
	public void setup() throws InterruptedException
	{
		initialization();
		login= new LoginPage();
		invent = new Inventory_page_2();
		cart = new Cart_Page();
		check1 =new CheckOutPage1();
		check2=new CheckOutPage2();
		comp=new Complete_Page();
		login.loginToApplication();
		invent.add6Products();
		invent.verifyCartCount();
		cart.verifyCheckoutBtn();
		check1.InputInformation();
		check2.verifyFinishBtn();
	}
	
	
	
	@Test
	
	public void verifyCompleteLableTest()
	{
		String expLable="Checkout: Complete!";
		String actLable=comp.verifyCompleteLable();
		Assert.assertEquals(expLable, actLable);
		Reporter.log("Complete Page  text  is "+actLable);	

	}
	
	@Test
	
	public void verifyimgTest()
	{
		Boolean result= comp.verifyimg();
		Assert.assertEquals(result, true);
		Reporter.log("Visibility On Complete Page img is = "+result);	
	}
	
	@Test
	
	public void verifyThankYouTextTest()
	{
		String expLable="Thank you for your order!";
		String actLable=comp.verifyThankYouText();
		Assert.assertEquals(expLable, actLable);
		Reporter.log("Complete Page Thank You  text  is "+actLable);	
		
	}
	
	@Test
	
	public void verifyCompleteTextTest()
	{
		String expLable="Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		String actLable=comp.verifyCompleteText();
		Assert.assertEquals(expLable, actLable);
		Reporter.log("Complete Page Complete  text  is "+actLable);		
	}
	
	@Test
	public void verifyBackHomeBtnTest()
	{
		String expLable="https://www.saucedemo.com/inventory.html";
		String actLable=comp.verifyBackHomeBtn();
		Assert.assertEquals(expLable, actLable);
		Reporter.log("After Clicking Finish Btn URL is = "+actLable);	
	
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

