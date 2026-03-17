package boletincrud;

public class Alumno {
	private String name;
	private double grade;
	
	Alumno(String name, double grade){
		this.name = name;
		this.grade = grade;
	}
	
	Alumno(){
		this.name = "";
		this.grade = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public String toString() {
		String chain = "Nombre: " + name + " Nota: " + grade;
		return chain;
	}
	
	public boolean equals(Object objeto) {
		//The boolean that will tell if we are talking about the same student
		boolean sameStudent = false;
		
		//The cast
		Alumno otherStudent = (Alumno) objeto;
		
		if(this.name.equals(otherStudent.name)) {
			sameStudent = true;
		}
		
		return sameStudent;
	}
	
}
