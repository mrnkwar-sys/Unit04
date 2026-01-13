package boletin01;

import java.util.Scanner;

public class A2PersonaPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		A2Persona person1 = new A2Persona();
		A2Persona person2 = new A2Persona();
		
		System.out.println("Introduzca el nombre de la primera persona: ");
		person1.name = sc.next();
		
		System.out.println("Introduzca el apellido de la primera persona: ");
		person1.surname = sc.next();
		
		System.out.println("Introduzca el dni de la primera persona: ");
		person1.dni = sc.next();
		
		System.out.println("Introduzca la edad de la primera persona: ");
		person1.age = sc.nextInt();
		
		System.out.println("Introduzca el nombre de la segunda persona: ");
		person2.name = sc.next();
		
		System.out.println("Introduzca el apellido de la segunda persona: ");
		person2.surname = sc.next();
		
		System.out.println("Introduzca el dni de la segunda persona: ");
		person2.dni = sc.next();
		
		System.out.println("Introduzca la edad de la segunda persona: ");
		person2.age = sc.nextInt();
		
		System.out.println(person1.name + " " + person1.surname + " con DNI " + person1.dni + " ");
	}

}
