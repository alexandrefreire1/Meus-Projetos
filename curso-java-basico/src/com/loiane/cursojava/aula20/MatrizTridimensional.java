package com.loiane.cursojava.aula20;

public class MatrizTridimensional {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][][] matrizTrid = new int [3][3][3];
		System.out.println("Matriz Tridimensional - Eixos X, Y e Z");
		System.out.println();
		for(int x=0; x < matrizTrid.length; x++) {
			for(int y=0; y < matrizTrid[x].length; y++) {
				for(int z=0; z < matrizTrid[x][y].length; z++) {
					System.out.println("X = " + x + " | Y = " + y + " | Z = " + z);
					matrizTrid[x][y][z] = x + y + z;
				}
			}
		}
		System.out.println();
		System.out.println("Somas dos elementos da Matriz");
		System.out.println();
		
		int soma = 0;
		int somaPares = 0;
		int somaImpares = 0;
		for(int x=0; x < matrizTrid.length; x++) {
			for(int y=0; y < matrizTrid[x].length; y++) {
				for(int z=0; z < matrizTrid[x][y].length; z++) {
					soma += matrizTrid[x][y][z];
					
					if(matrizTrid[x][y][z] % 2 == 0) {
						somaPares += matrizTrid[x][y][z];
					} else {
						somaImpares += matrizTrid[x][y][z];
					}
				}
			}
		}
		
		System.out.println("Soma Total: " + soma);
		System.out.println("Soma Pares: " + somaPares);
		System.out.println("Soma Impares: " + somaImpares);
		System.out.println();
		System.out.println("Fim do programa.");
		
	}

}
