package restaurant;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/restaurant.feature"}
)
public class RestaurantTest {

}
