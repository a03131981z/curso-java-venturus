package aula05;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o dia do mês: ");
		int dia = Integer.parseInt(sc.nextLine());
		String resultado = dia <= 15? "Estamos na primeira quinzena":"Estamos na segunda quinzena";
		System.out.println(resultado);
		sc.close();
	}
}
