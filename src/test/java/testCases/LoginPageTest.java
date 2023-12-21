package testCases;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;
import utility.CaptureScreenshot;
import utility.ReadData;

public class LoginPageTest extends TestBase
{
	LoginPage login;
  @BeforeMethod(alwaysRun = true)
  public void setup() throws InterruptedException
  {
	  initialization();
	  login = new LoginPage(); 
  }
  @Test(enabled=true,priority = 1,groups = "Sanity")
  public void verifyTitleOfApplicationTest() throws EncryptedDocumentException, IOException
  {
	  String expTitle=ReadData.readExcel(0, 0);  // Swag Labs(0,0) 
	  String actTitle=login.verifyTitleOfApplication();
      Assert.assertEquals(expTitle, actTitle);
      Reporter.log("Title of Application is = "+actTitle);
  }
  
  @Test(enabled=true,priority = 2,groups = {"Sanity","Retesting"})
  public void verifyURLOFApplicationTest() throws EncryptedDocumentException, IOException
  {
	  String expURL=ReadData.readExcel(0, 1); // https://www.saucedemo.com/(0,1)
	  String actURL=login.verifyURLOFApplication();
	  Assert.assertEquals(expURL, actURL);
	  Reporter.log(" URL of the Application is ="+actURL);
  }
  @Test(enabled=true,priority = 3)
  public void loginToApplicationTest() throws EncryptedDocumentException, IOException
  {
	  String expURL=ReadData.readExcel(0, 2);  //https://www.saucedemo.com/inventory.html(0,2)
	  String actURL=login.loginToApplication();
	  Assert.assertEquals(expURL, actURL);
	  Reporter.log("Login to the Application = "+actURL);
  }
  @AfterMethod(alwaysRun = true)
  public void closeBrowser(ITestResult it) throws IOException
  {
	 if(it.FAILURE==it.getStatus())
	 {
		 CaptureScreenshot.screenshot(it.getName());
	 }
	 
	  
	  report.flush();
	  driver.close();
  }
	
}
