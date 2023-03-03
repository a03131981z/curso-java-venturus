package aula06;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor: ");
		int y = Integer.parseInt(sc.nextLine());
	    System.out.print("Digite o valor: ");
		int j = Integer.parseInt(sc.nextLine());
		y /= j;
		System.out.println("Valor final: "+y);
		sc.close();
	}
}
