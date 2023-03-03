package aula06;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor: ");
		double w = Double.parseDouble(sc.nextLine());
	    System.out.print("Digite o valor: ");
		double j = Double.parseDouble(sc.nextLine());
		w %= j;
		System.out.println("Valor final: "+w);
		w = 4.0;
		w %= j;
		System.out.println("Valor final: "+w);
		sc.close();
	}
}