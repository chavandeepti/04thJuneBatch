package com.sauceDemo.POMclasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMclass 
{
		//declared driver
			private WebDriver driver;
			private Select s;

		
		//find single element to - add to cart
		@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
		private WebElement bagbutton;
		
		// crate method
		public void clickBagButton()
		{
			bagbutton.click();
		}

		// sinle elemnet add to cart link
		@FindBy(xpath="//a[@class='shopping_cart_link']")
		private WebElement addToCart;
		
		//create method
		public String getTextFromAddToCart()
		{
			String totalProducts= addToCart.getText();
			return totalProducts;
		}
		
		//multiple product find
		@FindBy(xpath = "//button[text()='Add to cart']")
		private List<WebElement> allProducts;
		
		//create method
		public void clickAllProducts()
		{
			for(int i=0; i<allProducts.size();i++)
			{
				allProducts.get(i).click();
			}
		}
		// for each condition
		
		//drop down 
		
		@FindBy(xpath = "//select[@class='product_sort_container']")
		private WebElement dropDown;
		
		public void clickDropDownFilter()
		{
			dropDown.click();
//			Select s = new Select(dropDown);
			s.selectByValue("lohi");	
		}
		@FindBy(xpath = "//button[@id='react-burger-menu-btn']")
		private WebElement menuButton;
		
		//3.
		public void clickMenuButton()
		{
			menuButton.click();
		}
		
		//2.
		@FindBy(xpath = "//a[@id='logout_sidebar_link']")
		private WebElement logOutButton;
		
		//3. 
		public void clickLogOutButton()
		{
			logOutButton.click();
		}
		
		//4
		public HomePOMclass(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
			s = new Select(dropDown);
		}
		



		
}
