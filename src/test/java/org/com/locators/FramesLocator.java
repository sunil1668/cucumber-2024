package org.com.locators;

import org.openqa.selenium.By;

public class FramesLocator extends Windowhandles_locator
{

	
	public static By frames = By.xpath("//a[@href=\"/frame\"]");
	
	public static By firstname =By.xpath("//input[@name=\"fname\"]");
	
	public static By lastname = By.xpath("//input[@name=\"lname\"]");
	
	public static By Email = By.xpath("//input[@name=\"email\"]");
	
}
