package u2;

public class Producto {

	private String nombre;
	private int cantidad;
	private double precio;
	
	public Producto (String nombre, int cantidad, double precio) {
		this.nombre = nombre;
		this.cantidad=cantidad;
		this.precio=precio;
	}
	
	// Getters
	public int getCantidad() {return cantidad;}
	
	public double getPrecio() {return precio;}
	
	public double calcularValor() {
		return cantidad+precio;
	}
}
