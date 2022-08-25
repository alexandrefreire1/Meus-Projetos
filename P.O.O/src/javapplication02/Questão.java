package javapplication02;

import javax.swing.JOptionPane;

public class Questão {

	public static void main(String[] args) {
		
		// Recebendo o n�mero
		int numDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite uma face de um dado (1 a 6): "));
		
		// Sorteando n�mero face do Dado
		int dado = 1 + ((int)Math.random()*6);
		
		// Condi��o de compara��o com a face do dado digitado e a face do dado sorteado
		if(numDigitado == dado) {
			// SE for igual, apresente a mensagem e a face sorteada
			JOptionPane.showMessageDialog(null, "Parabéns! O número sorteado foi: " + dado);
		} else {
			// SE N�O, apresente a mensagem indicando o erro.
			JOptionPane.showMessageDialog(null, "Seu número não foi sorteado.");
		}
	}

}
