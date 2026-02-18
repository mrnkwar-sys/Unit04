package boletin01;

import java.util.Scanner;

public class A2PersonaPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		A2Persona person1 = new A2Persona("", "", "", 0, "");
		A2Persona person2 = new A2Persona("", "", "", 0, "");
		
		//The person 1 has to introduce their name, surname, dni and age
		System.out.println("Introduzca el nombre de la primera persona: ");
		person1.setName(sc.next());
		
		System.out.println("Introduzca el apellido de la primera persona: ");
		person1.setSurname(sc.next());
		
		System.out.println("Introduzca el dni de la primera persona: ");
		person1.setDni(sc.next()); 
		
		System.out.println("Introduzca la edad de la primera persona: ");
		person1.setAge(sc.nextInt()); 
		
		//The person 2 has to introduce the same data as the person 1
		System.out.println("Introduzca el nombre de la segunda persona: ");
		person2.setName(sc.next());
		
		System.out.println("Introduzca el apellido de la segunda persona: ");
		person2.setSurname(sc.next());
		
		System.out.println("Introduzca el dni de la segunda persona: ");
		person2.setDni(sc.next());
		
		System.out.println("Introduzca la edad de la segunda persona: ");
		person2.setAge(sc.nextInt());
		
		//The program checks if the person is an adult or not
		/*if (person1.age >= 18 ) {
			person1.adult = "es mayor de edad";
		} else {
			person1.adult = "no es mayor de edad";
		}
		*/
		if (person1.esMayorDeEdad() == true) {
			person1.setAdult("es mayor de edad");
		} else {
			person1.setAdult("es menor de edad");
		}
		
		/*if (person2.age >= 18 ) {
			person2.adult = "es mayor de edad";
		} else {
			person2.adult = "no es mayor de edad";
		}
		*/
		
		if (person2.esMayorDeEdad() == true) {
			person2.setAdult("es mayor de edad");
		} else {
			person2.setAdult("es menor de edad");
		}
		
		//To tell if the person is retired or not
		if (person1.esJubilado() == true) {
			person1.setRetired("está jubilado");
		} else {
			person1.setRetired("no está jubilado");
		}
		
		if (person2.esJubilado() == true) {
			person2.setRetired("está jubilado");
		} else {
			person2.setRetired("no está jubilado");
		}
		
		/*System.out.println(person1.getName() + " " + person1.getSurname() + " con DNI " + person1.getDni() + " " + person1.getAdult() + " y " + person1.getRetired());
		System.out.println(person2.getName() + " " + person2.getSurname() + " con DNI " + person2.getDni() + " " + person2.getAdult() + " y " + person2.getRetired());
		*/
		
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		
		//The age difference among both people
		System.out.println("La diferencia de edad entre estas dos personas es de " + person1.diferenciaEdad(person2) + " años");
		//Close Scanner
		sc.close();
		
	}
}

