package Aula02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota:");
		double nota1 = input.nextDouble();
		
		System.out.println("Digite sua segunda nota:");
		double nota2 = input.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		System.out.println("Média: " + media);
		
		input.close();
	}
}