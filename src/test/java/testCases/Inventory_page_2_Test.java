package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.Inventory_page_2;
import pages.LoginPage;
import utility.ReadData;

public class Inventory_page_2_Test extends TestBase
{
	
	LoginPage login;
	Inventory_page_2  invent;
	
	@BeforeMethod(alwaysRun = true)
	public void setup() throws InterruptedException,IOException
	  {
		  initialization();
		  login = new LoginPage(); 
		  invent=new Inventory_page_2();
		  login.loginToApplication();
	  }
	
	
	
   @Test(groups = "Sanity")
   public void verifyproductsLableTest() throws EncryptedDocumentException, IOException
   {
	   String expLable=ReadData.readExcel(0, 3);  //Products (0,3)
	   String actLable=invent.verifyproductsLable();
	   Assert.assertEquals(expLable, actLable);
	   Reporter.log(" Lable of Inventory page = "+ actLable);		   
   }
   
   
   @Test
   public void verifyCartCountTest()
   {
	   String expURL="https://www.saucedemo.com/cart.html";
       String actURL=invent.verifyCartCount();
       Assert.assertEquals(expURL, actURL);
       Reporter.log("cart URL is = "+actURL);
   }
   @Test
   
   public void verifyswagLabLableTest()
   {
	   String expLable1="Swag Labs";
	   String actLable1=invent.verifyswagLabLable();
	   Assert.assertEquals(expLable1, actLable1);
	   Reporter.log("swag lable of Inventory page is = " +actLable1);
   }
   
   @Test(groups = "Retesting")
   public void verifytwitterLogoTest()
   {
	   Boolean result= invent.verifytwitterLogo();
	   Assert.assertEquals(result, true);
	   Reporter.log("Visibility of Twitter Logo = " +result);
   }
   
   @Test
   
   public void verifyfacebookLogoTest()
   {
	   Boolean result=invent.verifyfacebookLogo();
	   Assert.assertEquals(result, true);
	   Reporter.log(" Visibility of facebook Logo ="+result);
   }
   
   @Test
    public void verifylinkedinLogoTest()
    {
	   Boolean result=invent.verifylinkedinLogo();
	   Assert.assertEquals(result, true);
	   Reporter.log("Visibility of LinkeddIn Logo= "+result);
    }
   
   
   
   
   @Test(groups = {"Retesting","Regression"})
   
   public void add6ProductsTest() throws EncryptedDocumentException, IOException
   {
	   String expCount=ReadData.readExcel(0, 4); // 6(0,4)
	   String actCount=invent.add6Products();
	   Assert.assertEquals(expCount, actCount);
	   Reporter.log( " Total Products added to cart = " +actCount);
   }
   
   @Test
   
   public void verifyfooterTextTest()
   {
	   String expText2="© 2023 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";
	   String actText2=invent.verifyfooterText();
	   Assert.assertEquals(expText2, actText2);
	   Reporter.log("Footer text of inventory page is= "+actText2);
   }
   
   @Test(groups = {"Retesting","Regression"})
   
   public void remove6ProductsTest() throws InterruptedException, EncryptedDocumentException, IOException
   {
	   String expCount3=ReadData.readExcel(0, 5);  // 4(0,5)
	   String actCount3=invent.remove6Products();
	   Assert.assertEquals(expCount3, actCount3);
	   Reporter.log("count of product after removeing  " +actCount3);
   }
   
   
   
//   @Test
   
//   public void verifymenuBtnTest()
//   {
//	   String expBtn3="//button[@id='react-burger-menu-btn']";
//	   String actBtn3=invent.verifymenuBtn();
//	   Assert.assertEquals(expBtn3, actBtn3);
//	   Reporter.log(" Click on menu button= "+actBtn3);
//   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   @AfterMethod(alwaysRun = true)
   
   public void closeBrowser()
   {
	   driver.close();
   }
	
	
	
	
	
	
	
	
}
