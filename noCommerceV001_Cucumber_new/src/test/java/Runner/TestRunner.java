package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = ".//Features/Customers.feature",
		glue= {"Step_Definitions"},
		dryRun=false,
		monochrome = true,
		plugin = {"pretty","html:target/HTMLReports/reports.html"}
		//tags=""
		
		)

public class TestRunner {

}
