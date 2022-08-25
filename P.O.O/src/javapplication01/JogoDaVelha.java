package javapplication01;

import javax.swing.JOptionPane;

public class JogoDaVelha {

	public static void main(String[] args) {
		
		// Criando a Matriz [lin][col]
		char velha[][] = new char[3][3];
		
		for(int i=0; i < velha.length; i++) {
			for(int j=0; j < velha[i].length; j++ ) {
				velha[i][j] = JOptionPane.showInputDialog("Jogo da Velha - Digite X ou O").charAt(0);
			}
		}
		
		// Exibir o array 2D na tela.
		
		String msg = "";
		
		for(int i=0; i < velha.length; i++) {
			for(int j=0; j < velha[i].length; j++) {
				msg += velha[i][j] + " ";
			}
			msg += "\n";
		}
		JOptionPane.showMessageDialog(null, msg);
		
		
		
	}

}
