package org.example;

import Utils.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPageObjects {
    public WebDriver driver;
    public AddToCartPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchbar;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement SearchIcon;

    @FindBy(xpath="//span[@class='a-dropdown-prompt']")
    private WebElement sortDropdown;
    @FindBy(xpath="//a[@id='s-result-sort-select_3']")
    private WebElement SortOnCustomerReview;
    @FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
    private WebElement FirstProduct;
    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private WebElement addToCartButton;
    @FindBy(xpath = "//a[contains(text(), 'Go to Cart')]")
    private WebElement GoToCartButton;
    @FindBy(xpath="//input[@name='proceedToRetailCheckout']")
    private WebElement proceedToBuy;


public void setSearch()
{
    searchbar.sendKeys("Bag");
    SearchIcon.click();
}
public void sort()
{
    sortDropdown.click();
    SortOnCustomerReview.click();
    FirstProduct.click();
}
    public void setAddToCartButton(){
        Actions tab=new Actions(driver);
        tab.NewTab();
        addToCartButton.click();
        GoToCartButton.click();
        proceedToBuy.click();
    }
}
