package org.example;

import Utils.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductQuantityPageObjects {
    public WebDriver driver;
    public ProductQuantityPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchbar;
    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement SearchIcon;
    @FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
    private WebElement FirstProduct;
    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    private WebElement addToCartButton;
    @FindBy(xpath = "//a[contains(text(), 'Go to Cart')]")
    private WebElement GoToCartButton;

    @FindBy(xpath = "//span[@class='a-button-text a-declarative']")
    private WebElement QuantityOption;

    @FindBy(xpath = "//a[@id='quantity_2']")
    private WebElement selectCount;

    @FindBy(xpath = "//span[@class='a-dropdown-prompt']")
    private WebElement TotalProductQuantity;

    public void setSearch()
    {
        searchbar.sendKeys("Bag");
        SearchIcon.click();
        FirstProduct.click();
    }
    public void setAddToCartButton(){
        Actions tab=new Actions(driver);
        tab.NewTab();
        addToCartButton.click();
        GoToCartButton.click();
    }
    public String setQuantity() throws InterruptedException {
        QuantityOption.click();
        selectCount.click();
Thread.sleep(5000);
        String quantity=TotalProductQuantity.getText();
        return quantity;
    }
}
