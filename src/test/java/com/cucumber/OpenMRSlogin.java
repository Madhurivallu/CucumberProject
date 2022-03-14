package com.cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenMRSlogin {

	WebDriver driver= null;
	
	@Given("Open browser")
	public void open_browser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		System.out.println("Open browser");
		}

	@Given("navigate to url")
	public void navigate_to_url() {
		driver.get("https://qa-refapp.openmrs.org/openmrs/login.htm");
	   System.out.println("navigate to url");
	}

	@When("enter username,password")
	public void enter_username_password() {
		driver.findElement(By.id("username")).sendKeys("madhuani@gmail.com");
		driver.findElement(By.id("password")).sendKeys("madhuani3!#");
	  System.out.println("UserName : madhuani@gmail.com");
	  System.out.println("password : ********");
	}

	@When("click on login button")
	public void click_on_login_button() {
		
		driver.findElement(By.id("loginButton")).click();
		System.out.println("click on login button");
	   
	}

	@Then("sucessfully login into application")
	public void sucessfully_login_into_application() {
	   System.out.println("sucessfully login into application");
	}

	

	@Then("user logout from applcation.")
	public void user_logout_from_applcation() {
		driver.close();
		
	    
	}

	
}
