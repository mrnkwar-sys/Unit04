package boletincrud;

import java.util.ArrayList;

public class CrudAlumno {

	//The list that will contain the list with all the students
	private ArrayList <Alumno> listaAlumnos;
	
	CrudAlumno() {
		listaAlumnos = new ArrayList<>();
	}
	
	CrudAlumno (ArrayList <Alumno> listaAlumnos){
		this.listaAlumnos = listaAlumnos;
	}
	
	public void addStudent(Alumno student) {
		listaAlumnos.add(student);
	}
	
	public boolean removeStudent(String name) {
		//The boolean that will tell which student should be removed
		return listaAlumnos.removeIf(student -> student.getName().equalsIgnoreCase(name));
	}
	
	public boolean updateStudent(String name, double grade) {
		//The boolean that will indicate if the student is in the list and the grade can be modified
		boolean modifiedGrade = false;
		
		for (Alumno s : listaAlumnos) {
			if (s.getName().equalsIgnoreCase(name)) {
				s.setGrade(grade);
				modifiedGrade = true;
			}
		}
		
		return modifiedGrade;
	}
	
	public ArrayList <Alumno> getListaAlumnos(){
		return listaAlumnos;
	}
}
