package fundamentos;

public class AreaCircuferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		final double  pi = 3.14159; //final diz que o valor nao pode ser alterado
		double area = pi * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = pi * raio * raio;
		System.out.println("Area = " + area + "m2.");
	}

}
