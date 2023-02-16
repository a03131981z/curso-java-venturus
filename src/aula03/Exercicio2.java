package aula03;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String args[]) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		String continuar = "";
		boolean acabou = false;
		while(!acabou) {
		try {
			 System.out.print("Digite a operacao desejada, apenas digite: +, -, *, /, ^: ");
			 String operacao = sc.nextLine();
			 if((!operacao.equals("+")) && (!operacao.equals("-")) && (!operacao.equals("*")) && (!operacao.equals("/")) && (!operacao.equals("^"))) {
				 System.out.println("Opcao invalida");
				 continue;
			 }
                if((operacao.equals("+")) || (operacao.equals("-")) || (operacao.equals("*")) || (operacao.equals("/")) || (operacao.equals("^"))){
                	 System.out.print("Digite um valor inteiro: ");
				     int numero1 = Integer.parseInt(sc.nextLine());
				     
				     System.out.print("Digite um valor inteiro: ");
				     int numero2 = Integer.parseInt(sc.nextLine());
		
				     System.out.println("Resultado: "+calculadora(operacao, numero1, numero2));
				     System.out.print("Quer continuar? sim ou nao? ");
				     continuar = sc.nextLine();
				     if (continuar.equals("nao")) {
					     System.out.println("Volte sempre");
					     acabou = true;//Nesse break encerra o programa
					     
				     }else if(continuar.equals("sim")){
					     continue;//continua, sobe pra cima
				     
				     }else {
				    	 System.out.println("Opcao invalida! Digite sim ou nao\n");
				    	 while(!continuar.equals("sim") && !(continuar.equals("nao"))) {
					    	 System.out.print("Quer continuar? sim ou nao? ");
						     continuar = sc.nextLine();
						     if(continuar.equals("nao")) {
						    	 System.out.println("Volte sempre, certo?");
						    	 acabou = true; //Nessa linha aqui eu botei break mas voltava pro início do while
						     
						     }else if((!continuar.equals("sim")) && (!continuar.equals("nao"))) {
						    	 System.out.println("Opcao invalida! Digite sim ou nao\n");
						     
						     }
				    	 }
				     }
                 }
		     
		    }catch (NumberFormatException e) {
		        System.out.println("ERRO - Valor digitado nao e um numero inteiro!");
		        System.out.println("Vamos reiniciar");
		        //TimeUnit.SECONDS.sleep(3);
		        
		    
		    }catch(ArithmeticException e) {
		    	System.out.println("ERRO! Nao existe divisao por zero");
		    	System.out.println("Vamos reiniciar");
		    	//TimeUnit.SECONDS.sleep(3);
		    }
		}
		
		sc.close(); 
	}
	
	public static int calculadora(String operacao, int num1, int num2) {
		int resultado = 0;
		if(operacao.equals("+")){
			resultado = num1+num2;
		
		}else if(operacao.equals("-")) {
			resultado = num1-num2;
		
		}else if(operacao.equals("*")) {
			resultado = num1*num2;
		
		}else if(operacao.equals("/")) {
			resultado = num1/num2;
		
		}else if(operacao.equals("%")) {
			resultado = num1%num2;
		
		}else if(operacao.equals("^")) {
			resultado = num1^num2;
		
		}else {
			System.out.println("Operacao invalida");
		}
			
		return resultado;
	}
}
