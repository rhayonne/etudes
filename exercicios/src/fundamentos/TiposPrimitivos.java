package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informacoes do Funcionario
		
		
		
		//Tipos numericos inteiros
		byte anosDeEmpresa=23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_485L; //Usar o L para indicar que é um literal Long
		//o _ (underline) é utilisado para  separar milhares
		
		//tipos numericos reais
		float salario = 11_445.44F; //F maiusculo indica que você quer usar um literal Float
		double vendasAcumuladas = 2_991_797_103.01; 
		
		//tipo booleano
		boolean estaDeFerias = false; // pode ser true tbm
		
		//tipo cadactere
		char status = 'A'; //tipo char comporta somente uma letra
		char statusUnicode = '\u0010'; //usando a lista unicode
		
		//Dias de empresa
		System.out.println(anosDeEmpresa*365);
		
		//numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ":ganha --> "+ salario);
		System.out.println("Ferias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
	}
}
