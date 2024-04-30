package org.com.ButtonExecution;

import java.util.List;

import org.com.base.Baseclass;
import org.com.locators.FramesLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramesExecution extends Windowhandles_execution 

{

	public static void clicking_frames() throws InterruptedException 
	
	{
		Baseclass.clickusingjavascript(Baseclass.findelement(FramesLocator.frames));
	}
	
	public static void framesops()
	
	{

		
		List<WebElement> frames = driver.findElements(By.xpath("//iframe"));
		
		System.out.println("Total Frame Size is : " + frames.size());
		
		driver.switchTo().frame(0);
		Baseclass.sendkeys(Baseclass.findelement(FramesLocator.firstname), "Helo");
		Baseclass.sendkeys(Baseclass.findelement(FramesLocator.lastname), "ravi");
		WebElement frame =driver.findElement(By.xpath("//iframe[@src=\"innerFrame\"]"));
		driver.switchTo().frame(frame);
		Baseclass.sendkeys(Baseclass.findelement(FramesLocator.Email), "sunilravi@gmail.com");
		driver.switchTo().parentFrame();
		Baseclass.sendkeys(Baseclass.findelement(FramesLocator.firstname), "hi");
		
	     
	}
	
}
