package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SliderPageObjects {
    public WebDriver driver;

    public SliderPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchbar;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement SearchIcon;
    @FindBy(xpath = "(//a[@class='a-link-normal s-no-outline'])[1]")
    private WebElement FirstProduct;
    @FindBy(xpath = "//input[@id='p_36/range-slider_slider-item_upper-bound-slider']")
    private WebElement SliderElement;

    @FindBy(xpath = "//div[@class='a-section sf-submit-range-button']")
    private WebElement GoButton;

    public void sliderFlow() {
        searchbar.sendKeys("iphone 15");
        SearchIcon.click();
        Actions action = new Actions(driver);
        action.clickAndHold(SliderElement).moveByOffset(-1000, 0).release().perform();

      //  ActionChains(driver).drag_and_drop_by_offset(SliderElement, 40, 0).perform();

      //  JavascriptExecutor js = (JavascriptExecutor) driver;

        // Set the value of the slider (you can change the value)
      //  js.executeScript("arguments[0].setAttribute('value', '20000');", SliderElement);
//GoButton.click();
    }

}