package com.vytrack.step_definitions;


import com.vytrack.pages.ContactPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class navigateStepDefinitions{


    @Given("the user enters the sales manager credentials")
    public void the_user_enters_the_sales_manager_credentials() {
        System.out.println("The user logs in as a sales manager");
    }

    @When("User navigates to Fleet Vehicle module on top of menu")
    public void user_hovers_over_Fleet_module_on_top_of_menu() {
        System.out.println("User navigates to Fleet Vehicles");
    }


    @When("User navigates to Marketing Campaigns module on top of menu")
    public void userHoversOverMarketingModuleOnTopOfMenu() {
        System.out.println("User navigates to Marketing module on top of menu");
    }

    @When("User navigates to Activities Calendar Events module on top of menu")
    public void userHoversOverActivitiesModuleOnTopOfMenu() {
        System.out.println("User navigates to Activities module on top of menu");
    }

    @Then("User verifies that expected title is Vehicle")
    public void user_verifies_that_expected_title_is_Vehicle() {
        System.out.println("User Verifies Expected and Actual Titles are matching");
    }

    @Then("User verifies that expected title Campaigns")
    public void user_verifies_that_expected_title_Campaigns() {
        System.out.println("User Verifies Expected and Actual Titles are matching");
    }

    @Then("User verifies that expected title is Calendar Events")
    public void user_verifies_that_expected_title_is_Calendar_Events() {
        System.out.println("User Verifies Expected and Actual Titles are matching");
    }

    @When("User navigates to {string} {string} on top of menu")
    public void userNavigatesToOnTopOfMenu(String tab, String module) {
        new DashboardPage().navigateToModule(tab,module);
        new DashboardPage().waitUntilLoaderScreenDisappear();
    }


    @Then("the default page number should be {int}")
    public void theDefaultPageNumberShouldBe(int pageNum) {
        int actualPageNum = Integer.parseInt(new ContactPage().pageNumber.getAttribute("value"));
        Assert.assertEquals(pageNum, actualPageNum);
        System.out.println("actualPageNum = " + actualPageNum);
    }

    @Then("User verifies tht title contains {string}")
    public void userVerifiesThtTitleContains(String expectedTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }


    @Then("The user should see following options")
    public void the_user_should_see_following_options(List<String> list) {
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);


        List<String> elementsText = BrowserUtils.getElementsText(Driver.getDriver().findElements(By.xpath("//*[@class='title title-level-1']")));

        Assert.assertEquals(list, elementsText);

        System.out.println("elementsText = " + elementsText);


    }

    @When("User logs in using following credentials")
    public void userLogsInUsingFollowingCredentials(Map<String, String> details) {
        System.out.println(details);
        new LoginPage().logIn(details.get("username"), details.get("password"));
        String actualName = new DashboardPage().getUserName();
        String expectedName = details.get("firstname") + " " + details.get("lastname");
        Assert.assertEquals(expectedName,actualName);
        System.out.println("expectedName = " + expectedName);
        System.out.println("actualName = " + actualName);
    }


}
