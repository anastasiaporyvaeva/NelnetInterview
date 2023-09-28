package com.step_defs;

import com.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In this class we will be able to create pre/post condition for all of the scenarios and even steps.
 */
public class Hooks {
    //import the @Before coming from io.cucumber.java
   //  @Before(order = 1)
    public void setupMethod() {
        System.out.println("----> @Before: running before each scenario");


    }
 //   @Before(value = "@login", order = 2)
    public void login_scenario_before() {
        System.out.println("----> @Before: running before each scenario");


    }
//will be executed automatically after every scenario of the project
     @After
    public void teardownMethod(Scenario scenario) {

        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        System.out.println("-----> After: running after each scenario");
         Driver.closeDriver();
    }

    //   @BeforeStep
    public void setupStep() {
        System.out.println("-----> @BeforeStep: Running for each step");
    }

    //@AfterStep
    public void teardownStep() {
        System.out.println("-----> @AfterStep: Running for each step");
    }
}
