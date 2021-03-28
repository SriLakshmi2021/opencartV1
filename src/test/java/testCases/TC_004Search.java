package testCases;

import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import testBase.BaseClass;

@Test
public class TC_004Search extends BaseClass
{
	 
	public void  test_search() throws InterruptedException
		{
		logger.info(" Starting TC_004_Search ");
		
		driver.get(rb.getString("appURL"));
		HomePage hp=new HomePage(driver);
		logger.info("Home Page Displayed ");
		
		driver.manage().window().maximize();
		
		SearchPage sp=new SearchPage(driver);
		
		sp.searchtxt("iPhone");
		Thread.sleep(3000);
		logger.info("Enter any Product"); 
		
		sp.searchbutton();
		Thread.sleep(3000);
   	}
		
	
			
	   	
}

	

