
public class ContaCorrente {

	private double saldo;
	
	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	public void debito(double valor) {
		saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	
	
	
}
