package senai;

import java.util.ArrayList;

public class Departamento {

	int codigo;
	String nome;
	String telefone;
	// O ArrayList guarda OBJETOS do tipo Funcionario
	ArrayList<Funcionario> funcionarios;

	public Departamento(int codigo, String nome, String telefone) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.funcionarios = new ArrayList<>();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// Retorna a lista inteira de funcionários cadastrados no departamento
	public ArrayList<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	
	// Adiciona um objeto Funcionario na lista
	public void adicionarFuncionario(Funcionario func) {
		funcionarios.add(func);
	}

	// Exibe os dados do departamento
	public void exibirDados() {
		System.out.println("\n--- DEPARTAMENTO: " + nome + " (Código: " + codigo + ") ---");
		System.out.println("Telefone: " + telefone);
	}

	// Percorre a lista e chama o exibirDados de CADA funcionario
	public void listarFuncionarios() {
		if (funcionarios.isEmpty()) {
			System.out.println("  Nenhum funcionário cadastrado neste departamento.");
		} else {
			System.out.println("  Funcionários do setor:");
			for (Funcionario f : funcionarios) {
				// Reutiliza o exibirDados da classe Funcionario!
				f.exibirDados();
			}

		}
	}
}
