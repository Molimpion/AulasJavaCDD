package Aula01;

import java.util.Scanner;

public class Exercicioo02 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("digite um numero:");
		int valor = entrada.nextInt();
		
		String resp = valor == 0 ? "zero": valor > 0 ?"positivo": "negativo";
		System.out.println(resp);

	}

}
