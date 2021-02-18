package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkPage {
    WebDriver driver;
    public WorkPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id=\"search-result\"]/li[1]/div/div/div/div/div[2]/div[3]/button[4]")
    private WebElement button4;

    @FindBy(xpath = "//*[@id=\"search-result\"]/li[1]/div/div/div/div/div[2]/div[2]/button[5]")
    private WebElement button8;

    @FindBy(xpath = "//*[@id=\"search-result\"]/li[1]/div/div/div/div/div[2]/div[2]/button[6]")
    private WebElement button9;

    @FindBy(xpath = "//*[@id=\"search-result\"]/li[1]/div/div/div/div/div[2]/div[4]/button[7]")
    private WebElement plusButton;

    @FindBy(xpath = "//*[@id=\"search-result\"]/li[1]/div/div/div/div/div[2]/div[5]/button[6]")
    private WebElement equalsButton;

    public void inputNumber_44() {
        button4.click();
        button4.click();
    }

    public void inputNumber_89() {
        button8.click();
        button9.click();
    }

    public void clickPlus() {
        plusButton.click();
    }

    public void clickEquals() {
        equalsButton.click();
    }

    @FindBy(xpath = "//*[@id=\"uniq161355916490719855\"]")
    private WebElement resultField;

    public int getResult() {
        resultField.click(); 
        return Integer.parseInt(resultField.getText());
    }
}
