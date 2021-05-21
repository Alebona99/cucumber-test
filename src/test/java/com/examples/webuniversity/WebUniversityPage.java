package com.examples.webuniversity;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class WebUniversityPage {

    private static final String SITE = "http://webdriveruniversity.com/Click-Buttons/index.html";
    private static final String WEBDRIVER_CHROME_NAME = "webdriver.chrome.driver";
    private static final String WEBDRIVER_CHROME_PATH = "/usr/bin/chromedriver";
    protected WebDriver driver;

    @Given("Open click button page")
    public void openClickButtonPage() {
        driver.get(SITE);
    }

    @When("Click on first button")
    public void clickOnFirstButton() {
        WebUniversityPageElements mainPage =  new WebUniversityPageElements(driver);
        mainPage.firstButton.click();
    }

    @And("I should see a modal")
    public void iShouldSeeAModal() {
        WebUniversityPageElements mainPage = new WebUniversityPageElements(driver);
        Assertions.assertTrue(driver.getPageSource().contains("Close"));
    }

    @Then("Close the first modal")
    public void closeTheFirstModal() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebUniversityPageElements mainPage = new WebUniversityPageElements(driver);
        mainPage.firstCloseButton.click();
    }

    @When("Click on second button")
    public void clickOnSecondButton() {
        WebUniversityPageElements mainPage = new WebUniversityPageElements(driver);
        mainPage.secondButton.click();
    }


    @When("Click on third button")
    public void clickOnThirdButton() {
        WebUniversityPageElements mainPage = new WebUniversityPageElements(driver);
        mainPage.thirdButton.click();
    }

    @Then("Close the second modal")
    public void closeTheSecondModal() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebUniversityPageElements mainPage = new WebUniversityPageElements(driver);
        mainPage.secondCloseButton.click();
    }

    @Then("Close the third modal")
    public void closeTheThirdModal() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebUniversityPageElements mainPage = new WebUniversityPageElements(driver);
        mainPage.thirdCloseButton.click();
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

