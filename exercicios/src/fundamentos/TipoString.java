package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Testando o indice".charAt(2)); //vai demonstrar o valor na posicao 2
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!!"));
		System.out.println(s + "!!!"); //quase o mesmo efeito que o concat
		
		System.out.println(s.startsWith("Boa")); //Verifica se o texto inicia com 
		
	}

}
