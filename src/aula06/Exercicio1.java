package aula06;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor: ");
		int x = Integer.parseInt(sc.nextLine());
	    System.out.print("Digite o valor: ");
		int j = Integer.parseInt(sc.nextLine());
		x *= j;
		System.out.println("Valor final: "+x);
		sc.close();
	}
}
