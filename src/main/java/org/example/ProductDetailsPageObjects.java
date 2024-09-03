package org.example;

import Utils.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPageObjects {
    public WebDriver driver;
    public ProductDetailsPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchbar;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement SearchIcon;
    @FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
    private WebElement FirstProduct;
    @FindBy(xpath = "//span[@id='productTitle' and @class='a-size-large product-title-word-break']")
    private WebElement Title;

    @FindBy(xpath = "//div[@class='a-section a-spacing-none aok-align-center aok-relative']")
    private WebElement Cost;
    public void setSearch()
    {
        searchbar.sendKeys("iphone 15");
        SearchIcon.click();
        FirstProduct.click();


    }
    public void verifyDetails() {
        Actions tab = new Actions(driver);
        tab.NewTab();
       System.out.println( "Product Name is: " + Title.getText());
        System.out.println( "Product Cost is: " + Cost.getText());


         }
}
