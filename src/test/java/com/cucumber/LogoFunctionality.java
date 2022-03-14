package com.cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.gl.Logo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogoFunctionality {

	WebDriver driver = null;

	@Given("open browser and navigate required url")
	public void open_browser_and_navigate_required_url() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("open browser and navigate required url");
	}

	@When("right click on right click me button")
	public void right_click_on_right_click_me_button() {
		driver.get("https://www.amazon.com");
		System.out.println("right click on right click me button");

	}

	@When("click on copy")
	public void click_on_copy() {
		driver.findElement(By.id("nav-logo-sprites")).click();
		System.out.println("click on copy");
	}


	

	@When("click on ok button")
	public void click_on_ok_button() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}

}
