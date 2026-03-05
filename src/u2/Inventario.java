package u2;

public class Inventario {

	public String generarInforme (Producto p) {
		double valor = p.calcularValor();
		return "Producto: "+p.getCantidad()+
				"unidades, Valor total: "+valor;
	}
	
	public double aplicarDescuento(Producto p,double descuento) {
		return p.calcularValor()-descuento;
	}
}
