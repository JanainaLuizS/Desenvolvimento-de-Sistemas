package senai;

import java.util.ArrayList;

public class UnidadeSenai {
	
	private String nome;
    // Guarda uma lista de objetos do tipo Departamento
    private ArrayList<Departamento> departamentos;
    
	public UnidadeSenai(String nome) {
		
		this.nome = nome;
		// Inicializa a lista vazia
        this.departamentos = new ArrayList<>();
	}

    
 // Adiciona um Departamento na lista
    public void adicionarDepartamento(Departamento depart) {
        departamentos.add(depart);
    }
    
 // Exibe a estrutura inteira encadeada
    public void exibirEstrutura() {
        System.out.println("==================================================");
        System.out.println("            UNIDADE: " + nome);
        System.out.println("==================================================");

        for (Departamento d : departamentos) {
            // Reutiliza os métodos da classe Departamento
            d.exibirDados();
            d.listarFuncionarios();
        }
        System.out.println("==================================================\n");
    }
}
