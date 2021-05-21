package com.examples.todouniversity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToDoPageElements {

    @FindBy()
    public WebElement element;

    public ToDoPageElements(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
