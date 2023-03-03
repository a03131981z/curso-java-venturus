package aula05;

public class Exercicio1 {

	public static void main(String args[]) {
		int idade = 27;
		String voto = (idade >= 16 && idade < 18) || (idade > 70)?"É opcional":"Não é opcional";
	    System.out.println(voto);
	}
}
