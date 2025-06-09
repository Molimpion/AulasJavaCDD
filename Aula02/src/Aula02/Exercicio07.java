package Aula02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Digite seu sexo (F ou M):");
		char letra = input.next().charAt(0);
		
		letra = Character.toUpperCase(letra);
		if(letra == 'F') {
		System.out.println("Feminino");
		}else if( letra== 'M') {
		System.out.println("Masulino");	
		}else
			System.out.println("Sexo Indefinido");{
		}
			
	}
}