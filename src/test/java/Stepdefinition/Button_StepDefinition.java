package Stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.com.ButtonExecution.BrokenlinkExecution;
import org.com.ButtonExecution.Button_Execution;
import org.com.ButtonExecution.FildownloadingExecution;
import org.com.ButtonExecution.FramesExecution;
import org.com.ButtonExecution.SelectExecutions;
import org.com.ButtonExecution.Windowhandles_execution;
import org.com.base.Baseclass;
import org.com.locators.Button_locators;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Button_StepDefinition extends FildownloadingExecution
{
	@Given("user enters to letcode page")
	public void user_enters_to_letcode_page() throws IOException 
	{
	 Baseclass.gettproperty("websitename");
	}
	    
	@When("user clicks option under button")
	public void user_clicks_option_under_button() 
	{
		buttonPage();
		
		
}
	@Then("user navigates to letcode button page")
	public void user_navigates_to_letcode_button_page() 
	{
		homepagenavigation();    
	}
	@When("user clicks Goto home button")
	public void user_clicks_goto_home_button() 
	{
		userclicksgotohomebutton();
	}
	@Then("user navigates to homepage")
	public void user_navigates_to_homepage() {
		
		homescreen();
	    
	}

	
	//login function
	
	
	@When("user enters Loginbutton")
	public void user_enters_loginbutton() 
	{
		Baseclass.click(Baseclass.findelement(Button_locators.Loginbutton));
		Baseclass.implicitwaits();
	}
		
	@When("user enters with below Email and passwords")
	public void user_enters_with_below_email_and_passwords(DataTable datatable) 
	{
	    
		List<Map<String,String>> mapdata =datatable.asMaps(String.class,String.class);
		   for (Map<String, String> map : mapdata) 
		   {
			 driver.findElement(Button_locators.email).sendKeys(map.get("Email"));
			 Baseclass.implicitwaits();
			 driver.findElement(Button_locators.password).sendKeys(map.get("passwords"));
		  }
		 
		   
		    }

	@Then("user enters login page")
	public void user_enters_login_page()
	{
		
		Baseclass.click(Baseclass.findelement(Button_locators.credlogin));
		Baseclass.implicitwaits();
	   
	}


@Then("user scrolls up and down")
public void user_scrolls_up_and_down() 
{
	
Baseclass.scrollup_and_down();

}
// Testing for select dropdowns
@When("user clicks workspace")
public void user_clicks_workspace() 
{
	clickingworkspace();
}
@Then("user Navigates to Testpage")
public void user_navigates_to_testpage() 
{
    validationoftestpage();
    try {
		Thread.sleep(5);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@Then("user click select button")
public void user_click_select_button() 
{
   clickingselect();
}
@Then("user navigates to selectpractise page")
public void user_navigates_to_selectpractise_page() 
{
   Selectpractisepage();
}
@Then("user performs action in the fruit select box")
public void user_performs_action_in_the_fruit_select_box() throws InterruptedException 
{
    Selectvisibletext();
}
//Broken links

@Given("when user enter brokenlink page")
public void when_user_enter_brokenlink_page() throws IOException
{
Baseclass.gettproperty("Deadlink");	
 loginpageofthislink();  
}
@Then("user stores all the link")
public void user_stores_all_the_link() throws IOException
{
	linkstoring();
}
@Then("user provides respones for the brokenlinks")
public void user_provides_respones_for_the_brokenlinks() {
    
}


@Given("user navigates to windowhandles page")
public void user_navigates_to_windowhandles_page() throws IOException 
{
	Baseclass.gettproperty("windowhandles");
	
}
@Then("user performs windowhandles operation")
public void user_performs_windowhandles_operation() throws InterruptedException 
{
	multiwindows();
}
// background and frames section
@Given("user navigates to dummy feature")
public void user_navigates_to_dummy_feature() 
{
   System.out.print("Dummy feature");
}
@Then("user logins to dummy feature")
public void user_logins_to_dummy_feature() 
{
	System.out.print("User logins to Dummy feature");
}
@Given("user navigates to {string}")
public void user_navigates_to(String string)
{
    driver.get(string);
}
@Then("user clicks frames icon")
public void user_clicks_frames_icon() throws InterruptedException 
{
    clicking_frames();
}
@Then("user performs Frames operation")
public void user_performs_frames_operation() 
{
	framesops();
}

@Then("user clicks DownloadEXcel icon and able to verify if the file is downloaded")
public void user_clicks_download_e_xcel_icon_and_able_to_verify_if_the_file_is_downloaded() throws InterruptedException

{
 
Filedownloading();

}
}
