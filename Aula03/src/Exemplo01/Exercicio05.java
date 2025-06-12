package Exemplo01;

import java.util.Scanner;

public class Exercicio05 {

		public static void main(String[] args) {
			Scanner input= new Scanner(System.in);
			System.out.println("Digite quantos alunos tem na sua classe:");
			int alunos = input.nextInt();
			
			double soma = 0, nota;
			
			for (int i = 0; i < alunos; i++) {
	            System.out.println("Digite a nota do aluno:");
	            nota = input.nextDouble();
	            soma = soma + nota;
			}
			
			double media = soma/ alunos;
			System.out.println(media);
			input.close();		
		}
	}
