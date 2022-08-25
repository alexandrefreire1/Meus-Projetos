package Lista01;

import java.util.Random;
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pedra, Papel ou Tesoura - Quest�o 03 (Alexandre Freire)");
		System.out.println("\nExecutando...");
		System.out.println();
		
		System.out.println("=========================");
		System.out.println(" PEDRA   PAPEL   TESOURA ");
		System.out.println("=========================\r\n"
				+ "    ____\r\n"
				+ "  _/  _ \\\\\r\n"
				+ " / _ - _ \\\\\r\n"
				+ " \\\\_______/   \r\n"
				+ "\r\n"
				+ "   _____\r\n"
				+ "  O_____O\r\n"
				+ "  /     /\r\n"
				+ " /____ /\r\n"
				+ "O_____O\r\n"
				+ "\r\n"
				+ "    _    _\r\n"
				+ "   (_)  / )\r\n"
				+ "     | (_/ \r\n"
				+ "    _+/  \r\n"
				+ "   //|\\\\\r\n"
				+ "  // ||\r\n"
				+ " (/  |/ \r\n"
				+ "\r\n"
				+ "=========================");
		
		int vitPlayer = 0;
		int vitMaq = 0;
		for(int i=0; i < 3; i++) {
			String  player = jogadaPlayer();
			String maquina = jogadaMaq();
			if(player.equals("pedra") && maquina.equals("tesoura")) {
				vitPlayer++;
			}
			else if(player.equals("papel") && maquina.equals("pedra")) {
				vitPlayer++;
			}
			else if(player.equals("tesoura") && maquina.equals("papel")) {
				vitPlayer++;
			}
			else if(player.equals("tesoura") && maquina.equals("pedra")) {
				vitMaq++;
			}
			else if(player.equals("pedra") && maquina.equals("papel")) {
				vitMaq++;
			}
			else if(player.equals("papel") && maquina.equals("tesoura")) {
				vitMaq++;
			}
			//else System.out.println("Empate!");
		}
		System.out.println("\nNº de Vitórias do Player: " + vitPlayer);
		System.out.println("Nº de Vitórias da Máquina: " + vitMaq);
		vencedor(vitPlayer, vitMaq);
		
	}
	// Gera a jogada do Usu�rio
		public static String jogadaPlayer() {
			Scanner scan = new Scanner(System.in);
			System.out.print("Escolha Pedra, Papel ou Tesoura: ");
			String setPlayer = scan.next().toLowerCase();
			switch (setPlayer) {
				case "pedra": return setPlayer;
				case "papel": return setPlayer;
				case "tesoura": return setPlayer;
			
				default: System.out.println("Erro! Escolha somente Pedra, Papel ou Tesoura: "); return jogadaPlayer();
			}
		}
	
	// Gera a jogada da M�quina
	public static String jogadaMaq() {
		String[] setMaquina = {"pedra", "papel", "tesoura"};
		Random aleat = new Random();
		
		int jogadaMaq = aleat.nextInt(3);
		return setMaquina[jogadaMaq];
	}
	
	public static void vencedor(int vitPlayer, int vitMaq) {
		if(vitPlayer > vitMaq) System.out.println("\nO Player venceu! "); 
		else if(vitPlayer < vitMaq) System.out.println("\nA Máquina venceu! ");
		else System.out.println("\nEmpate!");
	}
}
