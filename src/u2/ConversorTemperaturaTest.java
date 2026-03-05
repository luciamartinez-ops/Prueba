package u2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ConversorTemperaturaTest {

	@Test
	void centigFarTest() {
		//Arrage. Preparación. Creamos el objeto de prueba
		//Creamos un objeto de tipo ConversorTemperatura  que se llama conversor1
		ConversorTemperatura conversor1 = new ConversorTemperatura();
		
		//Act. Acción. Obtenemos el resultado que queremos supervisar
		//Vamos a probar el primer método
		double resultado = conversor1.centigFar(0);
		
		//Assert. Comprobar que el resultado es correcto	
		assertEquals(32,resultado,0.001);
	}
	
	@Test
	void farCentigTest() {
		//Arrage. Preparación. Creamos el objeto de prueba
		//Creamos un objeto de tipo ConversorTemperatura  que se llama conversor1
		ConversorTemperatura conversor1 = new ConversorTemperatura();
		
		//Act. Acción. Obtenemos el resultado que queremos supervisar
		//Vamos a probar el primer método
		double resultado = conversor1.farCentig(0);
		
		//Assert. Comprobar que el resultado es correcto	
		assertEquals(-17.78,resultado,0.01);
	}

}
