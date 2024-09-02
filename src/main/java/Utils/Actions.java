package Utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class Actions {
    WebDriver driver;

    public Actions(WebDriver driver) {
        this.driver = driver;
    }

    public void NewTab() {
        String FirstHandle = driver.getWindowHandle();
        Set<String> handles = driver.getWindowHandles();
        for (String actual : handles) {
            if (!actual.equalsIgnoreCase(FirstHandle)) {
                driver.switchTo().window(actual);
            }
        }
//public void

    }



}