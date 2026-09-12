package livraria;

	import livraria.Livro;
	import livraria.LivroDeLivraria;
	import livraria.Contato;

	public class Main {

	    public static void main(String[] args) {

	        System.out.println("==========================================");
	        System.out.println("       ATIVIDADE 4: LIVROS (ABSTRAÇÃO)");
	        System.out.println("==========================================");

	        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", "Livraria Garnier", 256, 1899);
	        Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien", "HarperCollins", 336, 1937);

	        livro1.exibirDados();
	        livro2.exibirDados();


	        System.out.println("\n==========================================");
	        System.out.println("   ATIVIDADE 5: LIVROS DE LIVRARIA (HERANÇA)");
	        System.out.println("==========================================");

	        LivroDeLivraria livroComercial1 = new LivroDeLivraria(
	            "Entendendo Algoritmos", "Aditya Y. Bhargava", "Novatec", 264, 2017, 65.00, 15
	        );

	        LivroDeLivraria livroComercial2 = new LivroDeLivraria(
	            "Código Limpo", "Robert C. Martin", "Alta Books", 456, 2009, 95.50, 8
	        );

	        livroComercial1.exibirDados();
	        livroComercial2.exibirDados();


	        System.out.println("\n==========================================");
	        System.out.println("       ATIVIDADE 6: AGENDA DE CONTATOS");
	        System.out.println("==========================================");

	        Contato c1 = new Contato("Ana Silva", "(24) 99887-1122", "ana.silva@email.com");
	        Contato c2 = new Contato("Bruno Costa", "(24) 98112-3344", "bruno.costa@email.com");
	        Contato c3 = new Contato("Carla Souza", "(21) 97654-5566", "carla.souza@email.com");

	        c1.exibirContato();
	        c2.exibirContato();
	        c3.exibirContato();
	    }
	}