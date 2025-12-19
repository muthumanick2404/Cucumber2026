package runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import reporting.Reporting;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",glue="stepDefinition",dryRun = false,monochrome = true,plugin={
		"pretty","html:target/report.html","json:target/report.json","rerun:target/rerun.txt"}
	 )
public class TestRunner {
	@AfterClass
	public static void afterClass(){
		
		Reporting.generateReport();
	}
	
}
