package boletin2;

import java.util.Scanner;

import boletin2.CuentaCorriente.Nationality;

public class MainCuentaCorriente {

	public static void main(String[] args) {
		//Create Scanner
		Scanner sc = new Scanner(System.in);
		
		//Both bank accounts
		CuentaCorriente account = new CuentaCorriente();
		CuentaCorriente anotherAccount = new CuentaCorriente();
		
		//The user has to introduce their data
		System.out.println("Introduzca su nombre:");
		//The user has to choose one the options from the menu
		System.out.println("1. SACAR DINERO");
		System.out.println("2. INGRESAR DINERO");
		System.out.println("3. INFORMACIÓN DE LA CUENTA");
		System.out.println("4. COMPROBAR SI DOS CUENTAS SON IGUALES");
		
	}
	

}
