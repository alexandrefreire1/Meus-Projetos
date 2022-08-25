package javapplication02;

import javax.swing.JOptionPane;

public class NumInvertido {

	public static void main(String[] args) {
		
		int numInv = 0;
		int i = 0;
		
		numInv = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		while(numInv > 0) {
			i*= 10;
			i+= (numInv % 10);
			numInv/= 10;
		}
		
		JOptionPane.showMessageDialog(null, i);

	}

}
