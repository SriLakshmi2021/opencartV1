package testCases;

import org.testng.annotations.Test;

import pageObjects.Addcart;
import pageObjects.HomePage;
import testBase.BaseClass;

//This is my ADD cart Test case
//This is my ADD cart Test case
//This is my ADD cart Test case
//This is my ADD cart Test case
//This is my ADD cart Test case
//This is my ADD cart Test case
//This is my ADD cart Test case
//This is my ADD cart Test case//This is my ADD cart Test case

@Test
public class TC_005_Addcart extends BaseClass

{
	public void  test_addcart() throws InterruptedException
	{
	 logger.info("Starting TC_005_Addcart");
	 
	 driver.get(rb.getString("appURL"));
	 HomePage hp=  new HomePage(driver);
	 logger.info("Home Page Displayed ");
	 
	 driver.manage().window().maximize();
		
	 Addcart ac=new Addcart(driver);
	  ac.search_txt("iMac");
	  
	  Thread.sleep(3000);
		logger.info("Enter any Product"); 
		
		ac.search_button();
		Thread.sleep(3000);
		logger.info("product displayed on HomePage");
		
		ac.addcart();
		logger.info("product added to cart");
		
		ac.viewcart();
		Thread.sleep(3000);
		logger.info("product added to viewcart");
		
		ac.view();
		Thread.sleep(3000);
		logger.info("product added to view");
		
		
	 
	 
	
	 
	}
	
	
}