
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		ContaCorrente contaCorrente = new ContaCorrente(45);
		Thread t1 = new Thread( new OperadorContaCorrente(contaCorrente,10));
		Thread t2 = new Thread( new OperadorContaCorrente(contaCorrente,-35));
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(" Saldo " + contaCorrente.getSaldo());
	
	}

}
