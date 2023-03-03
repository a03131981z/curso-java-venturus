package aula04;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Raio: ");
		double raio = Double.parseDouble(sc.nextLine());
		double area = Math.PI * raio * raio;
		System.out.println("Saída: A="+area);
	}
}
