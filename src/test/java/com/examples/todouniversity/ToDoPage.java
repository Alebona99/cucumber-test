package com.examples.todouniversity;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ToDoPage {

    private static final String SITE = "http://webdriveruniversity.com/To-Do-List/index.html";
    private static final String WEBDRIVER_CHROME_NAME = "webdriver.chrome.driver";
    private static final String WEBDRIVER_CHROME_PATH = "/usr/bin/chromedriver";
    protected WebDriver driver;


    @Given("the to-do list page is opened")
    public void TheToDoListPageIsOpened(){
        driver.get(SITE);
    }

    @When("user insert {string}")
    public void userInsert(String arg0) {
        ToDoPageElements mainPage = new ToDoPageElements(driver);
        mainPage.input.sendKeys(arg0);
    }


    @And("press enter on keyboard")
    public void pressEnterOnKeyboard() {
        ToDoPageElements mainPage = new ToDoPageElements(driver);
        mainPage.input.sendKeys(Keys.ENTER);
    }

    @Then("the user see {string} in list")
    public void theUserSeeInList(String arg0) {
        ToDoPageElements mainPage = new ToDoPageElements(driver);
        Assertions.assertTrue(mainPage.todo.isDisplayed());
    }


    @When("user choose a to-do")
    public void userChooseAToDo() {
        ToDoPageElements mainPage = new ToDoPageElements(driver);
        Actions action = new Actions(driver);
        Assertions.assertTrue(mainPage.firstTodo.getText().contentEquals("Go to potion class"));
        action.moveToElement(mainPage.firstTodo).build().perform();
    }

    @And("click on trash button")
    public void clickOnTrashButton() throws InterruptedException {
        ToDoPageElements mainPage = new ToDoPageElements(driver);
        WebElement result = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(mainPage.firstTrash));
        result.click();
    }

    @Then("the user don't see the to-do in list")
    public void theUserDonTSeeTheToDoInList() throws InterruptedException {
        ToDoPageElements mainPage = new ToDoPageElements(driver);
        Thread.sleep(500);
        Assertions.assertFalse(driver.getPageSource().contains("Go to potion class"));
        Assertions.assertFalse(mainPage.firstTodo.getText().contains("Go to potion class"));
    }


    @And("click on to-do")
    public void clickOnToDo() {
        ToDoPageElements mainPage = new ToDoPageElements(driver);
        mainPage.firstTodo.click();
    }

    @Then("the user see the to-do completed")
    public void theUserSeeTheToDoCancelled() {
        ToDoPageElements mainPage = new ToDoPageElements(driver);
        mainPage.firstTodo.getAttribute("class").contains("completed");
    }

    @Before
    public void beforeScenario() {
        System.setProperty(WEBDRIVER_CHROME_NAME, WEBDRIVER_CHROME_PATH);

        final ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.setCapability("setJavascriptEnabled", "true");

        driver = new ChromeDriver(chromeOptions);
    }

    @After
    public void afterScenario() {
        driver.quit();
    }


}
