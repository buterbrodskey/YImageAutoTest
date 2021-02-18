package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeginPage {

    WebDriver driver;

    public BeginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"text\"]")
    private WebElement searchString;

    public void inputSearchQuery(String s) {
        searchString.sendKeys(s);
        searchString.submit();
    }
}
