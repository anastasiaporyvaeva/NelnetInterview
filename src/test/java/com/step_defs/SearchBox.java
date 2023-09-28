package com.step_defs;

import com.pages.NelnetSearch;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SearchBox {

    NelnetSearch nelnetSearchPage = new NelnetSearch();

    @Given("user goes to the welcome page")
    public void user_goes_to_the_welcome_page() {
        Driver.getDriver().get("https://nelnet.com/welcome");



    }

    @Then("type {string} in search box")
    public void type_in_search_box(String message) {
nelnetSearchPage.searchBox.sendKeys(message + Keys.ENTER);
    }
    @Then("verify {string} is displayed")
    public void verify_is_displayed(String resultMsg) {
        String actualResult = nelnetSearchPage.searchResultMessage.getText();
        String expectedResult = "Search Results";
        Assert.assertEquals(expectedResult,actualResult);

    }


}
