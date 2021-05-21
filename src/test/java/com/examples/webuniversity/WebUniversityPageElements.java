package com.examples.webuniversity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebUniversityPageElements {

    @FindBy( id = "button1")
    public WebElement firstButton;

    @FindBy( id = "button2")
    public WebElement secondButton;

    @FindBy( id = "button3")
    public WebElement thirdButton;

    @FindBy( xpath = "//*[@id=\"myModalClick\"]/div/div/div[3]/button")
    public WebElement firstCloseButton;

    @FindBy( xpath = "//*[@id=\"myModalJSClick\"]/div/div/div[3]/button")
    public WebElement secondCloseButton;

    @FindBy( xpath = "//*[@id=\"myModalMoveClick\"]/div/div/div[3]/button")
    public WebElement thirdCloseButton;

    public WebUniversityPageElements(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
