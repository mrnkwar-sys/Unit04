package boletin2;

import java.util.Scanner;

import boletin2.CuentaCorriente.Nationality;

public class MainCuentaCorriente {
	
	 //Create Scanner
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Both bank accounts
		CuentaCorriente account = new CuentaCorriente();
		CuentaCorriente anotherAccount = new CuentaCorriente();
		
		//The nationality of the user
		String nationality;
		
		//The option chosen by the user from the menu
		int option;
		
		//The money that the user wants to withdraw
		double moneyWanted;
		
		//The money that the user wants to deposit
		double moneyDeposit;
		
		//The user has to introduce their data
		System.out.println("Introduzca su nombre:");
		account.setName(sc.nextLine());
		
		System.out.println("Introduzca su DNI: ");
		account.setDni(sc.nextLine());
		
		System.out.println("Introduzca el sueldo de la cuenta: ");
		account.setBalance(sc.nextDouble());
		
		do {
			System.out.println("¿Es usted español o extranjero?");
			nationality = sc.next().toLowerCase();
			
			if (nationality.equals("español")) {
				account.nationality = Nationality.español;
			} else if (nationality.equals("extranjero")){
				account.nationality = Nationality.extranjero;
			} else {
				System.out.println("Diga si es extranjero o español, por favor");
			}
		} while ((! nationality.equals("español")) && (!nationality.equals("extranjero")));
		
		
		//The user has to choose one the options from the menu
		System.out.println("Ahora elija una de las opciones siguientes:");
		System.out.println();
		System.out.println("1. SACAR DINERO");
		System.out.println("2. INGRESAR DINERO");
		System.out.println("3. INFORMACIÓN DE LA CUENTA");
		System.out.println("4. COMPROBAR SI DOS CUENTAS SON IGUALES");
		option = sc.nextInt();
		System.out.println();
		
		switch(option) {
		case 1 -> {
			//The user have to tell how much they want to withdraw
			System.out.println("Introduzca la cantidad de dinero que quiere sacar de su cuenta: ");
			moneyWanted = sc.nextDouble();
			
			withdrawMoney(account, moneyWanted);
		}
		case 2 -> {
			//The user tells how much they want to deposit
			System.out.println("Introduzca la cantidad de dinero que quiere depositar: ");
			moneyDeposit = sc.nextDouble();
			
			depositMoney(account, moneyDeposit);
		}
		case 3 -> showData(account);
		case 4 -> {
			//The user has to introduce the another owner's dni and name
			System.out.println("Introduzca el nombre del otro usuario");
			anotherAccount.setName(sc.next());
			
			System.out.println("Ahora introduzca el DNI del otro usuario: ");
			anotherAccount.setDni(sc.next());
			
			compareBankAccounts(account, anotherAccount);
		}
		}
		
	}
	
	public static void withdrawMoney(CuentaCorriente account, double moneyWanted) {
		//If the method returns true, the console will tell the user and show the money that is left in their bank account
		if (account.withdrawMoney(account.getBalance(), moneyWanted)) {
			System.out.println("Se ha podido sacar el dinero de su cuenta");
			System.out.println(account.toStringBalance());
		} else {
			System.out.println("No se ha podido sacar dinero de su cuenta");
		}
		
	}
	
	public static void depositMoney(CuentaCorriente account, double moneyDeposit) {
		//If the method returns true, the program will tell the user that the money was deposited and they will see the money in their bank account
		if (account.depositMoney(account.getBalance(), moneyDeposit) == true) {
			System.out.println("Se ha podido ingresar el dinero en su cuenta");
			System.out.println(account.getBalance());
		} else {
			System.out.println("No se puede ingresar dicha cantidad de dinero en su cuenta");
		}
	}
	
	public static void showData(CuentaCorriente account) {
		System.out.println(account.toStringDni());
		System.out.println(account.toStringName());
		System.out.println(account.toStringBalance());
		System.out.println(account.toStringNationality());
	}
	
	public static void compareBankAccounts(CuentaCorriente account, CuentaCorriente anotherAccount) {
		//If the method returns true, we tell the user that both accounts are equals
		if (account.equals(anotherAccount)) {
			System.out.println("Ambas cuentas son iguales");
		} else {
			System.out.println("Las cuentas comparadas son distintas");
		}
	}

}


