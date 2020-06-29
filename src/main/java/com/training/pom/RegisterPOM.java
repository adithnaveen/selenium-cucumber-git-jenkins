package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPOM {

	private WebDriver driver;

	public RegisterPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "inputEmail")
	private WebElement email;
	
	@FindBy(id = "inputPassword")
	private WebElement password;
	
	@FindBy(id = "confirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(id = "firstName")
	private WebElement firstName;
	
	@FindBy(id = "lastName")
	private WebElement lastName; 
	
	@FindBy(id = "phoneNumber")
	private WebElement phoneNumber;
	
	@FindBy(id = "dateOfBirth")
	private WebElement dateOfBirth; 
	
	
	public void sendEmail(String email) {
		this.email.sendKeys(email);
	}
	
	public void sendPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void sendConfirmPassword(String confirmPassword) {
		this.confirmPassword.sendKeys(confirmPassword);
	}
	public void sendFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	public void sendLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	
	public void sendPhoneNumber(String phoneNumber) {
		this.phoneNumber.sendKeys(phoneNumber);
	}
	
	public void selectDateOfBirth(Integer dateOfBirth) {
		Select sdob = new Select(this.dateOfBirth); 
		System.out.println("DOB Got is " + dateOfBirth);
		sdob.selectByIndex(dateOfBirth);
	}
	
}
