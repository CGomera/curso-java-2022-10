package curso.java.colecciones.ejercicio1bis;

import java.util.Set;


public class Estudiante{
	private String nombre;
	private String apellidos;
	private Set<Asignatura> asignaturas;
	
	public Estudiante(String nombre, String apellidos, Set<Asignatura> asignaturas) {
		super();
		this.asignaturas = asignaturas;
	}

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	@Override
	public String toString() {
		return "Estudiante [asignaturas=" + asignaturas + ", toString()=" + super.toString() + "]";
	}

	
}