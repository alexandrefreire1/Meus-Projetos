package javapplication02;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		
		int peso = 0;
		Double alt = 0.0;
		Double calcIMC = 0.0;
		
		alt = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
		peso = Integer.parseInt(JOptionPane.showInputDialog("Digite seu peso: "));
		
		calcIMC = (peso / (alt * alt));
		
		String msg = String.format("Seu IMC é: %.2f", calcIMC);
		
		if(calcIMC < 20) {
			JOptionPane.showMessageDialog(null, msg + "\nVocê está abaixo do peso.");
		} else if (calcIMC > 20 && calcIMC <= 25) {
					JOptionPane.showMessageDialog(null, msg + "\nVocê está com o peso normal.");
			} else if (calcIMC > 25 && calcIMC < 30) {
						JOptionPane.showMessageDialog(null, msg + "\nVocê está acima do peso.");
				} else if(calcIMC > 30) {
							JOptionPane.showMessageDialog(null, msg + "\nObesidade.");
				}
	}
}
