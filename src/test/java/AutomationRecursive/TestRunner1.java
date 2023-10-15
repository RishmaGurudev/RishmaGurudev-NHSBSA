package AutomationRecursive;
import org.junit.runner.RunWith;   
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;  

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features1",glue={"AutomationRecursive"}, monochrome = true,
plugin = { "pretty", "junit:target/JUnit/report.xml"}
)
public class TestRunner1 {

}
