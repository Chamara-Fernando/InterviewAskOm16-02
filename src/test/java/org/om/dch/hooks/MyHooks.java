package org.om.dch.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.om.dch.factory.DriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.sql.Timestamp;

import static java.lang.System.currentTimeMillis;
import static org.om.dch.factory.DriverFactory.cleanUpDriver;
import static org.om.dch.factory.DriverFactory.getDriver;

public class MyHooks {
    @Before
    public void setUp() {
        getDriver();
    }

    @AfterStep
    public void captureExceptionImage(Scenario scenario) {
        if (scenario.isFailed()) {
            Timestamp timestamp = new Timestamp(currentTimeMillis());
            String timeMilliseconds = Long.toString(timestamp.getTime());

            byte [] screenshot = ((TakesScreenshot) getDriver())
                    .getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", timeMilliseconds);
        }
    }


    @After
    public void tearDown() {
        cleanUpDriver();
    }
}

