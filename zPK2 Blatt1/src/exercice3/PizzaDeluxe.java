package exercice3;

import java.util.Scanner;

public class PizzaDeluxe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] toppings = { "Salami", "Pineapple", "Cheese", "Spinach", "Garlic" };
		double[] prices = { 1, 1.5, 1.0, 0.8, 0.5 };
		System.out.println("Welcome to PizzaDeluxe!");
		for (int i = 0; i < prices.length; i++) {
			System.out.println(toppings[i] + " costs " + prices[i]);

		}
		System.out.println("Choose your toppings (e.g. 1 3 4");
		String input = scanner.nextLine();
		String[] choices = input.split(" ");
		double total = 7.0;
		boolean hasSalami = false;
		boolean hasPineapple = false;
		boolean hasCheese = false;
		boolean hasSpinach = false;
		boolean hasGarlic = false;
		System.out.println("Your toppings :");
		for (String c : choices) {
			try {
				int index = Integer.parseInt(c) - 1;
				if (index >= 0 && index < toppings.length) {
					String topping = toppings[index];
					System.out.println("- " + topping);
					total += prices[index];
					if (topping.equals("Salami"))
						hasSalami = true;
					if (topping.equals("Pineapple"))
						hasPineapple = true;
					if (topping.equals("Chesse"))
						hasCheese = true;
					if (topping.equals("Spinach"))
						hasSpinach = true;
					if (topping.equals("Garlic"))
						hasGarlic = true;

				}
				else System.out.println("Invalid Choice: " + c);
			} catch (NumberFormatException e) {
				System.out.println("Invalid Input: " + input);
			}
			
		}
		scanner.close();
	}
}
