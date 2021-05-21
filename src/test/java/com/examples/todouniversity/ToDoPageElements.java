package com.examples.todouniversity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToDoPageElements {

    @FindBy( tagName = "input")
    public WebElement input;

    @FindBy( xpath = "//*[@id=\"container\"]/ul/li[4]")
    public WebElement todo;

    @FindBy( xpath = "//*[@id=\"container\"]/ul/li[1]")
    public WebElement firstTodo;

    @FindBy( xpath = "//*[@id=\"container\"]/ul/li[1]/span/i")
    public WebElement firstTrash;

    public ToDoPageElements(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
