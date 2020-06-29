package com.training.step;

import org.openqa.selenium.WebDriver;

import com.training.factory.DriverFactory;
import com.training.factory.DriverNames;
import com.training.pom.RegisterPOM;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class RegisterStep {

	private RegisterPOM registerPOM;
	private WebDriver driver; 
	
	public RegisterStep() {
		this.driver = DriverFactory.getDriver(DriverNames.CHROME); 
		registerPOM = new RegisterPOM(driver); 
	}
	
	@Given("^the web application is loaded$")
	public void the_web_application_is_loaded() throws Throwable {
		driver.get("http://naveenks.com/selenium/RegForm.html");
	}

	@Given("^user enters the \"([^\"]*)\"$")
	public void user_enters_the(String email) throws Throwable {
		registerPOM.sendEmail(email);
	}

	@Given("^enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String password, String confirmPassword) throws Throwable {
		registerPOM.sendPassword(password);
		registerPOM.sendConfirmPassword(confirmPassword);
	}

	@Given("^\"([^\"]*)\" is entered$")
	public void is_entered(String firstName) throws Throwable {
		registerPOM.sendFirstName(firstName);
	}

	@Given("^\"([^\"]*)\" is entered as as integer$")
	public void is_entered_as_as_integer(String phoneNumber) throws Throwable {
		registerPOM.sendPhoneNumber(phoneNumber);
	}

	@Given("^\"([^\"]*)\" is selected$")
	public void is_selected(String dateOfBirth) throws Throwable {
		registerPOM.selectDateOfBirth(Integer.valueOf(dateOfBirth));
	}

}
