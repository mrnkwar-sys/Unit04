package boletin2;

import java.util.Scanner;

public class MainAlumno {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Alumno student = new Alumno();
		Alumno anotherStudent = new Alumno();
		
		//If the user wants to compare the last student introduced with another one
		String compareStudents;
		
		//The user has to introduce the name and the average grade of the student
		System.out.println("Introduzca el nombre del alumno: ");
		student.setName(sc.nextLine());
		
		System.out.println("Ahora introduzca la nota media del alumno: ");
		student.setAverageGrade(sc.nextDouble());
		
		//The message that contains the student's name and the average grade is shown in the console
		System.out.println(student.toString());
		System.out.println();
		
		//Now we ask the user if they want to compare this student with another one
		do {
			System.out.println("¿Le gustaría introducir a otro estudiante y saber si, en realidad, son el mismo?");
			System.out.println("Introduzca 'OK' si sí o 'NO' si no quiere");
			compareStudents = sc.next();
			
			if (compareStudents.equalsIgnoreCase("OK")) {
				sameStudent(student, anotherStudent);
			} else if (compareStudents.equalsIgnoreCase("NO")) {
				System.out.println("Gracias por utilizar el programa :)");
			} else {
				System.out.println("Debe introducir 'OK' o 'NO', por favor");
			}
		} while(!(compareStudents.equalsIgnoreCase("OK")) && !(compareStudents.equalsIgnoreCase("NO")));

	}
	
	public static void sameStudent(Alumno student, Alumno anotherStudent) {
		sc.nextLine();
		
		//The user has to introduce the other student's name
		System.out.println("Introduzca el nombre del otro estudiante: ");
		anotherStudent.setName(sc.nextLine());
		
		if (student.equals(anotherStudent)) {
			System.out.println("Son el mismo estudiante");
		} else {
			System.out.println("Son estudiantes distintos");
		}
	}

}
