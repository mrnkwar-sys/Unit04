package boletincrud;

import java.util.Scanner;

public class MainAlumno {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		CrudAlumno crud = new CrudAlumno();

		// The option chose by the user
		int option;

		// The name introduced by the user
		String name;

		// The grade introduced by the user
		double grade;

		// The student whose grade has to be modified
		String modifiedName;

		// The new grade
		double newGrade;

		// The student's name that is going to be removed from the list
		String removedStudent;

		do {
			// The user has to choose one of the next options
			System.out.println();
			System.out.println("ALUMNOS/AS");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo Alumno");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			
			System.out.println("Elija una opción del menú: ");
			option = sc.nextInt();

			switch (option) {
			case 1 -> {
				if (crud.getListaAlumnos().isEmpty()) {
					System.out.println("La lista esta vacía");
				} else {
					for (Alumno s : crud.getListaAlumnos()) {
						System.out.println(s);
					}
				}
			}
			case 2 -> {
				System.out.println("Introduzca el nombre del alumno: ");
				name = sc.next();

				System.out.println("Introduzca la nota del alumno: ");
				grade = sc.nextDouble();

				crud.addStudent(new Alumno(name, grade));

				System.out.println("Se ha añadido el alumno a la lista correctamente");
			}
			case 3 -> {
				System.out.println("Introduzca el nombre del estudiante que quiere modificar:");
				modifiedName = sc.next();

				System.out.println("Introduzca la nueva nota del alumno: ");
				newGrade = sc.nextDouble();

				if (crud.updateStudent(modifiedName, newGrade)) {
					System.out.println("La nota ha sido modificada con éxito");
				} else {
					System.out.println("No se ha podido encontrar al alumno en la lista");
				}
			}
			case 4 -> {
				System.out.println("introduzca el nombre del alumno que quiere eliminar de la lista:");
				removedStudent = sc.next();

				if (crud.removeStudent(removedStudent)) {
					System.out.println("Se ha eliminado al alumno con éxito de la lista");
				} else {
					System.out.println("No se ha podido eliminar al alumno de la lista");
				}
			}
			case 5 -> {
				System.out.println("Gracias por utilizar el programa :)");
			}
			default -> System.out.println("La opción introducida no es válida");
			}
		} while (option != 5);

	}

}
