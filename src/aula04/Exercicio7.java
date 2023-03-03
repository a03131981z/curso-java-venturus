package aula04;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Código peça 1: ");
		int codigoPeca1 = Integer.parseInt(sc.nextLine());
		System.out.print("Números de peça 1: ");
		int numeroPeca1 = Integer.parseInt(sc.nextLine());
		System.out.print("Valor unitário de cada peça 1: ");
		int valorUnitarioPeca1 = Integer.parseInt(sc.nextLine());
		double valorFinal1 = numeroPeca1*valorUnitarioPeca1;
		System.out.printf("Saída: VALOR A PAGAR: R$ %.2f", valorFinal1);
		
		System.out.println();
		System.out.print("Código peça 1: ");
		int codigoPeca2 = Integer.parseInt(sc.nextLine());
		System.out.print("Números de peça 1: ");
		int numeroPeca2 = Integer.parseInt(sc.nextLine());
		System.out.print("Valor unitário de cada peça 1: ");
		int valorUnitarioPeca2 = Integer.parseInt(sc.nextLine());
		double valorFinal2 = numeroPeca1*valorUnitarioPeca1;
		System.out.printf("Saída: VALOR A PAGAR: R$ %.2f", valorFinal2);
		
		sc.close();
	}
}
