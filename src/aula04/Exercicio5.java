package aula04;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Valor A: ");
		int A = Integer.parseInt(sc.nextLine());
		System.out.print("Valor B: ");
		int B = Integer.parseInt(sc.nextLine());
		System.out.print("Valor C: ");
		int C = Integer.parseInt(sc.nextLine());
		System.out.print("Valor D: ");
		int D = Integer.parseInt(sc.nextLine());
		int diferenca = (A*B - C*D);
		System.out.println("Saída: DIFERENCA = "+diferenca);
	}
}
