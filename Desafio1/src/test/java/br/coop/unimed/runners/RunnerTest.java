package br.coop.unimed.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/", 
		glue = "br.coop.unimed.steps", 
		tags = {}, 
		plugin = {"pretty", "html:target/report-html"},
		monochrome = true, 
		snippets = SnippetType.CAMELCASE,
		dryRun = false, 
		strict = true)

public class RunnerTest {
	

}