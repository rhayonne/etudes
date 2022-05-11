package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom"); //usando o ln ele vai criar uma linha apos a execucao do syso
		System.out.println(" dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6); //%d faz referencia à uma variavel inteiro
		//pintf - print formatado // %n também quebra a linha
		
		
		System.out.printf("Salario %.1f %n", 1234.56789);
		System.out.printf("Nome: %s %n", "joao");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome:" );
		String nome = entrada.nextLine();
		System.out.print("Nome= " + nome);
		
		
		System.out.print("Digite seu sobrenome:" );
		String sobrenome = entrada.nextLine();
		System.out.print("Sobrenome= " + sobrenome);
		
		
		System.out.print("Digite sua idade:" );
		int idade = entrada.nextInt();
		entrada.nextLine(); //usado para recuperar o \n que o java le depois que colocamos um numero e apertamos enter (colocar sempre depois do nextInt)
		System.out.printf("%s %s tem %d anos", nome, sobrenome, idade); //sempre usar o printf quando for usar o formatar %d %s etc...
		entrada.close();
	}

}
