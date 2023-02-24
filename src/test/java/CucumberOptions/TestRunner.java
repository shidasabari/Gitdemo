package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/Features",monochrome=true,
		glue="Stepdefinition" , tags="@Smoke or @Regression" )
public class TestRunner extends AbstractTestNGCucumberTests{

}
