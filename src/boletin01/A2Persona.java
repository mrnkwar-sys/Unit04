package boletin01;

public class A2Persona {
	private String dni;
	private String name;
	private String surname;
	private int age;
	private String adult;
	
	A2Persona (String dni, String name, String surname, int age, String adult){
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.adult = adult;
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
}
