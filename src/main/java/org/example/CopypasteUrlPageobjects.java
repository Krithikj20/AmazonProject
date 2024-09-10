package org.example;

import Utils.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CopypasteUrlPageobjects {

    public WebDriver driver;

    public CopypasteUrlPageobjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchbar;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement SearchIcon;
    @FindBy(xpath = "(//a[@class='a-link-normal s-no-outline'])[1]")
    private WebElement FirstProduct;

    public void test() {
        searchbar.sendKeys("iphone 15");
        SearchIcon.click();
        String currentURL =  driver.getCurrentUrl();
        ((JavascriptExecutor) driver).executeScript("window.open();");
        Actions tab = new Actions(driver);
        tab.NewTab();
        driver.get(currentURL);
    }
}