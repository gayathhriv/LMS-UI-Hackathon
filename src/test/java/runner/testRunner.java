package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)

@CucumberOptions(
plugin = {"pretty", "html:target/cucumber.html"},
monochrome=true,
tags = "@feature",
features = {"src/test/resources/feature/login/login.feature"},
glue= "stepDefinitions")
public class testRunner extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
	return super.scenarios();
	}
	
}
