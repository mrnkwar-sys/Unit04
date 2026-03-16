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
	
	public void removeStudent(Alumno student) {
		listaAlumnos.add(student);
	}
	
	public void updateStudent(Alumno student) {
	}
}
