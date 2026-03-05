package u2;

import java.util.Scanner;

public class Ejemplo2_2 {

	public static void main(String[] args) {
		//1
		int num=0;
		int cont_pos=0;
		int cont_neg=0;
		int suma_pos=0;
		int suma_neg=0;
		float media_pos=0;
		float media_neg=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Para terminar el juego introduce el 0");
		System.out.println("Introduce un número:");
		
		num=teclado.nextInt();
		
		while(num!=0) { 		//2
			if(num>0) {			//3
				cont_pos++;		//4--
				suma_pos+=num;	//----
			} else {			//5
				cont_neg++;
				suma_neg+=num;	//----
			}
			System.out.println("Introduce un número:"); //6
			num=teclado.nextInt();
		} 
		
		if(cont_pos!=0) {		//7
			media_pos = (float) suma_pos/cont_pos;	//8
			
		}
		if(cont_neg !=0) {		//9
			media_neg=(float) suma_neg/cont_neg;	//10
		}
		
		teclado.close(); //11
		System.out.println("Media positiva: "+media_pos); 	//11
		System.out.println("Media negativa: "+media_neg);	//11
		
	}
	

}
