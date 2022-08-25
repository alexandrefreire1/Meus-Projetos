package javapplication02;

import javax.swing.JOptionPane;

public class JavaApplication13 {

	public static void main(String[] args) {
		// Gerador de Números Aleatórios
		
		/*for(int i=1; i <= 100; i++) {
			int face = 1 + (int)(Math.random() * 6);
			System.out.print(face);
		}*/
		
		String nome[] = new String[100];
		
		int i = 0;
		nome[i] = JOptionPane.showInputDialog("Digite um nome: ");
		
		while(!nome[i].equals("")) {
			i++;
			nome[i] = JOptionPane.showInputDialog("Digite um nome: ");
		}
		
		int sorteado = (int)(Math.random() * (i + 1));
		JOptionPane.showMessageDialog(null, "Nome sorteado: " + nome[sorteado]);
		

	}

}
