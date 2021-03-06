package com.cision.accion.cucumber.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLogin {

	WebDriver driver = null;
	String baseUrl = "https://www.google.com";

	@Given("^I have open the browser$")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/windows/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}

	@When("^I open Facebook website$")
	public void goToFacebook() {
		driver.navigate().to("https://www.facebook.com/");
	}

	@Then("^Login button should exits$")
	public void loginButton() {
		if (driver.findElement(By.id("u_0_3")).isEnabled()) {
			System.out.println("Test 1 Pass");
		} else {
			System.out.println("Test 1 Fail");
		}
		driver.close();
	}
}
