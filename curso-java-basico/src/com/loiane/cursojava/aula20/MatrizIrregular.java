package com.loiane.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Programa de contagem de filhos - Matriz Irregular");
			System.out.println();
			System.out.println("Número de pessoas a serem entrevistadas: ");
			int numEntrev = scan.nextInt();
			
			String[][] nomesFilhos = new String[numEntrev][];
			
			for(int i=0; i < nomesFilhos.length; i++) {
				
				System.out.println("Quantidade de filhos: ");
				int qtdFilhos = scan.nextInt();
				
				nomesFilhos[i] = new String[qtdFilhos];
				
				for(int j=0; j < nomesFilhos[i].length; j++) {
					
					System.out.println("Digite o nome do filho " + (j+1) + ": ");
					
					nomesFilhos[i][j] = scan.next();
				}
			}
			System.out.println();
			
			for(int i=0; i < nomesFilhos.length; i++) {
				System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos:");
				for(int j=0; j < nomesFilhos[i].length; j++) {
					System.out.println(nomesFilhos[i][j]);	
				}
				System.out.println();
			}
			System.out.println("Fim do Programa.");
		}

	}

}
