package ManualAutomation;
import org.junit.runner.RunWith;   
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; 

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features",glue={"ManualAutomation"}, monochrome = true,
plugin = { "pretty", "junit:target/JUnit/TestManualAutomation.xml"}
)
public class TestManualAutomaionRunner 
{


}