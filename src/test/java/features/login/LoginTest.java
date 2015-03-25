package features.login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        format = { "pretty", "html:target/cucumber" }
//        glue = "features.login.LoginSteps",
//        features = "classpath:features/login/login.feature"
)
public class LoginTest{
	
}
