package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @Before("@db")
    public void setUpDB(){
        System.out.println("\tconnecting to DB...........");
    }



    @After("@db")
    public void tearDownDB(){
        System.out.println("\tdisconnecting from DB.........");
    }



    @Before()
    public void setUp(){
        Driver.getDriver().manage().window().maximize();
    }



    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()){
            final byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }

        Driver.closeDriver();

    }



}
