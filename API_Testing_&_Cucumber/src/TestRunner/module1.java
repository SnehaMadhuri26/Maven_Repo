package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/features/module1"
		,glue={"stepDefinition"},
plugin = {"html:reporting/CucumberHTMLReports/Sanity"
		
}
)

public class module1 {
	

}
