package aula04;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Número 1: ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("Número 2: ");
		int num2 = Integer.parseInt(sc.nextLine());
		int soma = num1+num2;
		System.out.println("Saída: SOMA = "+soma);
		sc.close();
	}
}
