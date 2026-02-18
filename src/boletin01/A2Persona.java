package boletin01;

public class A2Persona {
	private String dni;
	private String name;
	private String surname;
	private int age;
	private String adult;
	private String retired;
	private String chain;
	
	A2Persona (String dni, String name, String surname, int age, String adult){
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.adult = adult;
		this.retired = retired;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAdult() {
		return adult;
	}
	
	public String getRetired() {
		return retired;
	}
	
	public void setRetired(String retired) {
		this.retired = retired;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAdult(String adult) {
		this.adult = adult;
	}
	
	public boolean esMayorDeEdad() {
		if (age >= 18) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean esJubilado() {
		if (age >= 65) {
			return true;
		} else {
			return false;
		}
	}
	
	public int diferenciaEdad(A2Persona p) {
		int ageDifference;
		ageDifference = p.age - age;
		return ageDifference;
	}
	
	public String toString() {
		chain = name + " " + surname + " con DNI " + dni + " " + adult + " y " + retired;
		return chain;
	}
}
