package boletin2;

import java.util.Scanner;

import boletin2.Libro.genre;

public class MainLibro {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//Both books
		Libro book = new Libro("Alicia en el País de las Maravillas", "Lewis Carrol", 200, 75, genre.Narrativo);
		Libro anotherBook = new Libro();
		
		//The option chosen by the user
		int option;
		
		//The menu will be shown to the user
		System.out.println("Elija una de las siguientes opciones del menu: ");
		System.out.println();
		System.out.println("1. PEDIR PRESTADO EL LIBRO");
		System.out.println("2. DEVOLVER EL LIBRO");
		System.out.println("3. INFORMACIÓN DEL LIBRO");
		System.out.println("4. COMPROBAR SI LOS DOS LIBROS SON EL MISMO");
		option = sc.nextInt();
		
		switch(option) {
		case 1 -> loanedBook(book);
		case 2 -> returnedBook(book);
		case 3 -> bookData(book);
		case 4 -> sameBook(book, anotherBook);
		}

	}
	
	public static void loanedBook(Libro book) {
		if (book.loanBook(book.getCopies(), book.getCopiesBorrowed()) == true) {
			System.out.println("Gracias por pedir prestado el libro :D");
		} else {
			System.out.println("No se ha podido prestar el libro :(");
		}
		System.out.println();
		book.toStringCopies();
		book.toStringCopiesBorrowed();
	}
	
	public static void returnedBook(Libro book) {
		if (book.returnBook(book.getCopiesBorrowed()) == true) {
			System.out.println("Gracias por devolver el libro :D");
		} else {
			System.out.println("No se ha podido devolver el libro :(");
		}
		System.out.println();
		book.toStringCopiesBorrowed();
	}
	
	public static void bookData(Libro book) {
		System.out.println(book.toStringTitle());
		System.out.println(book.toStringAuthor());
		System.out.println(book.toStringCopies());
		System.out.println(book.toStringCopiesBorrowed());
		System.out.println(book.toStringGenre());
	}
	
	public static void sameBook(Libro book, Libro anotherBook) {
		/*
		 * 1. sc.nextInt() lee el número 4, pero deja el "Enter" (el salto de línea \n) olvidado en la memoria (el búfer).
		 * 2. Cuando el programa llega a anotherBook.setTitle(sc.nextLine()...) en tu método sameBook, el nextLine() encuentra ese "Enter" que sobró del menú.
		 * 3. El programa piensa: "¡Ah, el usuario ya pulsó Enter!", así que guarda un texto vacío en el título y salta inmediatamente a la siguiente pregunta (el autor).
		 * Por eso el sc.nextLine, para que el programa consuma ese Enter fantasma
		 */
		sc.nextLine();
		
		//The user has to introduce the title and the author of the other book
		System.out.println("Introduzca el titulo del libro: ");
		anotherBook.setTitle(sc.nextLine().toLowerCase());
		
		System.out.println("Introduzca el nombre del autor del libro: ");
		anotherBook.setAuthor(sc.nextLine().toLowerCase());
		
		
		if (book.equals(anotherBook) == true) {
			System.out.println("Son el mismo libro");
		} else {
			System.out.println("Son libros distintos");
		}
	}

}
