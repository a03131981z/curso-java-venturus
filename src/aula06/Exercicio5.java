package aula06;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		if(((a+b)>c) && ((a+c)>b) && ((b+c)>a)) {
			System.out.println("É triângulo");
			if(a == b && a == c && b == c) {
				System.out.println("É equilátero");
			}else {
				System.out.println("É escaleno");
			}
			
		}else {
			System.out.println("Não é triângulo");
		}
		
		sc.close();
	}
}
