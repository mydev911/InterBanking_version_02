package com.Banking_Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	WebDriver Idriver;
	
	public Home_Page(WebDriver rdriver)
	{
		Idriver =rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath ="//a[contains(text(),'Practice')]" )
	WebElement practice_page;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement  Login_Page;
	
	@FindBy(xpath = "//input[@id='user_email']")
	WebElement User_email;
	
	@FindBy(xpath = "//input[@id='user_password']")
	WebElement User_password;
	
	@FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")
	WebElement logIN_button ;
	
	@FindBy(xpath = "//a[contains(text(),'Forgot Password?')]")
	WebElement forget_button;
	
	
	public void practic_page_click() {
		practice_page.click();
		
	}
	public void Login_page_click() {
		Login_Page.click();
		
	}
	
	public void Setup_email(String email) {
		User_email.sendKeys(email);
		
	}
	public void Setup_password(String password) {
		User_email.sendKeys(password);
		
	}
	
	public void Login_button() {
		logIN_button.click();
		
	}
	
	
	public void Forget_button_click() {
		// TODO Auto-generated method stub
		forget_button.click();
	}	

}
