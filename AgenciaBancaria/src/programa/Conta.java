package programa;

import utilitarios.Utils;

public class Conta {

	// Declarando contador de contas
	private static int contadorDeContas = 1;
	
	private int numConta;
	private Cliente pessoa;
	private Double saldo = 0.0;
	
	// Construtor
	public Conta(Cliente pessoa) {
		this.numConta = contadorDeContas;
		this.pessoa = pessoa;
		contadorDeContas += 1;
	}

	// M�todos Get/Set
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public Cliente getPessoa() {
		return pessoa;
	}

	public void setPessoa(Cliente pessoa) {
		this.pessoa = pessoa;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	// ToString para receber os dados do cliente
	public String toString() {
		return "\nNúmero da Conta " + this.getNumConta() + ":" +
		 	   "\nNome: " + this.pessoa.getNome() +
		 	   "\nCPF: " + this.pessoa.getCPF() +
		 	   "\nEmail: " + this.pessoa.getEmail() +
		 	   "\nSaldo: " + Utils.doubleToString(this.getSaldo()) +
		 	   "\n";
	}
	
	// Criando os m�todos:
	// 1� m�todo: DEPOSITAR um valor
	public void depositar(Double valor) {
		if(valor > 0) {
			setSaldo(getSaldo() + valor);
			System.out.println("Dep�sito realizado com sucesso!");
		} else {
			System.out.println("N�o � poss�vel realizar o dep�sito.");
		}
	}
	
	// 2� m�todo: SACAR um valor
	public void sacar(Double valor) {
		if(valor > 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			System.out.println("Saque realizado com sucesso! Retire seu valor.");
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	// 3� m�todo: TRANSFERIR um valor
	public void transferir(Conta contaDeposito, Double valor) {
		if(valor > 0 && this.getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			
			contaDeposito.saldo = contaDeposito.getSaldo() + valor;
			System.out.println("Transfer�ncia realizada!");
		} else {
			System.out.println("Transfer�ncia mal sucedida.");
		}
	}
	
	
	
	
	
}
