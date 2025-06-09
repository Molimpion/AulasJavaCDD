package Aula02;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("digite um numero que vou dizer o dia da semana equivalente ou mesmo:");
		int num = input.nextInt();
		
		if(num==1) {
			System.out.println("Domingo");}
		else if(num==2) {
			System.out.println("segunda");}
		else if(num==3) {
			System.out.println("terça");}
		else if(num==4) {
			System.out.println("quarta");}
		else if(num==5) {
			System.out.println("quinta");}
		else if(num==6) {
			System.out.println("sexta");}
		else if(num==7) {
			System.out.println("sabado");}
		else {
			System.out.println("nao existe dia da semana com esse numero");}
		input.close();
	}
}