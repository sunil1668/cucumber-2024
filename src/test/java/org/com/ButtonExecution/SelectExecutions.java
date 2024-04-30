package org.com.ButtonExecution;

import org.com.base.Baseclass;
import org.com.locators.Button_locators;
import org.com.locators.Selectlocators;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.*;



public class SelectExecutions extends Button_Execution
{
	
	public static void clickingworkspace()
	{
		Baseclass.click(Baseclass.findelement(Button_locators.workspace));
	}
	
	
	public static void validationoftestpage()
	{
		String text = driver.findElement(By.xpath("//div[@class=\"column\"]/h1")).getText();
		System.out.println(text);
		Assert.assertEquals("Practice and become pro in test automation", text);
		
	}

	public static void clickingselect()
	{
		//Baseclass.click(Baseclass.findelement(Selectlocators.dropdown));
		Baseclass.action(Baseclass.findelement(Selectlocators.dropdown));
	}
	
	
	public static void Selectpractisepage()
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("https://letcode.in/dropdowns"));
		//Assert.assertTrue(driver.getCurrentUrl().contains("https://letcode.in/"));
	}
	
	
	public static void Selectvisibletext() throws InterruptedException
	{
	Select dropdown = new Select(Baseclass.findelement(Selectlocators.selectvistxt));
	dropdown.selectByVisibleText("Banana");
	dropdown.selectByIndex(2);
	 Boolean res=  dropdown.isMultiple();
	 System.out.println(res);
	 
	 Select dropdown1= new Select(Baseclass.findelement(Selectlocators.select2));
	 boolean res1= dropdown1.isMultiple();
	 System.out.println(res1);
	 dropdown1.selectByVisibleText("The Avengers");
	 dropdown1.selectByValue("bt");
	 Thread.sleep(100);
	 scrollup_and_down();
	 String s=dropdown1.getFirstSelectedOption().getText();
	 System.out.print(s);
	 Baseclass.implicitwaits();
	 dropdown1.deselectAll();
	 
	
	}
	
	
	
	
}
