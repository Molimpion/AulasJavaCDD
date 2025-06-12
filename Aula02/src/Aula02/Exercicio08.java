package Aula02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Digite seu sexo (F ou M):");
		char letra = input.next().charAt(0);
		
			System.out.println(letra=='m'? "Masculino": letra=='f' ? "Feminino": "Sexo indefinido");{
		input.close();
		}
			
	}
}