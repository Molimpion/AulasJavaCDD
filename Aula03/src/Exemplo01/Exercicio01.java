package Exemplo01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Digite quantos alunos tem na sua classe:");
		int alunos = input.nextInt();
		
		float soma = 0, nota;
		int cont = 0;
		
		while (cont < alunos) {
			System.out.println("Digite a nota de todos os alunos uma por uma:");
			nota = input.nextFloat();
			cont = cont +1;
			soma = soma + nota;
		}
		
		double media = soma/ alunos;
		System.out.println(media);
		input.close();		
	}
}
