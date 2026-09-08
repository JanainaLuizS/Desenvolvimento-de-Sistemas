package academia;

public class AlunoAcademia {

	String nome;
	int idade;
	double peso, altura;
	
	public AlunoAcademia(String nome, int idade, double peso, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	} 
	
	public  boolean ehMenorDeIdade() {
		
		return idade < 18;
	}
	
	public  double calcularIMC() {
		
		return  peso / (altura * altura);
	}
	
	public void exibirDados() {
		
		System.out.printf(" %s%n idade:%d%n %.0f quilos%n %.2f%n desconto: %s%n IMC: %.2f%n", nome, idade, peso, altura, ehMenorDeIdade() ? "sim" : "não",calcularIMC() );
	}
	
	
	
}

/*// Exibição dos dados corrigida
    public void exibirDados() {
        System.out.println("------------------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.printf("Peso: %.1f kg | Altura: %.2f m\n", peso, altura);
        System.out.printf("IMC: %.2f\n", calcularIMC());
        // %s usado para a String do operador ternario ("Sim" ou "Não")
        System.out.printf("Direito a desconto (Menor de idade): %s\n", ehMenorDeIdade() ? "Sim" : "Não");
        System.out.println("------------------------------------------");*/
