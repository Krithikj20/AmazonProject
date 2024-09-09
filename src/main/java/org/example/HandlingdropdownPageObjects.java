package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingdropdownPageObjects {
    public WebDriver driver;

    public HandlingdropdownPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

//@FindBy(xpath = "//div[@class='nav-search-scope nav-sprite']")
//private WebElement AlltabDropdownTab;

//@FindBy(xpath = "//option[contains(text(),'Music')]")
//private WebElement MusicCategory;

@FindBy(xpath = "//select[@id='searchDropdownBox']")
private WebElement SearchDropdownTab;



public void dropdownFlow(){

    //select 1 category from the dropdown
    Select dropdownCategory =new Select(SearchDropdownTab);
    dropdownCategory.selectByVisibleText("Music");

    //list all the options from the dropdown
    List<WebElement>options=dropdownCategory.getOptions();
    System.out.println("No. of categories in a dropdown : " + options.size());

    //printing all the options
for(int i=0; i<options.size(); i++){
    System.out.println(options.get(i).getText());
}
}
}