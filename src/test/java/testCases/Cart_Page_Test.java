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
import pages.Inventory_page_2;
import pages.LoginPage;
import utility.CaptureScreenshot;

public class Cart_Page_Test extends TestBase
{


	LoginPage login;
	Inventory_page_2  invent;
	Cart_Page cart;
	
	@BeforeMethod(alwaysRun = true)
	
	public void setup() throws InterruptedException
	{
		initialization();
		login= new LoginPage();
		invent = new Inventory_page_2();
		cart = new Cart_Page();
		login.loginToApplication();
		invent.verifyCartCount();
		

		
	}
	
	@Test
	
	public void verifyURLOFApplicationTest()
	{
		String expURL="https://www.saucedemo.com/cart.html";
		String actURL=cart.verifyURLOFApplication();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("URL of the Cart page is = "+actURL);
	}
	@Test
	public void verifyyourCartTextTest()
	{
		String expText="Your Cart";
		String actText=cart.verifyyourCartText();
		Assert.assertEquals(expText, actText);
		Reporter.log("cart page text is = "+actText);
	}
	
	@Test
	
	public void verifySwagLabsTextTest()
	{
		String expText="Swag Labs";
		String actText=cart.verifySwagLabsText();
		Assert.assertEquals(expText, actText);
		Reporter.log("cart page text is = "+actText);
	}
	
	@Test
	
	public void verifyQTYTextTest()
	{
		String expText="QTY";
		String actText=cart.verifyQTYText();
		Assert.assertEquals(expText, actText);
		Reporter.log("cart page text is = "+actText);
	}
	
	@Test
	public void verifyDescriptionTextTest()
	{
		String expText="Description";
		String actText=cart.verifyDescriptionText();
		Assert.assertEquals(expText, actText);
		Reporter.log("cart page text is = "+actText);
	}
	
	
	@Test
	
	public void verifyContinueShoppingBtnTest()
	{
		String expURL ="https://www.saucedemo.com/inventory.html";
		String actURL=cart.verifyContinueShoppingBtn();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("After Clicking ShoppingBTN= = "+actURL);
	}
	
	@Test
	
	public void verifyCheckoutBtnTest()
	{

		String expURL ="https://www.saucedemo.com/checkout-step-one.html";
		String actURL=cart.verifyCheckoutBtn();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("After Clicking ShoppingBTN= = "+actURL);
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
