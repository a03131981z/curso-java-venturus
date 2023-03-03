package aula04;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Número: ");
		int numero = Integer.parseInt(sc.nextLine());
		System.out.print("Horas trabalhadas no mês: ");

		int horasTrabalhadas = Integer.parseInt(sc.nextLine());
		System.out.print("Valor por hora: ");
		int valorPorHora = Integer.parseInt(sc.nextLine());
		double salario = horasTrabalhadas*valorPorHora;
		System.out.print("Saída: NUMERO = "+numero);
		System.out.printf(", SALARIO = R$ %.2f", salario);
		sc.close();
	}
}
