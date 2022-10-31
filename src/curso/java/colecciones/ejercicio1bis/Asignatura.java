package curso.java.colecciones.ejercicio1bis;

public class Asignatura {

	private String nombre;
	private double nota;
	public Asignatura(String nombre, double nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}
	public Asignatura(String nombre) {
		super();
		this.nombre = nombre;
		this.nota = Math.random()*(10-1)+1;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", nota=" + nota + "]";
	}
	
	
}
