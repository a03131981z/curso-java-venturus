package aula05;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o preço: ");
		double preco = Double.parseDouble(sc.nextLine());
		String resultado = preco < 30?"Desconto será de 10%":"Desconto será de 20%";
		
		System.out.println(resultado);
		sc.close();
	}
}
