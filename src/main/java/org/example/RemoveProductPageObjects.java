package org.example;

import Utils.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveProductPageObjects {

    public WebDriver driver;
    public RemoveProductPageObjects(WebDriver driver) {
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
@FindBy(xpath = "(//input[@value='Delete'])[1]")
private WebElement delete;

@FindBy(xpath="//h2[contains(text(),'Your Amazon Cart is empty.')]")
private WebElement CartEmptyTitle;

@FindBy(xpath="//a[@id='nav-logo-sprites']")
private WebElement GoBackToHomePage;
@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
public WebElement SignInTab;

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
    public String removeItem(){
        delete.click();
       String Title= CartEmptyTitle.getText();
       return Title;
    }
    public void  homePageSignIn() {
        GoBackToHomePage.click();
    }
//    public void signIn(){
//        // Perform the hover action
//        Actions actions = new Actions(driver);
//        actions.moveToElement(SignInTab).perform();
//    }


}

