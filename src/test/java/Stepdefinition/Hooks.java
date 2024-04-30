
package Stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.com.base.Baseclass;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Baseclass

{
	
	
	@Before
	public static void setup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajit\\eclipse-workspace\\Cucumber_2024\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("Headless");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
		
		
	}
	
	
@After
	public static void screenshot(Scenario scenario)
	{
		
		if(scenario.isFailed())
		{
			TakesScreenshot tks =(TakesScreenshot)driver;
			  byte[] screenshot =tks.getScreenshotAs(OutputType.BYTES);
			  scenario.attach(screenshot, "img/png", "screenshots");
		}
		else
		{
			TakesScreenshot tks =(TakesScreenshot)driver;
			  byte[] screenshot =tks.getScreenshotAs(OutputType.BYTES);
			  scenario.attach(screenshot, "img/png", "screenshots1");
		}
	 
		
	}
}
	
	

