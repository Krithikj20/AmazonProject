package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigateThroughCategoriesPageObjects {
    public WebDriver driver;

    public NavigateThroughCategoriesPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[contains(text(),'Electronics')]")
    public WebElement electronicsTab;
    @FindBy(xpath="//span[contains(text(),'Home Audio')]")
    private WebElement homeAudioTab;
    @FindBy(xpath="//span[contains(text(),'Speakers')]")
    private WebElement SpeakersTab;
    @FindBy(xpath="//span[contains(text(),'Bluetooth Speakers')]")
    private WebElement BluetoothSpeakersTab;

@FindBy(xpath="(//li[@class='a-carousel-card dcl-carousel-element'])[1]")
private WebElement FirstCarouselCardTab;
@FindBy(xpath="//span[@id='productTitle']")
private WebElement productTitle;


    public void navbarElectronics(){
        electronicsTab.click();
            homeAudioTab.click();
        SpeakersTab.click();
        BluetoothSpeakersTab.click();
        FirstCarouselCardTab.click();
        System.out.println("product name is"+ productTitle.getText());
    }
}
