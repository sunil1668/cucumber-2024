package org.com.ButtonExecution;


import org.com.base.Baseclass;
import org.com.locators.Button_locators;
import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.datatable.DataTable;

import org.junit.Assert;
import static org.junit.Assert.*;

public class Button_Execution extends Button_locators 
{
	
	public static void buttonPage()
	{
		Baseclass.click(Baseclass.findelement(Button_locators.workspace));
		JavascriptExecutor jv = (JavascriptExecutor)driver;
		jv.executeScript("window.scrollBy(0,1000)", "");
		Baseclass.implicitwaits();
		jv.executeScript("window.scrollBy(0,-1000)", "");
		Baseclass.click(Baseclass.findelement(Button_locators.clickbutton));
		Baseclass.implicitwaits();
	}
	
	public static void homepagenavigation()
	{
		Assert.assertEquals("https://letcode.in/buttons",driver.getCurrentUrl());
		System.out.print("hi");
		Baseclass.implicitwaits();
		
	}
	
	public static void userclicksgotohomebutton()
	{
		Baseclass.click(Baseclass.findelement(Button_locators.homebutton));	
		Baseclass.implicitwaits();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("https://letcode.in/"));
		System.out.print("hello");

	}
	
	public static void homescreen()
	{
		
		Assert.assertTrue(driver.getCurrentUrl().contains("https://letcode.in/"));
		System.out.print("hello");

	}
	
	

}
