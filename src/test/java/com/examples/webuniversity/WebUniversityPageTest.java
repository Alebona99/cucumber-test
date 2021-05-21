package com.examples.webuniversity;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:report/webdriverunivesity.html", "json:report/webdriveruniversity-report.json"},
        features ={"src/test/java/features/WebUniversitybutton.feature"})
public class WebUniversityPageTest {
}
