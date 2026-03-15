package funcionparsetoboolean;

public class Ejercicio04 {

	public static boolean parseToBoolean(int number) {
		//The boolean that will tell if the number introduced is 0 or 1
		boolean binaryNumber = true;
		
		if (number == 0) {
			binaryNumber = false;
		}
		
		return binaryNumber;
	}
	
	public static boolean parseToBoolean(String trust) {
		//The boolean that will tell if the String introduced equals "false" or "true"
		boolean isTrueOrFalse = false;
		
		if (trust.equalsIgnoreCase("true")) {
			isTrueOrFalse = true;
		}
		
		return isTrueOrFalse;
	}
}
