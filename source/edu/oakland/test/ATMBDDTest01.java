package edu.oakland.test;

import org.junit.*;
import org.junit.runner.RunWith;
import edu.oakland.production.*;
import edu.oakland.helper.*;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "source/edu/oakland/test", 
    glue = "edu.oakland.stepdefinitions"
    )

public class ATMBDDTest01{

} 
