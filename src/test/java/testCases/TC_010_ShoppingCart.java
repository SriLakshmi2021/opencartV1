package testCases;

import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.ShoppingCart;
import testBase.BaseClass;

public class TC_010_ShoppingCart  extends BaseClass
{
@Test
   public void test_ShoppingCart() throws InterruptedException
    {
	   logger.info("Starting TC_010_ShoppingCart");
	   driver.get(rb.getString("appURL"));
	   HomePage hp=new HomePage(driver);
	   logger.info("Home Page Displayed ");
	
	   driver.manage().window().maximize();
	   
	   ShoppingCart sc=new ShoppingCart(driver);
	   sc.searchtxt("iMac");
	   logger.info("Search iMac is  Displayed ");
	   
	   sc.searchbutton();
	   logger.info("Search Button clicked ");
	   Thread.sleep(3000);
	 
	   sc.addtocart();
	   logger.info("Add to Cart clicked ");
	   Thread.sleep(5000);
	 
		
	  sc.shop_cart();
	  logger.info("Shopping Cart clicked ");
	  Thread.sleep(5000);
		 
	  sc.dropdown();
	  Thread.sleep(2000);
	  
	  sc.drptext("EKm209");
	    
	  sc.drpdown2();
	  Thread.sleep(1000);
	  sc.select_list();
	  Thread.sleep(3000);
	  
	  sc.select_list2();
	  Thread.sleep(1000);
	  
	  sc.select_text("85383");
	  Thread.sleep(1000);
	  sc.select_getquote();
	  sc.select_radio();
	  Thread.sleep(1000);
	  sc.select_applyship();
	  
	  Thread.sleep(5000);
	  
	  sc.select_gift();
	  
	  sc.select_giftcertifi("X2D4B44");
	  Thread.sleep(1000);
	  sc.select_buttongc();
	  Thread.sleep(1000);
	  
	  sc.click_continue();
	  Thread.sleep(3000); 
	  
}
}
