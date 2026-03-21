package boletincrud;

import java.util.Scanner;

public class MainDisco {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		CrudDisco crud = new CrudDisco();
		
		//The option chose by the user
		int option;
		
		//The disc's title
		String title;
		
		//The disc's code
		int code;
		
		//The disc's genre
		int chosenGenre;
		
		//The disc's author 
		String author;
		
		//The disc's duration
		int duration;
		
		//The user has to choose one of the options from the menu below
		do {
			System.out.println();
			System.out.println("COLECCIÓN DE DISCOS");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo Disco");
			System.out.println("3. Borrar Disco");
			System.out.println("4. Salir");
			System.out.println();
			System.out.println("Elija una de las opciones del menú: ");
			option = sc.nextInt();
			
			switch(option) {
			case 1 -> {
				if (crud.getListaDiscos().isEmpty()) {
					System.out.println("La lista de discos está vacía");
				} else {
					System.out.println(crud.getListaDiscos());
				}
			}
			
			case 2 -> {
				sc.nextLine();
				
				System.out.println("Introduzca el título del disco: ");
				title = sc.nextLine();
				
				System.out.println("Introduzca el autor del disco: ");
				author = sc.nextLine();
				
				System.out.println("Indique la opción que coincida con el género del disco: ");
				System.out.println("1. ROCK \t 2. POP \t 3. JAZZ \t 4. BLUES");
				chosenGenre = sc.nextInt();
				
				Disco.Genre genre = null;
				
				switch(chosenGenre) {
				case 1 -> genre = Disco.Genre.ROCK;
				case 2 -> genre = Disco.Genre.POP;
				case 3 -> genre = Disco.Genre.JAZZ;
				case 4 -> genre = Disco.Genre.BLUES;
				}
				
				System.out.println("Introduzca la duración aproximada del disco: ");
				duration = sc.nextInt();
				
				System.out.println("Introduzca el código del disco: ");
				code = sc.nextInt();
				
				crud.addDisc(new Disco(code, author, title, duration, genre));
			}
			
			case 3 ->{
				System.out.println("Introduzca el código del disco: ");
				code = sc.nextInt();
				
				if (crud.removeDisc(code)) {
					System.out.println("El disco ha sido borrado correctamente");
				} else {
					System.out.println("No se ha podido borrar el disco porque este no ha sido encontrado");
				}
			}
			
			case 4 -> System.out.println("Gracias por utilizar el programa :)");
			
			default -> System.out.println("Esa opción no existe");
			}
		} while (option != 4);
		
		//Close Scanner
		sc.close();

	}

}
