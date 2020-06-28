package com.training.step;

import cucumber.api.java.en.Given;

public class RegisterStep {

	@Given("^given email$")
	public void given_email() throws Throwable {

		System.out.println("in -> given email");

	}

	@Given("^enter password and confirm password$")
	public void enter_password_and_confirm_password() throws Throwable {
		System.out.println("in -> enter password and confirm password");
	}
}
