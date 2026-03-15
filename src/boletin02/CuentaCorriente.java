package boletin02;

class CuentaCorriente {
	private String dni;
	private String name;
	private double balance;
	enum Nationality{
		español, extranjero
	}
	
	Nationality nationality;
	
	CuentaCorriente(){
		this.dni = "";
		this.name = "";
		this.balance = 0;
		this.nationality = Nationality.español;
	}
	
	CuentaCorriente (String dni, double balance){
		this.dni = dni;
		this.balance = balance;
	}
	
	CuentaCorriente (String dni, String name, double balance){
		this.dni = dni;
		this.name = name;
		this.balance = balance;
	}
	
	CuentaCorriente (String dni, String name, double balance, Nationality nationality){
		this.dni = dni;
		this.name = name;
		this.balance = balance;
		this.nationality = nationality;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public Nationality getNationality() {
		return nationality;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean withdrawMoney(double balance, double quantityIntroduced) {
		//The boolean that will tell if it is possible to withdraw money from the bank
		boolean withdrawMoney;
		
		//If there is enough money inside the account to withdraw some, the boolean will be true and the balance will be reduced
		if (balance >= quantityIntroduced) {
			this.balance -= quantityIntroduced;
			withdrawMoney = true;
		} else {
			withdrawMoney = false;
		}
		
		return withdrawMoney;
	}
	
	public boolean depositMoney(double balance, double quantityIntroduced) {
		//The boolean that will tell if it is possible to deposit the quantityIntroduced in the bank 
		boolean depositMoney;
		
		if (quantityIntroduced > 0) {
			this.balance += quantityIntroduced;
			depositMoney = true;
		} else {
			depositMoney = false;
		}
		
		return depositMoney;
	}
	
	public String toStringDni() {
		String chain = "DNI: " + dni;
		return chain;
	}
	
	public String toStringName() {
		String chain = "Nombre del usuario: " + name;
		return chain;
	}
	
	public String toStringBalance() {
		String chain = "Dinero disponible en la cuenta: " + balance;
		return chain;
	}
	
	public String toStringNationality() {
		String chain = "Nacionalidad del usuario: " + nationality;
		return chain;
	}
	
	public boolean equals(Object objeto) {
		//The boolean that will indicate if the banks accounts are different or not
		boolean sameBank = false;
		
		//The cast
		CuentaCorriente otraCuenta = (CuentaCorriente) objeto;
		
		if (this.name.equals(otraCuenta.name) && this.dni.equals(otraCuenta.dni)) {
			sameBank = true;
		}
		
		return sameBank;
	}
}
