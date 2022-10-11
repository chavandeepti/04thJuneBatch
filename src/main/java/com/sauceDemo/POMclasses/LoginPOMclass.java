package com.sauceDemo.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMclass 
{
		
		//driver declared
		private WebDriver driver;
		private Actions act;
	
		//1 find element -username
		@FindBy(xpath="//input[@id='user-name']")
		WebElement username;
		
		//create a method as per action on element
		public void sendusername() 
		{
		username.sendKeys("standard_user");
		}
		
		//2 find element-password
		@FindBy(xpath="//input[@id='password']")
		WebElement password;
	
		//create a method as per action on element
		public void sendpassword()
		{
			password.sendKeys("secret_sauce");
		}
		
		//3 find element-login button
		@FindBy(xpath="//input[@id='login-button']")
		WebElement loginbutton;
		
		//create a method as per action on element
//		public void loginbutton()
//		{
//			loginbutton.click();
//		}
		
		// or using ,mouse action perfrom -login button method
		public void clickLoginbutton()
		{
			act.click(loginbutton).perform();
			
		}
	
		// create constructor
		public LoginPOMclass(WebDriver driver)
		{
			//global 	local
			this.driver = driver;
			
			// selenum class
			PageFactory.initElements(driver, this);
			
			//mouse perform object
			act=new Actions(driver);
		}
}
