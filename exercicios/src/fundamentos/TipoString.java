package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Testando o indice".charAt(2)); //vai demonstrar o valor na posicao 2
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!!"));
		System.out.println(s + "!!!"); //quase o mesmo efeito que o concat
		
		System.out.println(s.toLowerCase().startsWith("boa")); //Verifica se o texto inicia com BOA
		System.out.println(s.length()); //quantos caracteres existem nesse string
		System.out.println(s.endsWith("tarde")); //verifica se termina com tarde
		System.out.println(s.toUpperCase().endsWith("TARDE")); //verifica se termina com TARDE e colocar maisculo
		System.out.println(s.toLowerCase().equals("boa tarde"));//coloca em minusculo e verifica a string
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome:" + sobrenome + "\nIdade: " + idade + "\nSalario" + salario + "\n\n");
		
		System.out.printf("O senhor %s %s tem %d e ganha R$ %.2f \n\n",nome, sobrenome, idade, salario );
		String frase =  String.format("O senhor %s %s tem %d e ganha R$ %.2f",nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		
		
	}

}
