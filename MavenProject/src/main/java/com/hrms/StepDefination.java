package com.hrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefination {
	public WebDriver driver;
	@Given("^Open Application$")
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application opened");
	}
	@When("^Verify Title$")
	public void verifyTitle() {
		System.out.println("Verifying the Title");
	}
	@Then("^Close Application$")
	public void closeApplication() {
		driver.quit();
		System.out.println("Login should be shown");
	}
	
	@When("^Login into application$")
	public void login(){
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
	}
	@When("^Logout from application$")
	public void logout() {
		driver.findElement(By.linkText("Logout")).click();
	}

}
