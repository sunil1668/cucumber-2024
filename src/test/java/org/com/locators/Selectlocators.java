package org.com.locators;

import org.openqa.selenium.By;

public class Selectlocators extends Button_locators
{

	public static By workspace = By.linkText("Work-Space");
	
	public static By dropdown = By.xpath("//a[text()='Drop-Down']");
	
	public static By selectvistxt = By.xpath("//select[@id=\"fruits\"]");
	
	
	public static By select2 =By.xpath("//select[@id='superheros']");
	
}
