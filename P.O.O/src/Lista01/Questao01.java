package Lista01;

import java.util.Scanner;

public class Questao01 {
	
	public static void main(String[] args) {
		
		System.out.println("Programa de Gráfico de Barras - Questão 01 (Alexandre Freire)");
		System.out.println("\nExecutando...");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		int[] recebeNumeros = new int[5];
		int valor = 1;
		
		for(int i=0; i < recebeNumeros.length; i++) {
			System.out.print("Digite um número de 1 a 30: ");
			valor = scan.nextInt();
			if(valor>0 && valor<=30) {
				recebeNumeros[i] = valor;
			} else {
				System.out.println("O número é menor do que 1 e maior do que 30. Tente novamente.");
			}
		}
		System.out.println();
		for(int j=0; j < recebeNumeros.length; j++) {
			System.out.println(asterisco(recebeNumeros[j]));
		}
		System.out.println("\nFim do Programa.");
	}
	
	// Método que não precisa de objeto (Estático)
	public static String asterisco(int quant) {
		String s = "";
		for(int i=0; i < quant; i++) {
			s+="*";
		}
		return s;
	}

}
