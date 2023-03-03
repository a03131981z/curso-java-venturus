package aula04;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome correntista: ");
		String nome = sc.nextLine();
		System.out.print("Agência: ");
		int agencia = Integer.parseInt(sc.nextLine());
		System.out.print("Conta: ");
		int conta = Integer.parseInt(sc.nextLine());
		System.out.println();
		System.out.println("Nome: "+nome+"\nAgência: "+agencia+"\nConta: "+conta);
		sc.close();
	}
}
