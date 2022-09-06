package br.edu.ifsp.lp2a4;

import java.util.concurrent.Callable;

public class OperadorContaCorrente implements Callable <Boolean>{

	private ContaCorrente contaCorrente;
	private double valor;

	public OperadorContaCorrente(ContaCorrente contaCorrente, double valor) {
		this.contaCorrente = contaCorrente;
		this.valor = valor;
	}

	private boolean lancamento() {
		boolean lancado = false;
		double saldo = contaCorrente.getSaldo();
		if (saldo >= 0) {
			contaCorrente.debito(valor);
			lancado = true;
		}
		return lancado;
	}
	
	
	@Override
	public Boolean call() throws Exception {
		return lancamento();
	}

}
