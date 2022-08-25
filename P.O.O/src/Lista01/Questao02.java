package Lista01;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculando Vendas - Questão 02 (Alexandre Freire)");
		System.out.println("\nExecutando...");
		System.out.println();
		
		int[] pegaQtdProd = new int[5];
		int[] pegaNum = new int[5];
		int numProd = 0;
		int qtdVend = 0;
		Double valor = 0.0;
		Double resultado = 0.0;
		Double[] calcComp = new Double [5];
		
		for(int i=0; i < 5; i++) {
			Double multVend = 1.0;
			System.out.println("=================================================");
			System.out.print("Digite o número referente ao produto: ");
			numProd = scan.nextInt();
			
			switch(numProd) {
			case 1: { 
				valor = 2.98; 
				System.out.print("Digite a quantidade a ser comprada: "); 
				qtdVend = scan.nextInt();
				
				pegaNum[i] = 1;
				pegaQtdProd[i] = qtdVend;
				multVend = valor*qtdVend;
				
				calcComp[i] = multVend;
				break;
			}
			case 2: {
				valor = 4.50;
				System.out.print("Digite a quantidade a ser comprada: ");
				qtdVend = scan.nextInt();
				
				pegaNum[i] = 2;
				pegaQtdProd[i] = qtdVend;
				multVend = valor*qtdVend;
				
				calcComp[i] = multVend;
				break;
			}
			case 3: {
				valor = 9.95; 
				System.out.print("Digite a quantidade a ser comprada: "); 
				qtdVend = scan.nextInt();
				
				pegaNum[i] = 3;
				pegaQtdProd[i] = qtdVend;
				multVend = valor*qtdVend;
				
				calcComp[i] = multVend;
				break;
			}
			case 4: {
				valor = 4.49; 
				System.out.print("Digite a quantidade a ser comprada: "); 
				qtdVend = scan.nextInt();
				
				pegaNum[i] = 4;
				pegaQtdProd[i] = qtdVend;
				multVend = valor*qtdVend;
				
				calcComp[i] = multVend;
				break;
			}
			case 5: {
				valor = 6.87; 
				System.out.print("Digite a quantidade a ser comprada: "); 
				qtdVend = scan.nextInt();
				
				pegaNum[i] = 5;
				pegaQtdProd[i] = qtdVend;
				multVend = valor*qtdVend;
				
				calcComp[i] = multVend;
				break;
			}
			default: System.out.println("Produto não existe!\n"); break;
			}
			if(numProd>0 && numProd<=5) {
				System.out.printf("Valor do Produto " + numProd + ": R$" +  "%.2f", valor);
				System.out.println();
			}
		}
		System.out.println("=================================================");
		for(int i=0; i < pegaNum.length; i++) {
			// Imprimindo numera��o do produto 
			System.out.println("Quantidade do Produto " + pegaNum[i] + ": " + pegaQtdProd[i] + " unidades.");
		}
		
		for(int i=0; i < calcComp.length; i++) {
			// Calculando o total dos produtos vendidos
			resultado += calcComp[i];
		}
		System.out.println("=================================================");
		System.out.println("\nValor Total dos Produtos Vendidos: R$" + resultado + "\n");
		System.out.println("=================================================");
		System.out.println("\nFim do Programa.");
	}

}
