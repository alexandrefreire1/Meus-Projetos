package alexandre;

import javax.swing.JOptionPane;

public class NumerosPrimos {

	public static void main(String[] args) {
		int count = 0;
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		for(int i=1; i <= num; i++) {
			if(num % i==0) {
				count++;
			}
		}
		if(count == 2) {
			JOptionPane.showMessageDialog(null, count + " é um número primo.");
		} else {
			JOptionPane.showMessageDialog(null, count + " não é um número primo.");
		}
	}
}
