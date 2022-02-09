package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationsReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions{


    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
       String url = ConfigurationsReader.get("url");
        //WebDriver driver = Driver.getDriver();
        Driver.getDriver().get(url);

    }

    @When("User enters the driver information")
    public void user_enters_the_driver_information() {
       String username = ConfigurationsReader.get("driver_username");
       String password = ConfigurationsReader.get("driver_password");
       new LoginPage().logIn(username,password);
    }

    @Then("The user should be logged in")
    public void the_user_should_be_logged_in() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Dashboard", actualTitle);
    }


    @When("User enters the sales manager information")
    public void user_enters_the_sales_manager_information() {
        String username = ConfigurationsReader.get("salesManager_Username");
        String password = ConfigurationsReader.get("salesManager_Password");
        new LoginPage().logIn(username,password);
    }

    @When("User enters the store manager information")
    public void userEntersTheStoreManagerInformation() {
        String username = ConfigurationsReader.get("storeManager_Username");
        String password = ConfigurationsReader.get("storeManager_Password");
        new LoginPage().logIn(username,password);
    }

    @When("the user logs in with {string} and {string}")
    public void theUserLogsInWithAnd(String username, String password) {
        new LoginPage().logIn(username,password);
    }

    @And("The title should contain {string}")
    public void theTitleShouldContain(String expectedTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }
}
