package mercado;

	public class Principal {

	    public static void main(String[] args) {

	        System.out.println("=== CRIAÇÃO COM CONSTRUTOR SEM PARÂMETROS ===");
	        // Objeto criado usando o construtor vazio
	        Lampada lampadaPadrao = new Lampada();
	        lampadaPadrao.exibirDados();

	        // Alterando atributos via setters (pois o acesso direto como lampadaPadrao.marca é proibido)
	        lampadaPadrao.setMarca("Philips");
	        lampadaPadrao.setPreco(12.90);

	        System.out.println("\n--- Teste de Funcionamento (Lâmpada Padrão) ---");
	        lampadaPadrao.mostrarEstado();
	        lampadaPadrao.ligar();
	        lampadaPadrao.mostrarEstado();


	        System.out.println("\n=== CRIAÇÃO COM CONSTRUTOR COM PARÂMETROS ===");
	        // Objeto criado passando todos os dados na instanciação
	        Lampada lampadaEspecial = new Lampada("Osram", 15, 22.50, true);
	        lampadaEspecial.exibirDados();

	        System.out.println("\n--- Teste de Sequência de Estados (Lâmpada Especial) ---");
	        lampadaEspecial.mostrarEstado(); // Desligada
	        lampadaEspecial.ligar();         // Ligada
	        lampadaEspecial.mostrarEstado(); 
	        lampadaEspecial.desligar();      // Desligada
	        lampadaEspecial.mostrarEstado();
	    }
	}