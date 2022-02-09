package com.vytrack.pages;


import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.vytrack.utilities.ConfigurationsReader.get;

public class LoginPage{

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "prependedInput")
    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(tagName = "h2")
    public WebElement loginTitle;

    @FindBy(css = ".alert.alert-error>div")
    public WebElement errorMessage;


    public void logIn(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public void logInAsStoreManager(){
        String username = get("storeManager_Username");
        String password = get("storeManager_Password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
    public void loginAsDriver(){
        LoginPage loginPage = new LoginPage();
        String username = get("driver_username");
        String password = get("driver_password");
        loginPage.logIn(username,password);
    }

    public void logInAsSalesManager(){
        String username = get("salesManager_Username");
        String password = get("salesManager_Password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }
}
