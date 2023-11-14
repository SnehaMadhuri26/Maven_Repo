package newTestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/newFeatures"
		,glue={"newStepDefinition"},
plugin = {"html:reporting/CucumberHTMLReports/Sanity"
		
}
)

public class SearchProductRunner {
	

}
