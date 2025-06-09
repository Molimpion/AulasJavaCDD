package Aula02;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("digite um numero que vou dizer o dia da semana equivalente ou mesmo:");
		int num = input.nextInt();
		
		String resposta= num == 1 ? "domingo": num == 2 ? "segunda": num == 3 ? "terça": num == 4 ? "quarta" : num == 5 ? "quinta": num == 6 ? "sexta": num == 7 ? "sabado": "invalido";
		System.out.println(resposta);
		input.close();
	}
}