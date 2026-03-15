package boletin03;

import funcionsuma.Ejercicio01;
import funcionmedia.Ejercicio02;
import funcionsumaenteros.Ejercicio03;
import funcionparsetoboolean.Ejercicio04;
import funcionnumerosaleatorios.Ejercicio05;
import funcionmatematica.Ejercicio06;

public class boletin3Main {

	public static void main(String[] args) {
		// THE SUM FUNCTION ------------------------------
		System.out.println("Esta función da un número entero como resultado de una suma: " + Ejercicio01.suma(3, 7));
		
		System.out.println("Esta función da un número con decimales como resultado de una suma: " + Ejercicio01.suma(4.5, 2.4));
		
		System.out.println();
		
		//THE AVERAGE FUNCTIONS --------------------------
		System.out.println("Esta función da como resultado la media de dos números: " + Ejercicio02.media(4, 7));
		
		System.out.println("Esta función da como resultado la media de tres números: " + Ejercicio02.media(4, 7, 11));
		
		System.out.println();
		
		//THE INT SUM FUNCTIONS ---------------------------
		System.out.println("Esta función da como resultado la suma de todos los números desde el 1 hasta el número introducido: " + Ejercicio03.sumaEnteros(10));
		
		System.out.println("Esta función da como resultado la suma de todos los números desde el primer número introducido hasta el segundo número introducido: " + Ejercicio03.sumaEnteros(10, 20));
		
		System.out.println();
		
		//THE PARSE TO BOOLEAN FUNCTIONS --------------------------
		System.out.println("Esta función devuelve 'true' si el número introducido es 0 y 'false' si, en cambio, es 1: " + Ejercicio04.parseToBoolean(3));

		System.out.println("Esta función devuelve 'true' si la cadena introducida es 'true' y 'false' si, en cambio, es 'false': " + Ejercicio04.parseToBoolean("false"));
		
		System.out.println();
		
		//THE RANDOM NUMBERS FUNCTIONS
		System.out.print("Esta función genera números aleatorios entre 0 y 1: ");
		Ejercicio05.numerosAleatorios(5);
		System.out.println();
		
		System.out.print("Esta función genera números aleatorios entre 0 y el valor máximo introducido: ");
		Ejercicio05.numerosAleatorios1(6, 20);
		System.out.println();
		
		System.out.print("Esta función genera números aleatorios entre el valor mínimo introducido y el valor máximo introducido: ");
		Ejercicio05.numerosALeatorios2(7, 10, 50);
		System.out.println();
		
		//THE MATHEMATICS FUNCTIONS
		System.out.println("Esta función devuelve la suma de todos los números desde el 0 hasta el número introducido: " + Ejercicio06.sumatorio(10));
		
		System.out.println("Esta función devuelve el resultado de elevar el primero número al segundo numero: " + Ejercicio06.potencia(3, 2));
		
		System.out.println("Esta función devuelve el número de la serie Fibonacci que se encuentra en la poscion introducida: " + Ejercicio06.serieFibonacci(6));
	}

}
