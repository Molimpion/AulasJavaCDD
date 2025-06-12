package Exemplo01;
import java.util.Scanner;
public class Exercicio07 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Escreva um conjunto de 4 notas destintas:");
		int A[] = new int[4];
		int B[] = new int[4];
		int C[] = new int[4];
		int D[] = new int[4];
		

		for(int x =0; x<A.length;x++) {
			A[x] = input.nextInt();
			System.out.println(A[x]);
		
		}
	}
}