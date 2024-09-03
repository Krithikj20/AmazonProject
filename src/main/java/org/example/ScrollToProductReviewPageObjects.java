package org.example;

import Utils.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScrollToProductReviewPageObjects {


    public WebDriver driver;

    public ScrollToProductReviewPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[contains(text(),'Customer reviews')]")
    private WebElement customerReviewsTitle;

    @FindBy(xpath = "//span[@data-hook='rating-out-of-text']")
    private WebElement reviewsCount;

    @FindBy(xpath = "//span[@data-hook='total-review-count']")
    private WebElement averageRating;

    @FindBy(xpath = "//span[@id='productTitle' and @class='a-size-large product-title-word-break']")
    private WebElement Title;

    public void customerReview() throws InterruptedException {
        Actions tab = new Actions(driver);
        tab.NewTab();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", customerReviewsTitle);
        Thread.sleep(1000);
        System.out.println( "Product Name is: " + Title.getText());
        System.out.println("Number of Reviews: " + reviewsCount.getText());
        System.out.println("Average Rating: " + averageRating.getText());

    }
}