package funcionmatematica;

public class Ejercicio06 {

	public static int sumatorio(int number) {
		//The result of summoning all the numbers from 1 to the number introduced
		int result = 0;
		
		for (int i = 0; i <= number; i++) {
			result += i;
		}
		
		return result;
	}
	
	public static double potencia(double a, int n) {
		//The result of calculating 'a' to the power of 'n'
		double result = 0;
		
		for (int i = 0; i < n-1; i++) {
			a *= a;
			result = a;
		}
		
		return result;
	}
	
	public static int serieFibonacci(int number) {
		//The number before
		int beforeNumber = 0;
		
		//The current number
		int fibonacciNumber = 1;
		
		//The next number
		int nextNumber;
		
		for (int i = 2; i <= number; i++) {
			nextNumber = beforeNumber + fibonacciNumber;
			beforeNumber = fibonacciNumber;
			fibonacciNumber = nextNumber;
		}
		
		return fibonacciNumber;
	}
}
