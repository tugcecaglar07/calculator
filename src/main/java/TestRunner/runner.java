package TestRunner;
import Util.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;

    @CucumberOptions(
            features = "src/test/java/Feature",
            glue = {"StepDefinitions","Util"},
            plugin = {"summary", "pretty", "html:Reports/Calculator/Reports.html"}
    )

    public class runner extends AbstractTestNGCucumberTests {
        static WebDriver driver = DriverFactory.getDriver();
    }
