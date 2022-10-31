package curso.java.colecciones.ejercicio1bis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		Main main = new Main();
		main.abrirInstituto();
		main.mostrarEstudiantes();
	}
	
	private List<Estudiante> estudiantes;
	public void abrirInstituto() {
		
		Set<Asignatura> asignaturas1=new HashSet<Asignatura>();
		asignaturas1.add(new Asignatura("Matematicas"));
		asignaturas1.add(new Asignatura("Fisica"));
		asignaturas1.add(new Asignatura("Lengua"));
		Set<Asignatura> asignaturas2=new HashSet<Asignatura>();
		asignaturas2.add(new Asignatura("Dibujo Tecnico"));
		asignaturas2.add(new Asignatura("Matematicas"));
		asignaturas2.add(new Asignatura("Fisica"));
		Set<Asignatura> asignaturas3=new HashSet<Asignatura>();
		asignaturas3.add(new Asignatura("Matematicas"));
		asignaturas3.add(new Asignatura("Biologia"));
		asignaturas3.add(new Asignatura("Quimica"));
		Set<Asignatura> asignaturas4=new HashSet<Asignatura>();
		asignaturas4.add(new Asignatura("Lengua"));
		asignaturas3.add(new Asignatura("Biologia"));
		Set<Asignatura> asignaturas5=new HashSet<Asignatura>();
		asignaturas5.add(new Asignatura("Matemáticas"));
		asignaturas5.add(new Asignatura("Lengua"));
		asignaturas3.add(new Asignatura("Fisica"));

		

		Estudiante e1=new Estudiante("David", "Cano",asignaturas1);
		Estudiante e2=new Estudiante("Iñigo", "Albacete",asignaturas2);
		Estudiante e3=new Estudiante("Andrea", "Cascajero",asignaturas3);
		Estudiante e4=new Estudiante("David", "Alonso",asignaturas4);
		Estudiante e5=new Estudiante("Fernando", "Canet",asignaturas5);
		
		this.estudiantes=new ArrayList<Estudiante>();
		this.estudiantes.add(e1);
		this.estudiantes.add(e2);
		this.estudiantes.add(e3);
		this.estudiantes.add(e4);
		this.estudiantes.add(e5);	
	}
	public void mostrarEstudiantes() {
		System.out.println("Estudiantes:\n");
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.getNombre()+" "+estudiante.getApellidos());
			for (Asignatura asignatura : estudiante.getAsignaturas()) {
				System.out.println(asignatura.getNombre()+": "+String.format("%.2f", asignatura.getNota()));
			}
			System.out.println();
		}
	}

}