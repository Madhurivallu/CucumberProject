package com.cucumber;

import java.io.File;
import java.lang.module.Configuration;
import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/test.feature" ,glue = {"com.cucumber"} ,
monochrome = true,
plugin = {"pretty" ,"html:target/cucumber-html-report",
		"json:target/cucumber-reports/cucumber.json"}
		
		
)


public class TestRunner extends 
AbstractTestNGCucumberTests	{
}
