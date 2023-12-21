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
import pages.Inventory_page_2;
import pages.LoginPage;
import utility.CaptureScreenshot;

public class CheckOutPage2_Test  extends TestBase
{
	LoginPage login;
	Inventory_page_2  invent;
	Cart_Page cart;
	CheckOutPage1 check1;
	CheckOutPage2 check2;
	
	@BeforeMethod(alwaysRun = true)
	
	public void setup() throws InterruptedException
	{
		initialization();
		login= new LoginPage();
		invent = new Inventory_page_2();
		cart = new Cart_Page();
		check1 =new CheckOutPage1();
		check2=new CheckOutPage2();
		login.loginToApplication();
		invent.add6Products();
		invent.verifyCartCount();
		cart.verifyCheckoutBtn();
		check1.InputInformation();
		
	}
	
	@Test
	public void verifyCheckOutPage2LableTest()
	{
		String expLable="Checkout: Overview";
		String actLable=check2.verifyCheckOutPage2Lable();
		Assert.assertEquals(expLable, actLable);
		Reporter.log("CheckOut Page2 Lable is "+actLable);
	}
	
	@Test
	
	public void verifyCartQuantityTextTest()
	{
		String expLable="QTY";
		String actLable=check2.verifyCartQuantityText();
		Assert.assertEquals(expLable, actLable);
		Reporter.log("CheckOut Page2 QTY text  is "+actLable);	
	}
	
	@Test
	 public void verifyCartDescTextTest()
	 {
		String expLable="Description";
		String actLable=check2.verifyCartDescText();
		Assert.assertEquals(expLable, actLable);
		Reporter.log("CheckOut Page2 Description text  is "+actLable);	
	 }
	
	@Test
	public void verifyPaymentInformationTextTest()
	{
		String expLable="Payment Information";
		String actLable=check2.verifyPaymentInformationText();
		Assert.assertEquals(expLable, actLable);
		Reporter.log("CheckOut Page2 Payment Information text  is "+actLable);	
	}
	
	@Test
	public void verifyShippingInformationTextTest()
	{
		String expLable="Shipping Information";
		String actLable=check2.verifyShippingInformationText();
		Assert.assertEquals(expLable, actLable);
		Reporter.log("CheckOut Page2 Shipping Information text  is "+actLable);	
	
	}
	
	@Test
	
	public void verifyPriceTotalTextTest()
	{
		String expLable="Price Total";
		String actLable=check2.verifyPriceTotalText();
		Assert.assertEquals(expLable, actLable);
		Reporter.log("CheckOut Page2 Price Total text  is "+actLable);	
	}
	
	@Test
	
	public void verifyCancelBtnTest()
	{
		String expLable="https://www.saucedemo.com/inventory.html";
		String actLable=check2.verifyCancelBtn();
		Assert.assertEquals(expLable, actLable);
		Reporter.log("CheckOut Page2 After Clicking Cancel BTN URL   is= "+actLable);	
	}
	
	@Test
	
	public void verifyFinishBtnTest()
	{
		String expLable="https://www.saucedemo.com/checkout-complete.html";
		String actLable=check2.verifyFinishBtn();
		Assert.assertEquals(expLable, actLable);
		Reporter.log("CheckOut Page2 After Clicking Finish BTN URL   is= "+actLable);	
	}
	
	
	
	
	
	
	
	
	
	
	@AfterMethod(alwaysRun = true)
	    public void closeBrowser(ITestResult it) throws IOException
		  {
			 if(it.FAILURE==it.getStatus())
			 {
				 CaptureScreenshot.screenshot(it.getName());
			 }
			 
			  
			  
			  driver.close();
		  }
	
	
	
	
	
	
	
}
