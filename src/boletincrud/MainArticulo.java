package boletincrud;

import java.util.Scanner;

public class MainArticulo {
	
	//Create a Scanner
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		CrudArticulo crud = new CrudArticulo();
		
		//The option chose by the user
		int option;
		
		//The article's name
		String articleName;
		
		//The article's price
		double articlePrice;
		
		//The stock of an article
		int stockAvailable;
		
		//The user will to have to choose an option from the menu until they choose to exit
		do {
			System.out.println();
			System.out.println("1. Listado");
			System.out.println("2. Alta");
			System.out.println("3. Baja");
			System.out.println("4. Modificar precio");
			System.out.println("5. Entrada de mercancía");
			System.out.println("6. Salida de mercancía");
			System.out.println("7. Salir");
			System.out.println();
			System.out.println("Elija una de las opciones del menú: ");
			option = sc.nextInt();
			
			switch(option) {
			case 1 -> {
				if (crud.getListaArticulos().isEmpty()) {
					System.out.println("La lista está vacía");
				} else {
					for (Articulo something : crud.getListaArticulos()) {
						System.out.println(something);
					}
				}
			}
			
			case 2 -> {
				System.out.println("Introduzca el nombre del artículo: ");
				articleName = sc.next();
				
				System.out.println("Introduzca el precio del artículo: ");
				articlePrice = sc.nextDouble();
				
				System.out.println("Introduzca la cantidad de stock disponible para dicho artículo: ");
				stockAvailable = sc.nextInt();
				
				crud.addArticle(new Articulo(articleName, articlePrice, stockAvailable));
				
				System.out.println("El artículo ha sido añadido con éxito");
			}
			
			case 3 -> {
				System.out.println("Introduzca el nombre del artículo que quiere dar de baja: ");
				articleName = sc.next();
				
				if (crud.removeArticle(articleName)) {
					System.out.println("El artículo se ha dado de baja correctamente");
				} else {
					System.out.println("No se ha encontrado el artículo que busca, por lo que es imposible darlo de baja");
				}
			}
			
			case 4 -> {
				System.out.println("Introduzca el nombre del artículo: ");
				articleName = sc.next();
				
				System.out.println("Introduzca el nuevo precio del producto: ");
				articlePrice = sc.nextDouble();
				
				if (crud.modifyPrice(articleName, articlePrice)) {
					System.out.println("Se ha cambiado el precio del artículo correctamente");
				} else {
					System.out.println("No se ha podido cambiar el precio del artículo porque dicho artículo no se ecuentra en la lista");
				}
			}
			
			case 5 -> {
				System.out.println("Introduzca el nombre del artículo: ");
				articleName = sc.next();
				
				System.out.println("Introduzca la cantidad de mercancía a añadir: ");
				stockAvailable = sc.nextInt();
				
				if (crud.addGoods(articleName, stockAvailable)) {
					System.out.println("Se ha añadido la mercancia correctamente");
				} else {
					System.out.println("No se ha podido añadir la mercancía porque el artículo no existe en la lista");
				}
			}
			
			case 6 -> {
				System.out.println("Introduzca el nombre del artículo: ");
				articleName = sc.next();
				
				System.out.println("Introduzca la cantidad de mercancía a retirar: ");
				stockAvailable = sc.nextInt();
				
				if (crud.takeGoods(articleName, stockAvailable)) {
					System.out.println("La mercancía ha salido correctamente");
				} else {
					System.out.println("No se ha podido retirar la mercancía porque el artículo no existe en la lista o porque no stock suficiente");
				}
			}
			case 7 -> System.out.println("Gracias por utilizar este programa :D");
			
			default -> System.out.println("La opción elegida no existe");
			}
		} while (option != 7);
		

	}

}
