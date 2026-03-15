package funcionnumerosaleatorios;

import java.util.Random;

public class Ejercicio05 {
	
	public static Random rand = new Random();

	public static void numerosAleatorios(int quantity) {
		//The random numbers generated
		double randomDouble;
		
		for (int i = 0; i <= quantity; i++) {
			randomDouble = Math.random();
			System.out.print(randomDouble + " ");
		}
	}
	
	public static void numerosAleatorios1(int quantity, int maximumValue) {
		//The random numbers generated
		int randomNumber;
		
		for (int i = 0; i <= quantity; i++) {
			randomNumber = rand.nextInt(0, maximumValue);
			System.out.print(randomNumber + " ");
		}
	}
	
	public static void numerosALeatorios2(int quantity, int minimumValue, int maximumValue) {
		//The random number generated
		int randomNumber;
		
		for (int i = 0; i <= quantity; i++) {
			randomNumber = rand.nextInt(minimumValue, maximumValue);
			System.out.print(randomNumber + " ");
		}
	}
}
