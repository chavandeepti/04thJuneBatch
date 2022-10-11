package com.sauceDemo.Testclass;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauseDemo.UtilityClass.ScreenshotClass;
import com.sauceDemo.POMclasses.HomePOMclass;



public class TC02_VerifyLogOutFunctionality extends TestBaseClass
{
//   WebDriver driver;
//	
//	@BeforeMethod
//	public void setUp() throws IOException
//
//	{
//		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//	     driver = new ChromeDriver();
//		System.out.println("browser is opened");
//		driver.manage().window().maximize();
//		System.out.println("browser is maximized");
//		
//		driver.get("https://www.saucedemo.com/");
//		System.out.println("SauceDemo URL is opened");
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		
//		//loginPage elements find +action perform
//		//loginfunctionality
//		LoginPOMclass x = new LoginPOMclass(driver);
//		x.sendUsername();
//		x.sendPassword();
//		x.clickOnLoginButton();
//		
//		//home-page
//		HomePOMclass y = new HomePOMclass(driver);
//		y.clickMenuButton();
//		y.clickLogOutButton();
//	}	
		@Test
		public void verifyLOgOutFunctionality() throws IOException
		{

		//login-page
//		
//		System.out.println("apply the validation");
//		
//		   String expectedTitle = "Swag Labs";    //dev/BA
//			
//		   String actualTitle = driver.getTitle();
//		
//		   if(expectedTitle.equals(actualTitle))
//		   {
//			   System.out.println("logOut functionality test case is passed");
//		   }
//		   else
//		   {
//			   System.out.println("logOut functionality test case is failed");
//		   }
			HomePOMclass hp = new HomePOMclass(driver);
			hp.clickMenuButton();
			System.out.println("clicked on menu button");
			
			hp.clickLogOutButton();
			System.out.println("clicked on logoUt button");
			
			ScreenshotClass.takeScreenshot(driver);

			
			System.out.println("apply the validation");
			
			   String expectedTitle = "Swag Labs";    //dev/BA
				
			   String actualTitle = driver.getTitle();
			
			   Assert.assertEquals(actualTitle, expectedTitle);


		}
//		@AfterMethod
//		public void tearDown()
//		{
//
//
//		   driver.quit();
//	       System.out.println("browser is closed");
//	       
//	       System.out.println("end of Program");
//
//			
//
//	       
//	}

}
