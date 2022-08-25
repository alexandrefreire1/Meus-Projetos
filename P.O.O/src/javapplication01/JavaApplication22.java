package javapplication01;

import javax.swing.JOptionPane;

public class JavaApplication22 {

	public static void main(String[] args) {
		
		
		// Switch/Case:
		
		/*int num;
		
		String s = JOptionPane.showInputDialog(null, "Digite um dia da semana (1-7): ");
		num = Integer.parseInt(s);
		
		switch(num) {
		case 1: System.out.println("Dom"); break;
		case 2: System.out.println("Seg"); break;
		case 3: System.out.println("Ter"); break;
		case 4: System.out.println("Qua"); break;
		case 5: System.out.println("Qui"); break;
		case 6: System.out.println("Sex"); break;
		case 7: System.out.println("Sáb"); break;
		default: System.out.println("Dia inválido.");
		}
		System.out.println();
		
		
		
		
		// Estrutura de Repetição (For, While e Do/While):
		
		// *O For é usado em situações de contagem.*
		for(int i=5; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println();
		
		// *O While executa pré condicionalmente*
		int j = 1;
		while(j <= 5) {
			System.out.println(j);
			j++;
		}
		
		// *O Do/While executa o programa e verifica a condição depois*
		double nota1;
		do{
			nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número (0-10): "));
		} while(nota1 < 0 || nota1 > 10);
		System.out.println();
		System.out.println("Fim do programa de repetição.");*/
		
		
		
		
		// Arrays (Vetores)
		
		String vet[] = new String[5];
		String msg = "";
		
		for(int i=0; i < vet.length; i++) {
			vet[i] = JOptionPane.showInputDialog("Digite um nome: ");
		}
		
		for(String elem : vet) {
			msg += "Elemento do Vetor: " + elem + "\n";
		}
		JOptionPane.showInputDialog(null, msg);
		
		
		
	}

}