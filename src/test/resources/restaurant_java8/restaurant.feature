Feature: Order computation
	To allow a customer to order some dishes.

	Scenario: Order some dishes an compute the bill amount
		Given the menu contains the following dishes
			| name        | price |
			| gyoza       | 8.0   |
			| okonomiyaki | 17.0  |
			| yakisoba    | 11.50 |
			| kimchi      | 4.0   |
			| sukiyaki    | 10.25 |
		When the customer orders 2 gyoza
		And  the customer orders 3 kimchi
		And  the customer orders 1 okonomiyaki 
		And  the customer orders 2 sukiyaki
		Then the order amount should be 65.50