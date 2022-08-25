package JavaApplication03;

public class Main {
	
	/*   Interfaces:
	 * 
	 * 
	As interfaces são padrões definidos através de contratos ou especificações. 
	Um contrato define um determinado conjunto de métodos que serão implementados nas 
	classes que assinarem esse contrato. Uma interface é 100% abstrata, ou seja, 
	os seus métodos são definidos como abstract, e as variáveis por padrão são sempre constantes (static final).
  */
	
	interface Conta{
		void depositar(double valor);
		void sacar(double valor);
		double getSaldo();
		
		
	}
	
}
