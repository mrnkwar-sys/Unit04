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
		if (person1.getAge() > 18) {
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
		
		if (person2.getAge() > 18) {
			person2.setAdult("es mayor de edad");
		} else {
			person2.setAdult("es menor de edad");
		}
		
		System.out.println(person1.getName() + " " + person1.getSurname() + " con DNI " + person1.getDni() + " " + person1.getAdult());
		System.out.println(person2.getName() + " " + person2.getSurname() + " con DNI " + person2.getDni() + " " + person2.getAdult());
		
		//Close Scanner
		sc.close();
	}

}
