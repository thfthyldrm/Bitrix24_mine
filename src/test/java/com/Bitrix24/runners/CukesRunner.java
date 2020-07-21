package com.Bitrix24.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "features/login.feature",
        glue="com/Bitrix24/step_definitions",
        dryRun = false,
        plugin = "html:target/Bitrix24-cucumber-report.html"
)


public class CukesRunner
{

}
