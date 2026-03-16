package boletincrud;

import java.util.Scanner;

public class MainAlumno {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Alumno student = new Alumno();
		
		//The option chose by the user
		int option;
		
		//The user has to choose one of the next options
		System.out.println();
		System.out.println("ALUMNOS/AS");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
		option = sc.nextInt();
		
		switch(option) {
		}

	}

}
