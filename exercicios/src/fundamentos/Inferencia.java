package fundamentos;

public class Inferencia {
	public static void main(String[] args) {

		// a inferencia so funciona se a variavel for inferida e iniciada ao mesmo.
		
		double a = 4.5;
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		var b = 4.5; //O java vai atribuir b como tipo double
		System.out.println(b);
		
		var c = "Texto"; //a variavel vai ser definida pelo tipo de conteudo que você insere, nesse caso, vai ser char ou texto
		System.out.println(c);
		
		c = "Outro Texto";
		System.out.println(c);
		
		double d; //declaracao de variavel
		d = 123.65; //Variavel inicializada
		System.out.println(d); // variavel usada
	}

}
