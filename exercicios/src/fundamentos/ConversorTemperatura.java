package fundamentos;


public class ConversorTemperatura {


	public static void main(String[] args) {
		/* (f - 32) * 5/9 = c 
		formula converstion  */
		
		double tempF = 32;
		final double ajuste = 32;
		final double div =5/9.0;
		double celsius = (tempF-ajuste)*div;
		System.out.println("O resultado da conversao de " + tempF + " em F para C é de: "+ celsius);
		
		 
		
		
	}
}
