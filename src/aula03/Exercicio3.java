package aula03;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		try {
			int altura = Integer.parseInt(sc.nextLine());
			int base = Integer.parseInt(sc.nextLine());
			int area = (altura*base)/2;
			System.out.println("Área: "+area);
		
		}catch(NumberFormatException e) {
	        System.out.println("ERRO - Valor digitado nao é um numero inteiro!");
	        //TimeUnit.SECONDS.sleep(3);
	    }
	}
}
