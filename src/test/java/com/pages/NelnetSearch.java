package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NelnetSearch {
    public NelnetSearch(){
PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//input[@placeholder='Enter Keyword']")
    public WebElement searchBox;

    @FindBy (xpath = "//h1[.='Search Results']")
    public WebElement searchResultMessage;

    @FindBy(xpath = "//a[normalize-space()='Careers']")
public WebElement careerLink;

    @FindBy(linkText = "Search Jobs")
    public WebElement jobSearchBtn;

    @FindBy(xpath ="//input[@data-automation-id='keywordSearchInput']")
    public WebElement jobSearchBox;

    @FindBy(xpath = "//li[normalize-space()='R17731']")
    public WebElement jobID;


}
