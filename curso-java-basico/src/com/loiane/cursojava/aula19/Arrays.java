package com.loiane.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		//Declarar o array logo ap�s declarar o tipo (primitivo):
		double[] temp = new double[365];
		
		temp[0] = 31.3;
		temp[1] = 32;
		temp[2] = 33.7;
		temp[3] = 34;
		temp[4] = 33.1;
		
		//Chamar um valor espec�fico no �ndice do Array j� definido
		System.out.println("O valor da temperatura do dia 3 �: " + temp[2]);
		
		//Ver o tamanho do Array com o m�todo .length
		System.out.println("Tamanho do Array: " + temp.length);
		
		//Mostra o valor do Array (nesse caso, ele referencia a mem�ria separada para o Array)
		System.out.println("Valores do Array: " + temp);
		
		//Repetidor que mostra todos os dias e as temperaturas armazenadas nos �ndices
		for(int i=0; i < temp.length; i++) {
			System.out.println("O  valor da temperatura do dia " + (i+1) + " �: " + temp[i]);
		}
		
		//Vers�o MELHORADA da itera��o do Array
		for(double temperaturas : temp) {
			System.out.println(temp);
		}

	}

}
