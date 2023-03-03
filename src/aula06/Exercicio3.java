package aula06;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor: ");
		double y = Double.parseDouble(sc.nextLine());
	    System.out.print("Digite o valor: ");
		Double j = Double.parseDouble(sc.nextLine());
		y /= j;
		
		System.out.println("Valor final: "+y);
		y = 5;
		y /= j;
		System.out.println("Valor final: "+y);
		
		sc.close();
	}
}
