package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		junit="--step-notifications",
		
		features ="src\\test\\resources\\Features", //path of the feature file
		glue= {"com.step_definition"},	//package name of step definition file
		tags = {"@Booking"},  //tags want to run
		//tags = {"@Round_trip ,@Invalid_FromStation,@Invalid_Infants,@Student_Fare,@FLights_Not_Found,@Armed_Forces,@Student_Fare"}
		plugin = {"pretty","html:test-output"}
		)

public class RoundTripTestRunner {

}
