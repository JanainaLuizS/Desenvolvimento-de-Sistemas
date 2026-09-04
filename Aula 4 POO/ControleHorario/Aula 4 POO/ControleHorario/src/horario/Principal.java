package horario;

		public class Principal {

		    public static void main(String[] args) {
		        
		        System.out.println("=== TESTE 1: CONSTRUTOR PADRÃO ===");
		        // Criar objeto com o construtor sem parâmetros
		        Horario h1 = new Horario();
		        
		        System.out.print("Horário inicial (h1): ");
		        h1.exibir(); // Exibe 00:00:00
		        
		        // Alterar o objeto usando os setters para 08:15:30
		        h1.setHora(8);
		        h1.setMinuto(15);
		        h1.setSegundo(30);
		        
		        System.out.print("Horário alterado (h1): ");
		        h1.exibir();
		        System.out.println("Total em segundos de h1: " + h1.calcularSegundos() + " s");
		        
		        System.out.println("\n=== TESTE 2: CONSTRUTOR COM PARÂMETROS ===");
		        // Criar outro objeto com o construtor parametrizado (14:20:05)
		        Horario h2 = new Horario(14, 20, 5);
		        
		        System.out.print("Horário cadastrado (h2): ");
		        h2.exibir();
		        System.out.println("Total em segundos de h2: " + h2.calcularSegundos() + " s");
		        
		        // Mostrar separadamente apenas o minuto do segundo objeto usando getter
		        System.out.println("Apenas os minutos de h2: " + h2.getMinuto() + " minutos");
		    }
		}
	


