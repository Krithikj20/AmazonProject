package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoveringPageObjects {
    public WebDriver driver;

    public HoveringPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

        @FindBy(xpath = "//a[@id='nav-link-amazonprime']")
        private WebElement PrimeHoverElement;

        public void hoveringFlow () {
            Actions actions = new Actions(driver);
            actions.moveToElement(PrimeHoverElement).perform();

        }

    }

