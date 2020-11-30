package com.Banking_Test_Cases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Banking_Page_Object.Home_Page;

public class Reset_password_Page_Test_01 extends Base_Class {
	
	@Test
	public void password_reset_page() throws InterruptedException {
		
		driver.get(Url);
		lg.info("Open browser");
		Home_Page hp = new Home_Page(driver);
		hp.Login_page_click();
		lg.info("login page click");
		Thread.sleep(5000);
		hp.Forget_button_click();
		lg.info("forget page click");
		
	    String  Forget_text= driver.findElement(By.xpath("//h1[contains(text(),'Reset Password')]")).getText();
	    System.out.println("ForgeT_text=" +Forget_text);
	    
	    
	    if (Forget_text.equals("Reset Password")) {
			Assert.assertTrue(true);
		}
	    else {
	    	Assert.assertTrue(false);
	    }
	    
	    
		
	}

}
