package funcionsumaenteros;

public class Ejercicio03 {
	public static int sumaEnteros(int number) {
		//The result of summoning all the numbers from 1 to the number introduced
		int result = 0;
		
		for(int i = 0; i <= number; i++) {
			result += i;
		}
		
		return result;
	}
	
	public static int sumaEnteros(int firstNumber, int secondNumber) {
		//The result of summoning all the numbers from the firstNumber to the secondNumber
		int result = 0;
		
		for (int i = firstNumber; i <= secondNumber; i++) {
			result += i;
		}
		
		return result;
	}
}
