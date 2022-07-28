package programa;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaBancaria {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Conta> contasBancarias;
	
	public static void main(String[] args) {
		contasBancarias = new ArrayList<Conta>();
		operacoes();
	}
	
	public static void operacoes() {
		
		System.out.println("++------------------------------------------------++");
		System.out.println("||    Programa de Operação de Agência Bancária    ||");
		System.out.println("++------------------------------------------------++");
		System.out.println("||      ::          Bem Vindo à           ::      ||");
		System.out.println("||      :: Banco A&F Soluções Financeiras ::      ||");
		System.out.println("++------------------------------------------------++");
		System.out.println("||***** Selecione a operação a ser realizada *****||");
		System.out.println("++------------------------------------------------++");
		System.out.println("||        ::    1 - Criar Conta         ::        ||");
		System.out.println("||        ::    2 - Depósito            ::        ||");
		System.out.println("||        ::    3 - Saque               ::        ||");
		System.out.println("||        ::    4 - Transferência       ::        ||");
		System.out.println("||        ::    5 - Listar              ::        ||");
		System.out.println("||        ::    6 - Sair                ::        ||");
		System.out.println("++------------------------------------------------++");
		System.out.print("            Digite o número da operação:  ");
		
		int operacao = scan.nextInt();
		
		switch(operacao) {
			case 1: criarConta(); break;
			case 2: depositar(); break;
			case 3: sacar(); break;
			case 4: transferir(); break;
			case 5: listar(); break;
			case 6: System.out.println(" :: Operação Finalizada! Fim do Programa. :: ");
			System.exit(0);
			
			default: System.out.println("Opção inválida.");
			operacoes();
			break;
		}
		
	}
	
	public static void criarConta() {
		System.out.print("\nNome: ");
		String nome = scan.next();
		
		System.out.print("\nCPF: ");
		String cpf = scan.next();
		
		System.out.print("\nEmail: ");
		String email = scan.next();
		
		Cliente pessoa = new Cliente(nome, cpf, email);
		
		Conta conta = new Conta(pessoa);
		contasBancarias.add(conta);
		System.out.println("\nConta criada com sucesso!");
		operacoes();
	}
	
	private static Conta encontrarConta(int numeroConta) {
		Conta conta = null;
		if(contasBancarias.size() > 0) {
			for(Conta c : contasBancarias) {
				if(c.getNumConta() == numeroConta) {
					conta = c;
				}
			}
		}
		return conta;
	}
	
	public static void depositar() {
		System.out.println("Número da conta: ");
		int numeroConta = scan.nextInt();
		
		Conta conta = encontrarConta(numeroConta);
		
		if(conta != null) {
			System.out.println("Valor do depósito: ");
			Double valorDeposito = scan.nextDouble();
			conta.depositar(valorDeposito);
		} else {
			System.out.println("Conta não encontrada ou inexistente.");
		}
		operacoes();
	}
	
    public static void sacar() {
		System.out.println("Número da conta: ");
		int numeroConta = scan.nextInt();
		
		Conta conta = encontrarConta(numeroConta);
		
		if(conta != null) {
			System.out.println("Valor do saque: ");
			Double valorSaque = scan.nextDouble();
			conta.sacar(valorSaque);
		} else {
			System.out.println("Saldo insuficiente ou conta inexistente.");
		}
		operacoes();
	}
    
    public static void transferir() {
    	System.out.println("Nº conta remetente: ");
		int numeroContaRemetente = scan.nextInt();
		
		Conta contaRemetente = encontrarConta(numeroContaRemetente);
		
		if(contaRemetente != null) {
			System.out.println("Nº conta destinatário: ");
			int numeroContaDestinatario = scan.nextInt();
			
			Conta contaDestinatario = encontrarConta(numeroContaDestinatario);
			
			if(contaDestinatario != null) {
				System.out.println("Valor da transferência: ");
				Double valor = scan.nextDouble();
				
				contaRemetente.transferir(contaDestinatario, valor);
			} else {
				System.out.println("A conta destinatário não foi encontrada.");
			}
		} else {
			System.out.println("Conta não encontrada.");
		}
		operacoes();	
	}
    
    public static void listar() {
		if(contasBancarias.size() > 0) {
			for(Conta conta : contasBancarias) {
				System.out.println(conta);
			}
		} else {
			System.out.println("Não há contas cadastradas.");
		}
		operacoes();
	}
	
}
