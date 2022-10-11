package com.sauceDemo.Testclass;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMclasses.LoginPOMclass;



public class TC01_VerifyLoginFunctionality extends TestBaseClass 
{
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("browser is opened");
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("SauceDemo URL is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//loginPage elements find +action perform
		
		LoginPOMclass x = new LoginPOMclass(driver);
		
		x.sendusername();
		System.out.println("username is entered");
		
		x.sendpassword();
		System.out.println("Password is entered");
		
		x.clickLoginbutton();
		System.out.println("Clicked on login button");
	}
	@Test
	public void verifyLoginFunctionality() throws IOException
	{

		//--homePage--
//       System.out.println("apply the validation");
//		
//	   String expectedTitle = "Swag Labs";    //dev/BA
//		
//	   String actualTitle = driver.getTitle();
//	
//	   if(expectedTitle.equals(actualTitle))
//	   {
//		   System.out.println("login functionality test case is passed");
//	   }
//	   else
//	   {
//		   System.out.println("login functionality test case is failed");
//	   }
		
		
	       System.out.println("apply the validation");
			
		   String expectedTitle = "Swag Labs";    //dev/BA	
		   String actualTitle = driver.getTitle();
		
		   Assert.assertEquals(actualTitle, expectedTitle);


	}
	   @AfterMethod
		public void tearDown()
		{

	   driver.quit();
       System.out.println("browser is closed");
       
       System.out.println("end of Program");

//		
	}

}
