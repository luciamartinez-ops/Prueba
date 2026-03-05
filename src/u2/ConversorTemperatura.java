package u2;

public class ConversorTemperatura {

	//Conversor cent a farg
	public double centigFar (double c) {
		return(c*9/5)+32;
	}
	
	//Conversor farg a cent
	public double farCentig (double f) {
		return(f-32)*5/9;
	}
	
	//Conversor cent a kelvin
	public double centigKelvin (double c) {
		return(c+273.15);
	}
	
	//Conversor a kelvin 
	public double kelvinCentig (double k) {
		return (k-273.15);
	}
}
