package Aula02;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Digite 0 para não e 1 para sim!");
		System.out.println("Telefonou para a vitima?");
		int resp = input.nextInt();
		System.out.println("Estava no local do crime?");
		int resp2 = input.nextInt();
		System.out.println("Mora perto da vitima?");
		int resp3 = input.nextInt();
		System.out.println("Devia para  a vitma?");
		int resp4 = input.nextInt();
		System.out.println("Já trabalhou com a vitima?");
		int resp5 = input.nextInt();
		
		int soma = resp+resp2+resp3+resp4+resp5;
		if(soma>2)
			System.out.println("Suspeito");
		else if(soma==3 && soma==4)
			System.out.println("Cumplice");
		else if(soma==5)
			System.out.println("Assassino");
		else
			System.out.println("Inocente");
		input.close();
	}
}
		
		
		