package com.avenue.test.feature;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com.avenue.test.steps",
        features = "classpath:feature_files/",
        format = "json:target/cucumber.json",
        tags = {"~@ignore"},
        strict = true)
public class IntegrationTest {

}