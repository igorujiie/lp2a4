package br.edu.ifsp.lp2a4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		ContaCorrente contaCorrente = new ContaCorrente(45);


		ExecutorService pool = Executors.newFixedThreadPool(3);
		Future<Boolean> v1 =  pool.submit(new OperadorContaCorrente(contaCorrente, 10));
		Future<Boolean> v2 =  pool.submit(new OperadorContaCorrente(contaCorrente, -36));
		
		
		pool.shutdown();
		System.out.println("Saldo " + contaCorrente.getSaldo());
	}


}
