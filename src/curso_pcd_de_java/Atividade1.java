package curso_pcd_de_java;

public class Atividade1 {

	public static void main(String args[]) {
		String produto1 = "Computador";
		String produto2 = "Tablet";
		int idade = 30;
		int codigo = 5290;
		char sexo = 'F';
		double preco1 = 5100.0;
		double preco2 = 1000.50;
		double medida = 53.234567;
		
		System.out.println("Produtos:\n"+produto1+", Preço total: R$"
				+ ""+preco1+"\n"+produto2+"Preço total: R$"+preco2
				+"\nRegistro: "+idade+" anos, codigo "+codigo+" e sexo: "+sexo);
		System.out.printf("medida com oito casas decimais: %.8f",medida);
		System.out.printf("\nMedida com duas casa decimais: %.3f", medida);
	}
}
