package Aula02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		System.out.println("digite um numero:");
		int valor1 = entrada.nextInt();
		System.out.println("digite o segundo numero:");
		int valor2 = entrada.nextInt();
		System.out.println("digite o terceiro:");
		int valor3 = entrada.nextInt();
		
		if(valor1>valor2&&valor1>valor3) {
			System.out.println(valor1); }
		else if(valor2>valor1&&valor2>valor3) {
			System.out.println(valor2);}
		else 
			System.out.println(valor3);{	
		entrada.close();
		}
  }
}
