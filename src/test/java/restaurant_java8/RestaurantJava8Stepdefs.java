package restaurant_java8;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java8.En;
import restaurant.Dish;
import restaurant.OrderHelper;

public class RestaurantJava8Stepdefs implements En {
	
	OrderHelper orderHelper;
	
	public RestaurantJava8Stepdefs() {
		Given("the menu contains the following dishes", (final DataTable dishes) -> {
			orderHelper = new OrderHelper(dishes.asList(Dish.class));
		});
		Given("the customer ordered (\\d+) (.+)", (final Integer quantity, final String dishName) -> {
			orderHelper.orderDish(dishName, quantity);
		});
		When("the waiter computes the bill", () -> {
			orderHelper.computeBill();
		});
		Then("the bill amount should be (\\d+\\.\\d+)", (final Double amount) -> {
			Assert.assertEquals(amount, orderHelper.getAmount());
		});
	}
	
}
