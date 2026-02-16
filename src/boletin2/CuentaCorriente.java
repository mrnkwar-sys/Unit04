package boletin2;

class CuentaCorriente {
	private String dni;
	private String name;
	private double balance;
	private String nationality;
	
	
	CuentaCorriente (String dni, double balance){
		this.dni = dni;
		this.balance = balance;
	}
	
	CuentaCorriente (String dni, String name, double balance){
		this.dni = dni;
		this.name = name;
		this.balance = balance;
	}
	
	CuentaCorriente (String dni, String name, double balance, String nationality){
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
	
	public String getNationality() {
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
	
	public void setNationality(String nationality) {
		if (nationality.equals("Española") || nationality.equals("Extranjera")) {
			this.nationality = nationality;
		} else {
			this.nationality = "Otra";
		}
	}
	
	public void sacarDinero(double balance) {
		
	}
}
