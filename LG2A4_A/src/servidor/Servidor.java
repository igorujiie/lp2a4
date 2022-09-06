package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	public static void main(String[] args) throws IOException {
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta!");

		Socket cliente = servidor.accept();
		System.out.println("nova conexão com o cliente " + cliente.getInetAddress().getHostAddress());

		Scanner s = new Scanner(cliente.getInputStream());
		try {
			while (s.hasNextLine()) {
				String nextLine = s.nextLine();
				System.out.println(nextLine);
				if (nextLine.equals("/kill")) {
					throw new Exception(" parando servidor");

				}
			}
		} catch (Exception e) {
			System.out.println("parou");
		} finally {
			s.close();
			servidor.close();
			cliente.close();
		}
		

	}

}
