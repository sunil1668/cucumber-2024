package org.com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\rajit\\eclipse-workspace\\Cucumber_2024\\src\\test\\java\\featureFile\\LoginPage.feature",
glue ="Stepdefinition", tags ="@regression",plugin ={"pretty", "html:target/reports/cucumberreports.html"},
dryRun =false, monochrome =true, publish=true)


public class Runner 
{

}

