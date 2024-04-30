package org.com.ButtonExecution;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.com.base.Baseclass;
import org.com.locators.BrokenLinkLocator;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class BrokenlinkExecution extends SelectExecutions

{
public static void loginpageofthislink()

{
  Assert.assertEquals("http://www.deadlinkcity.com/", driver.getCurrentUrl());
  
  //Assert.assertEquals("https://letcode.in/buttons",driver.getCurrentUrl());
}

public static void linkstoring() throws IOException
{
	List<WebElement> li = Baseclass.findelements(BrokenLinkLocator.linklocator);
	System.out.print("size of the links" + li.size());
	
	for(WebElement element: li)
	{
		
		String s = element.getAttribute("href");
		try {
			URL url = new URL(s);
			HttpURLConnection http =(HttpURLConnection)url.openConnection();
			Baseclass.implicitwaits();
			http.connect();
			int res = http.getResponseCode();
			
			if(res>=400)
			{
				System.out.println("broken links are  :" +res + http);
			}
			
			else
			{
				System.out.println("working links are :" +res + http);
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
}
