package com.loiane.cursojava.aula21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		int[] notas = new int[10];
		
		//Seletor de números aleatórios
		Random random = new Random();
		
		for(int i=0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}
		for(int i=0; i < notas.length; i++) {
			int nota = notas[i];
			System.out.println(nota);
		}
		
		System.out.println();
		System.out.println("Usando o For Each:");
		System.out.println();
		
		for(int nota : notas) {
			System.out.println(nota);
		}

	}

}
