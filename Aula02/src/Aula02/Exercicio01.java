package Aula02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("digite um numero:");
		int valor1 = entrada.nextInt();
		System.out.println("digite o segundo numero:");
		int valor2 = entrada.nextInt();
		System.out.println("digite o terceiro:");
		int valor3 = entrada.nextInt();
		
		int resp = valor1 > valor2 && valor1 > valor3  ? valor1 : valor2 > valor1 && valor2 > valor3 ? valor2 : valor3;
		System.out.println(resp);
		entrada.close();

	}
}
