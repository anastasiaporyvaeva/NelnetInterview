package com.step_defs;

import com.pages.NelnetSearch;
import com.utilities.BrowserUtils;
import com.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class JobSearch {
    NelnetSearch nelnetSearchPage = new NelnetSearch();

    @Then("scroll down to the bottom of the page")
    public void scroll_down_to_the_bottom_of_the_page() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(nelnetSearchPage.careerLink).perform();
    }

    @Then("click on {string} link")
    public void click_on_link(String careerLink) {
        String mainHandle = Driver.getDriver().getWindowHandle();
        nelnetSearchPage.careerLink.click();

    }

    @Then("click on Search Jobs button")
    public void click_on_search_jobs_button() {
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        for (String eachHandle : allWindowHandles) {
            Driver.getDriver().switchTo().window(eachHandle);
        }

        nelnetSearchPage.jobSearchBtn.click();
       Set<String> allwindows = Driver.getDriver().getWindowHandles();
       for(String eachWindow : allwindows){
           Driver.getDriver().switchTo().window(eachWindow);
       }
      Driver.getDriver().getWindowHandle();

    }

    @Then("navigate to search for jobs on the new page and type {string}")
    public void navigate_to_search_for_jobs_on_the_new_page_and_type(String role) {
        nelnetSearchPage.jobSearchBox.click();
        nelnetSearchPage.jobSearchBox.sendKeys(role + Keys.ENTER);
    }

    @Then("verify jobID is displayed")
    public void verify_job_id_is_displayed() {
        BrowserUtils.verifyElementDisplayed(nelnetSearchPage.jobID);

    }

}
