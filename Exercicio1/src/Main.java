import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Editora> Editoras = new ArrayList<Editora>();
		Editora editora1 = new Editora(0, "Record", "www.recordeditora.com.br");
		ArrayList<Livro> Livros = new ArrayList<Livro>();
		Livro livro1 = new Livro(0, editora1, "Mensagem", "Fernando Pessoa", 20.0, true);
		
		int opcao, opcao2;
		
		do{
	        System.out.println("0 - Sair\n1 - Adicionar novo livro\n2 - Mostrar todos os livros");
	        opcao = input.nextInt();

	        switch(opcao){
	            case 0:

	                break;

	            case 1:
	            	
	            	int idLivro = Livros.size();
	            	int idEditora = Editoras.size();

	            	System.out.println("Nome do livro: ");
	                String nome = input.next();
	                
	                System.out.println("Nome da Editora: ");
	                String nomeEditora = input.next();
	                
	                Editora editora = new Editora(idEditora, nomeEditora, "www." + nomeEditora + ".com.br");
	                
	                System.out.println("Autor do livro: ");
	                String autor = input.next();
	                
	                System.out.println("Preço do livro: ");
	                double preco = input.nextDouble();           
	           
	                
	                Livro livro = new Livro(idLivro, editora, nome, autor, preco, true);
	                Livros.add(livro);

	            case 2:

	                break;

	            default:
	                System.out.println("Opcão Inválida!");

	                break;
	        }
	    }while(opcao != 0);
	}
}


		
