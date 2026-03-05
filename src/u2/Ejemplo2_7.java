package u2;


public class Ejemplo2_7 {
	
	public static void main(String [] args) {
		int [] numeros = {4,8,6,2,10};
		
		int suma = 0;
		for ( int i = 0; i<numeros.length;i++) {
			suma+=numeros[i];
		}
		
		double promedio = suma / (numeros.length -1);
		
		System.out.println("El promedio es "+promedio);
	}

}
