package boletincrud;

import java.util.Scanner;

public class MainPizza {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		CrudPizza crud = new CrudPizza();
		
		//The option chose by the user
		int option;
		
		//The size or type chose by the user
		int chosenSize;
		int chosenType;
		
		//The pizza's code
		int code;
		
		//The user has to choose an option from the menu below
		do {
			System.out.println();
			System.out.println("1. Listado de pizzas");
			System.out.println("2. Nuevo pedido");
			System.out.println("3. Pizza servida");
			System.out.println("4. Salir");
			System.out.println();
			System.out.println("Elija una de las opciones del menú: ");
			option = sc.nextInt();
			
			switch(option) {
			case 1 -> {
				if (crud.getListaPizzas().isEmpty()) {
					System.out.println("El listado de pizzas está vacío");
				} else {
					System.out.println(crud.getListaPizzas());
				}
			}
			
			case 2 -> {
				System.out.println("Elija el tamaño de la pizza:");
				System.out.println("1. Mediana \t 2. Familiar");
				chosenSize = sc.nextInt();
				
				Pizza.Size size = null;
				
				switch(chosenSize) {
				case 1 -> size = Pizza.Size.MEDIANA;
				case 2 -> size = Pizza.Size.FAMILIAR;
				}
				
				System.out.println("Elija el tipo de la pizza:");
				System.out.println("1. MARGARITA \t 2. CUATRO QUESOS \t 3. FUNGHI");
				chosenType = sc.nextInt();
				
				Pizza.Type type = null;
				
				switch(chosenType) {
				case 1 -> type = Pizza.Type.MARGARITA;
				case 2 -> type = Pizza.Type.CUATRO_QUESOS;
				case 3 -> type = Pizza.Type.FUNGHI;
				}
				
				System.out.println("Introduzca el código de la pizza:");
				code = sc.nextInt();
				
				Pizza.State state = null;
				
				crud.addOrder(new Pizza(code, size, type, state));
			}
			
			case 3 -> {
				System.out.println("Introduzca el código de la pizza");
				code = sc.nextInt();
				
				if (crud.servedPizza(code)) {
					System.out.println("La pizza ha sido servida correctamente");
				} else {
					System.out.println("La pizza no se ha podido servir");
				}
			}
			
			case 4 -> System.out.println("Gracias por utilizar el programa :D");
			
			default -> System.out.println("La opción elegida no existe en el menú");
			}
		} while (option != 4);
		
		//Close Scanner
		sc.close();

	}

}
