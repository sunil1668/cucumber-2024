package org.com.ButtonExecution;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.com.base.Baseclass;
import org.com.locators.Windowhandles_locator;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowhandles_execution extends BrokenlinkExecution
{

 public static void singlewindowhandle() throws InterruptedException
 {
	Baseclass.action(Baseclass.findelement(Windowhandles_locator.openhomepagewindow));
	
	Set<String> totalwindows = driver.getWindowHandles();
	
	System.out.println(totalwindows);
	
	 List<String> windows = new ArrayList<String>(totalwindows);
	 
	 driver.switchTo().window(windows.get(1));
	 
	 Thread.sleep(1000);
	 
	 Baseclass.clickusingjavascript(Baseclass.findelement(Windowhandles_locator.calender));
	 
	 Baseclass.implicitwaits();
	 
	// WebDriverWait web = new WebDriverWait(driver, 20);
	//web.until(ExpectedConditions.invisibilityOfElementLocated(Windowhandles_locator.calender));
	 
	//Baseclass.findelement(Windowhandles_locator.calender).click();
	 
 }
	
 
 public static void multiwindows() throws InterruptedException
 {
	 Baseclass.action(Baseclass.findelement(Windowhandles_locator.multiwindow));
	 Baseclass.implicitwaits();
	 Set<String> multiwindowsref = driver.getWindowHandles();
	 System.out.println("window ref under sets : " +multiwindowsref);
	 List<String> windowss = new ArrayList(multiwindowsref);
	 System.out.println("window ref under Lists : " +windowss);
	 driver.switchTo().window(windowss.get(1));
	 Thread.sleep(1000);
	 String s = driver.getTitle();
	 System.out.print(s);
	 Thread.sleep(1000);
	 Baseclass.action(Baseclass.findelement(Windowhandles_locator.promptalert));
	 Alert alr = driver.switchTo().alert();
	 alr.sendKeys("Please conitnue");
	 alr.accept();
	 	 
 }
	
}
