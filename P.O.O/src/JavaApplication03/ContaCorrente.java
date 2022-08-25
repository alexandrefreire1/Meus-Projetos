package JavaApplication03;

import JavaApplication03.Main.Conta;

public class ContaCorrente implements Conta {
	private double saldo;
	private double taxaOperacao = 0.45;

	public void deposita(double valor) {
		this.saldo += valor - taxaOperacao;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void sacar(double valor) {
		this.saldo -= valor + taxaOperacao;
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}

}
