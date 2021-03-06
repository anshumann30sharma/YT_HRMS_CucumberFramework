package com.HRMS.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions (
		features= "src/test/resources/features/AddDifferentSkillsInQualification.feature",//specify which feature file to run
									//in our case we do say to run all features inside features package
		glue="com/hrms/steps",//where we can find implementation code for gherkin steps?
		dryRun=true,//if set to true it will quickly scan all gherkin steps have implementation code
									//if set to true -will scan to find if we missed steps have not been implemented
		monochrome=true,
		strict=true,
	//	tags="@smoke1"
		plugin= {
				"pretty",
				"html:target/cucumber-default-report",//create basic html report in specified location
				"json:target/cucumber.json",
				"rerun:target/failed.txt"
		}
			)
	public class SingleTestRunner {

	}

