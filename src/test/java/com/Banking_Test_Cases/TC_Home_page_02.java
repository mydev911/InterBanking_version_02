package com.Banking_Test_Cases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_Home_page_02 extends Base_Class {
	
	@Test
	public void homepage() throws InterruptedException {
		driver.get(Url);
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("mydev911@gmail.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("1234Asdf");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")).click();
		
	}
	
	
	

}
