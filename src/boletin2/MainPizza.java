package boletin2;

import boletin2.Pizza.size;
import boletin2.Pizza.type;

public class MainPizza {

	public static void main(String[] args) {
		Pizza pizza = new Pizza(234567, size.Familiar, type.CuatroQuesos);
		Pizza anotherPizza = new Pizza(234567, size.Mediana, type.Margarita);

		System.out.println(pizza.toString());
		
		if (pizza.equals(anotherPizza)) {
			System.out.println("Son la misma pizza");
		}
	}

}
