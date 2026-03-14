package boletin2;

public class Alumno {
	private String name;
	private double averageGrade;
	
	Alumno(){
		this.name = "";
		this.averageGrade = 0.0;
	}
	
	Alumno(String name, double averageGrade){
		this.name = name;
		this.averageGrade = averageGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}
	
	public String toString() {
		String chain = "El alumno " + this.name + " tiene una nota media de " + this.averageGrade;
		return chain;
	}
	
	public boolean equals(Object objeto) {
		//The boolean that will indicate if both students are the same
		boolean sameStudent = false;
		
		//The cast
		Alumno anotherStudent = (Alumno) objeto;
		
		if (this.name.equals(anotherStudent.name)) {
			sameStudent = true;
		}
		
		return sameStudent;
	}
}
