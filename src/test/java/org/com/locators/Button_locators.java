package org.com.locators;

import org.com.base.Baseclass;
import org.openqa.selenium.By;

public class Button_locators extends Baseclass
{
 public static By workspace = By.linkText("Work-Space");
 
 public static By clickbutton = By.linkText("Click");
 
 public static By homebutton = By.xpath("//button[@id='home']");
 
 public static By Loginbutton = By.xpath("//a[text()='Log in']");
 
 public static By email = By.name("email");
 
 public static By password =By.name("password");
 
public static By credlogin = By.xpath("//button[text()='LOGIN']");
 
 
 
}

