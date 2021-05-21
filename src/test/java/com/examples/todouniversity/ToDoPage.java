package com.examples.todouniversity;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToDoPage {

    private static final String SITE = "http://webdriveruniversity.com/Click-Buttons/index.html";
    private static final String WEBDRIVER_CHROME_NAME = "webdriver.chrome.driver";
    private static final String WEBDRIVER_CHROME_PATH = "/usr/bin/chromedriver";
    protected WebDriver driver;



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
