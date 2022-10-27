package curso.java.inicio.poo.herencia.banda;

public class Bandurria extends InstrumentoCuerda {

	public Bandurria(String nombre, String tipo, String marca, double precio) {
		super(nombre, tipo, marca, precio);
		// TODO Auto-generated constructor stub
	}

	public Bandurria(String nombre, String tipo, String marca) {
		super(nombre, tipo, marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recoger() {
		System.out.println("Recogiendo Bandurria");

	}

}