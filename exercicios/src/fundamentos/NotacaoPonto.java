package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		double a = 2.3;
		String s = "String pode receber um texto";
		s = s.toUpperCase();//usando o ponto para usar opcoes da variavel s (uma string) 
		s = s.replace("PODE", "DEVE"); // metodo replace alterar um dado por outro 
		s = s.concat("!!!!!"); // vai adicionar e (contatenar) um conteudo ou uma variavel 
		
		System.out.println(s);
		
		String x = "Rhayonne".toUpperCase();
		System.out.println(x);
		
		
		String y = "Bom dia x".toUpperCase().replace("X", "Y").toUpperCase().concat(" !!!!");
		System.out.println(y);
		
		//anotacao PONTO nao pode ser usada com tipo primitivo
	}

}
