package u2;

public class Ejemplo2_8 {

	public static void main(String[] args) {
		int[] valores = {4,10,3,8};
		int maximo = encontrarMaximo(valores);
		System.out.println("El valor máximo es "+maximo);
	}
	
	public static int encontrarMaximo (int[] lista) {
		int max =0;
		for(int i=0;i<lista.length;i++) {
			if(lista[i]>max) {
				max=lista[i];
			}
		}
		return max;
	}

}
