
public class OperadorContaCorrente implements Runnable {
	
	private ContaCorrente conta;
	private float valor;
	private ContaCorrente contaCorrente;

	public boolean lancaDebito() {
		double saldo = conta.getSaldo();
		if (saldo < valor)
			return false;
		conta.debito(valor);
		return true;

	}
	public OperadorContaCorrente(ContaCorrente contaCorrente, float valor) {
		this.contaCorrente = contaCorrente;
		this.valor = valor;
	}
	
	private boolean lancamento() {
		boolean lancado =false;
		double saldo = contaCorrente.getSaldo();
		if(saldo >=0) {
			contaCorrente.debito(valor);
			lancado = true;
		}
		
		return lancado;
		
	}
	
	public void run() {
		System.out.println("Sucesso ?" + lancamento());
		
	}
	
}
