package Aula01;

import java.util.Scanner;

public class Exercicioo01 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("digite um numero:");
		int valor = entrada.nextInt();
		if(valor > 0) {
			System.out.println("positivo");
		} else if(valor < 0 ) {
			System.out.println("negativo");
		}
			else {
				System.out.println("zero");
		}

	}

}
