package com.avenue.feature;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com.avenue.steps",
        features = "classpath:feature_files/",
        format = "json:target/cucumber.json",
        tags = {"~@ignore"},
        strict = true)
public class ProductTest {

}

