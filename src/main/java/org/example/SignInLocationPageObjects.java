package org.example;

import Utils.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInLocationPageObjects {
    public WebDriver driver;
    public SignInLocationPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//a[@id='nav-global-location-popover-link']")
    private WebElement UpdateLocation;
@FindBy(xpath = "//input[@type='submit' and @class='a-button-input' and @aria-label='Sign in to see your addresses']")
private WebElement SignInToSeeAddress;

@FindBy(xpath = "//input[@id='ap_email_login' and @aria-label='Enter your mobile number or email']")
private WebElement emailAddress;
@FindBy(xpath="//span[@id='continue']")
private WebElement continueButton;

@FindBy(xpath="//label[contains(text(),'Password')]")
public WebElement passwordPage;

    public String SignInFlow() throws InterruptedException {


        UpdateLocation.click();
        Thread.sleep(5000);
        SignInToSeeAddress.click();
        Actions tab=new Actions(driver);
        tab.NewTab();
        Thread.sleep(5000);
        emailAddress.click();
        emailAddress.sendKeys("krithikj88@gmail.com");
        continueButton.click();
        String pageText= passwordPage.getText();
        return pageText;
    }
}
