package restaurant;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OrderHelper {
	private Map<String, Dish> dishes = new HashMap<>();
	
	private Float amount = 0f;
	
	public OrderHelper(final List<Dish> dishes) {
		this.dishes = dishes.stream().collect(Collectors.toMap(Dish::getName, Function.<Dish> identity()));
	}
	
	public void orderDish(String dishName, Integer quantity) {
		Dish dish = dishes.get(dishName);
		Float price = dish.getPrice();
		amount += price * quantity;
	}
	
	public Float getAmount() {
		return amount;
	}

}
