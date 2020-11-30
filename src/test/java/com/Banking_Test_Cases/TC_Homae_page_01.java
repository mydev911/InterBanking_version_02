package com.Banking_Test_Cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Banking_Page_Object.Home_Page;

public class TC_Homae_page_01 extends Base_Class {
	
	@Test
	public void LoginPage_test() throws InterruptedException {
		
		driver.get(Url);
		Home_Page HP = new Home_Page(driver);
		HP.Login_page_click();
		
		
		System.out.println("login page title is +" +driver.getTitle());
		if (driver.getTitle().equals("Home | Let's Kode It")) 
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		Thread.sleep(5000);
		HP.Setup_email(email);
		HP.Setup_password(password);
		HP.Login_button();
			
		
		
	}
	
	
	

}
