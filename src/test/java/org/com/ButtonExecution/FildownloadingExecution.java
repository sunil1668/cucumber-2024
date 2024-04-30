package org.com.ButtonExecution;

import java.io.File;

import org.com.base.Baseclass;
import org.com.locators.FildownloadingLocator;

public class FildownloadingExecution extends FramesExecution

{
public static void Filedownloading() throws InterruptedException
{
	
	Baseclass.click(Baseclass.findelement(FildownloadingLocator.download));
	
	
	
	Thread.sleep(1000);
	
	File location = new File("C:\\Users\\rajit\\Downloads");
	
	File [] files =location.listFiles();
	
	for (File file : files) 
	
	{
	  if(file.getName().equals("samplee.xslx"));
	  {
	  System.out.print("File name is : " + file);
	  }
	  
	  if else
		  
	}
	}
	
	
	
}



	

