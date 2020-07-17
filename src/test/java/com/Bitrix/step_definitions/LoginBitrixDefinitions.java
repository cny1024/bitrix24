package com.Bitrix.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginBitrixDefinitions {
    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
        System.out.println("User logs in on the login page");
    }

    @Then("User log in and see the dashboard")
    public void userLogInAndSeeTheDashboard() {
        System.out.println("User see the dashboard");
    }
}
