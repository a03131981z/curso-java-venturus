package aula03;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome do aluno: ");
		String nome = sc.nextLine();
		System.out.print("Digite a idade: ");
		int idade = Integer.parseInt(sc.nextLine());
		int notas1[] = new int[4];
		int media1 = 0;
		for(int k=0; k<notas1.length; k++) {
			System.out.print("Digite a nota "+k+": ");
			notas1[k] = Integer.parseInt(sc.nextLine());
			media1 += notas1[k]/4;
		}
		System.out.println("Média anual: "+media1+" de "+nome+", idade "+idade+" anos."+" Suas notas abaixo: ");
		for(int k=0; k<notas1.length; k++) {
			System.out.println(notas1[k]);
		}
		
		sc.close();
	}
}
