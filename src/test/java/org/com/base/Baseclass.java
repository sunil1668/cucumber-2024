package org.com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass 
{

	public static WebDriver driver;
	
		
	public static void gettproperty(String url) throws IOException
	{
	
	FileInputStream f = new FileInputStream("C:\\Users\\rajit\\eclipse-workspace\\Cucumber_2024\\src\\test\\java\\Testing.Properties");
	Properties pp = new Properties();
	pp.load(f);
	String weburl = pp.getProperty(url);
	driver.get(weburl);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	}
	public static WebElement findelement(By by)
	{
		
		return driver.findElement(by);
		
		
		
	}
	
	public static List findelements(By by)
	{
		
		return driver.findElements(by);
		
	}
	
	
	public static void sendkeys(WebElement element, String data)
	{
		
		element.sendKeys(data);
		
	}
	
	public static void click(WebElement element)
	{
		element.click();
	}
	public static void implicitwaits()
	
	{
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	
	
	
	
	public static void explicitwaits()
	{
		WebDriverWait web = new WebDriverWait(driver, 20);
		web.until(ExpectedConditions.invisibilityOfElementLocated(null));
		
	}
	
	public static void scrollup_and_down()
	{
		JavascriptExecutor jv =(JavascriptExecutor)driver;
		//jv.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		jv.executeScript("window.scrollBy(0,50)");
			
	}
	
	
	public static void to_move_to_a_WebElement(WebElement element) throws InterruptedException
	{
		JavascriptExecutor jv =(JavascriptExecutor)driver;
		//jv.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		jv.executeScript("arguments[0].scrollIntoView(true)",element);
		Thread.sleep(500);
		//jv.executeScript("window.scroll(0,1000)");
			
	}
	
	
	public static void clickusingjavascript(WebElement element) throws InterruptedException
	{
		JavascriptExecutor jv =(JavascriptExecutor)driver;
		//jv.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		jv.executeScript("arguments[0].click();",element);
		Thread.sleep(500);
		//jv.executeScript("window.scroll(0,1000)");
			
	}
	
	public static void action(WebElement element)
	{
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
		
	}
	
	
	
	
}
