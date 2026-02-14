package boletin2;

class CuentaCorriente {
	private int dni;
	private String name;
	private double balance;
	private String nationality;
	
	CuentaCorriente (int dni, double balance){
		this.dni = dni;
		this.balance = balance;
	}
	
	CuentaCorriente (int dni, String name, double balance){
		this.dni = dni;
		this.name = name;
		this.balance = balance;
	}
	
	CuentaCorriente (int dni, String name, double balance, String nationality){
		this.dni = dni;
		this.name = name;
		this.balance = balance;
		this.nationality = nationality;
	}
	
	public void setBalance (double balance) {
		if (balance > 0) {
			
		}
	}
}
