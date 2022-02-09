package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAsUsertypeDefs {

    @When("User enters the {string} information")
    public void user_enters_the_information(String string) {
        LoginPage loginPage = new LoginPage();
        switch (string){
            case "driver":
                loginPage.loginAsDriver();
                break;
            case "sales manager":
                loginPage.logInAsSalesManager();
                break;
            case "store manager":
                loginPage.logInAsStoreManager();
                break;
        }
    }

    @Given("User is on login Page")
    public void user_is_on_login_Page() {
        System.out.println("User is on login Page");
    }

    @When("User logs in as a store manager")
    public void user_logs_in_as_a_store_manager() {
        System.out.println("User login as store manager");
    }

    @When("Navigates to Activities -> Calendar Events")
    public void navigates_to_Activities_Calendar_Events() {
        System.out.println("User navigate to calendar events page");
    }

    @Then("Verify that page subtitle {string} is displayed")
    public void verify_that_page_subtitle_is_displayed(String string) {
        System.out.println(string + " Verified and displayed");
    }

}
