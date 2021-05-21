package com.examples.todouniversity;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:report/todo.html", "json:report/todo-report.json"},
        features ={"src/test/java/features/ToDouniversity.feature"})
public class ToDoPageTest {

}
