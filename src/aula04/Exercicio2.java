package aula04;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ano atual: ");
		int anoAtual = Integer.parseInt(sc.nextLine());
		System.out.print("Ano atual: ");
		int anoNascimento = Integer.parseInt(sc.nextLine());
		int idade = anoAtual-anoNascimento;
		System.out.println("Idade: "+idade);
		sc.close();
	}
}
