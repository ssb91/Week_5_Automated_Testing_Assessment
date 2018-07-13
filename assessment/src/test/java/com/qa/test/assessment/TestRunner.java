package com.qa.test.assessment;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
//import cucumber.api.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:")
public class TestRunner {

}