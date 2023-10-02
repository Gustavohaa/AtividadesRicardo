package ExercicioBiblioteca;

public class Main {
	  public static void main(String[] args) {
		  Biblioteca biblioteca = new Biblioteca("Minha bibilhoteca");
		  
		  Autor autor1 = new Autor("Autor 1");
		  Autor autor2 = new Autor("Autor 2");
		  
		  Livro livro1 = new Livro("Sniper de elite", autor1.getNome());
		  Livro livro2 = new Livro("Madagascar", autor2.getNome());
		  
		  
		  biblioteca.adicionarAutor(autor1);
		  biblioteca.adicionarAutor(autor2);
		  
		  biblioteca.adicionarLivro(livro1);
		  biblioteca.adicionarLivro(livro2);
		  
		  System.out.println("Verificando disponibilidade de 'Livro 1': " + biblioteca.verificarDisponibilidade("Madagascar"));
	      System.out.println("Verificando disponibilidade de 'Livro 2': " + biblioteca.verificarDisponibilidade("Sniper de elite"));
	  }
	}
