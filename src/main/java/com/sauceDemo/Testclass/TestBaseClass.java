package com.sauceDemo.Testclass;


import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauseDemo.UtilityClass.ScreenshotClass;
import com.sauceDemo.POMclasses.LoginPOMclass;


public class TestBaseClass 
{
	
   WebDriver driver;
   Logger log= Logger.getLogger("SauseDemo04thJuneBatch");
   
   @Parameters("browserName")
   @BeforeMethod
	public void setUp(String browserName) throws IOException
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./DriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		
		}
		else
		{
			System.setProperty("webdriver.gecko.driver","./DriverFiles\\geckodriver.exe");
			driver = new FirefoxDriver();		
		}
		
		PropertyConfigurator.configure("log4j.properties");
		log.info("browser is opened");
		
		driver.manage().window().maximize();
		log.info("browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		log.info("SauceDemo URL is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//take screesnhot
		ScreenshotClass.takeScreenshot(driver);
		
		
		//loginPage elements find +action perform
		
		LoginPOMclass x = new LoginPOMclass(driver);
		
		x.sendusername();
		log.info("username is entered");
		
		x.sendpassword();
		log.info("Password is entered");
		
		x.clickLoginbutton();
		log.info("Clicked on login button");
	    
		
				
	}
	
	@AfterMethod
	public void tearDown()
	{
		   driver.quit();
	       log.info("browser is closed");
	       
//	       System.out.println("end of Program");	
	}

}
