package org.stepdefenition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", 
glue = "org.stepdefenition", 
monochrome = true, 
dryRun = true, 
strict = true,  
snippets = SnippetType.UNDERSCORE,
plugin = {"html:ReportFolder" , "junit:ReportFolder\\reportfolder.xml" , "json:ReportFolder\\jsonreportfolder.json"}  )
public class TestRunnerClass {

}
