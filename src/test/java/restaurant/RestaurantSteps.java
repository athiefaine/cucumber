package restaurant;

import java.util.List;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RestaurantSteps {
	
	OrderHelper orderHelper;
	
	@Given("the menu contains the following dishes$")
	public void the_menu_contains_the_following_dishes(final List<Dish> dishes) {
		orderHelper = new OrderHelper(dishes);
	}
	
	@When("the customer orders (\\d+) (.+)$")
	public void the_customer_order(final Integer quantity, final String dishName) {
		orderHelper.orderDish(dishName, quantity);
	}
	
	@Then("the order amount should be (\\d+\\.\\d+)$")
	public void the_order_amount_should_be(final Float amount) {
		Assert.assertEquals(amount, orderHelper.getAmount());
	}

}
