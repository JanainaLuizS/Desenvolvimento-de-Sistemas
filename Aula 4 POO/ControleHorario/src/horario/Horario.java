package horario;

public class Horario {
	
	    // Atributos privados (encapsulamento)
	    private int hora;
	    private int minuto;
	    private int segundo;
	    
	    // 1. Construtor sem parâmetros (inicia em 00:00:00)
	    public Horario() {
	        this.hora = 0;
	        this.minuto = 0;
	        this.segundo = 0;
	    }
	    
	    // 2. Construtor com parâmetros (hora, minuto, segundo)
	    public Horario(int hora, int minuto, int segundo) {
	        this.hora = hora;
	        this.minuto = minuto;
	        this.segundo = segundo;
	    }
	    
	    // --- Getters e Setters ---
	    public int getHora() {
	        return hora;
	    }

	    public void setHora(int hora) {
	        this.hora = hora;
	    }

	    public int getMinuto() {
	        return minuto;
	    }

	    public void setMinuto(int minuto) {
	        this.minuto = minuto;
	    }

	    public int getSegundo() {
	        return segundo;
	    }

	    public void setSegundo(int segundo) {
	        this.segundo = segundo;
	    }
	    
	 
	    
	    // Exibe o horário formatado com 2 dígitos (ex: 08:05:02)
	    public void exibir() {
	        System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
	    }
	    
	    // Calcula o total de segundos transcorridos desde 00:00:00
	    public int calcularSegundos() {
	        return (this.hora * 3600) + (this.minuto * 60) + this.segundo;
	    }
	}