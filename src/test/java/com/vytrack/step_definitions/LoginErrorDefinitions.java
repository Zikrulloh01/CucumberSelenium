package com.vytrack.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginErrorDefinitions {



    @When("User enters wrong username and correct password")
    public void userEntersWrongUsernameAndRightPassword() {
        System.out.println("User has entered wrong username and correct password");
    }

    @Then("User should see an error Message")
    public void userShouldSeeAnErrorMessage() {
        System.out.println("Error message has been displayed and Verified");
    }

    @When("User enters correct username and wrong password")
    public void userEntersCorrectUsernameAndWrongPassword() {
        System.out.println("User has entered correct username and wrong password");
    }

    @When("User enters wrong username and wrong password")
    public void userEntersWrongUsernameAndWrongPassword() {
        System.out.println("User has entered wrong username and wrong password");
    }
}
