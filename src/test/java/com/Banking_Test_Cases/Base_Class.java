package com.Banking_Test_Cases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class Base_Class {
	
	public String Url = "https://letskodeit.teachable.com/";
	public String email = "mydev911@gmail.com";
	public String password = "1234Asdf";
	
	WebDriver driver;
	public static Logger lg;
	
	@BeforeClass
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 lg =Logger.getLogger("Lets code it");
		PropertyConfigurator.configure("Log4j2.properties");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}
	
	
	
	

}
