package com.sauceDemo.Testclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauseDemo.UtilityClass.ScreenshotClass;
import com.sauceDemo.POMclasses.HomePOMclass;

public class TC04_VerifyAllProductFunctionality 
{
	
//	public static void main(String[] args) 
//	{
//		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		System.out.println("browser is opened");
//		driver.manage().window().maximize();
//		System.out.println("browser is maximized");
//		
//		driver.get("https://www.saucedemo.com/");
//		System.out.println("SauceDemo URL is opened");
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		//loginActivity
//				LoginPOMclass lp = new LoginPOMclass(driver);
//				lp.sendUsername();
//				lp.sendPassword();
//				lp.clickOnLoginButton();
//				System.out.println("login activity is performed");
//				
//				//--homePage--//
//				
//				//bag product
//				HomePOMclass hp = new HomePOMclass(driver);
//				hp.clickAllProducts();
//				System.out.println("All products will get selected");
//				
//				//--validation--//
//				String exceptedProduct = "6";
//				
//				String actualProduct = hp.getTextFromAddToCart();
//				System.out.println("actual product->"+actualProduct);
//				
//				System.out.println("apply validation");
//				
//				if(exceptedProduct.equals(actualProduct))
//				{
//					System.out.println("All products add to cart case is passed");
//				}
//				else
//				{
//					System.out.println("All products add to cart case is failed");
//				}
//				
//				driver.quit();
//			    System.out.println("browser is closed");
//			       
//			    System.out.println("end of Program");
//
//
//		
//	}
	
	WebDriver driver;
	@Test
	public void verifyAllProductFunctionality() throws IOException
	{
		
		//--homePage--//
		
		//bag product
		HomePOMclass hp = new HomePOMclass(driver);
		hp.clickAllProducts();
		System.out.println("All products will get selected");
		ScreenshotClass.takeScreenshot(driver);
		//--validation--//
		String exceptedProduct = "6";
		
		String actualProduct = hp.getTextFromAddToCart();
		System.out.println("actual product->"+actualProduct);
		
		System.out.println("apply validation");
		
//		if(exceptedProduct.equals(actualProduct))
//		{
//			System.out.println("All products add to cart case is passed");
//		}
//		else
//		{
//			System.out.println("All products add to cart case is failed");
//		}
		
		Assert.assertEquals(actualProduct, exceptedProduct);
		}

	
	
	
}
