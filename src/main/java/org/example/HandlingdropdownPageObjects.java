package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HandlingdropdownPageObjects {
    public WebDriver driver;

    public HandlingdropdownPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

//    @FindBy(xpath = "//div[@class='nav-search-scope nav-sprite']")
//    private WebElement AlltabDropdownTab;

//@FindBy(xpath = "//option[contains(text(),'Music')]")
//private WebElement MusicCategory;

@FindBy(xpath = "//select[@id='searchDropdownBox']")
private WebElement SearchDropdownTab;



public void dropdownFlow(){

Select newCategory =new Select(SearchDropdownTab);
newCategory.selectByVisibleText("Music");
}
}