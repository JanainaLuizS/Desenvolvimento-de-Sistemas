package academia;

public class Principal {

    public static void main(String[] args) {
        
        // 1. Criar a Ana (17 anos, 60 kg, 1.65 m)
        AlunoAcademia a1 = new AlunoAcademia("Ana", 17, 60.0, 1.65);
        
        // 2. Criar o Bruno (25 anos, 80 kg, 1.80 m)
        AlunoAcademia a2 = new AlunoAcademia("Bruno", 25, 80.0, 1.80);
        
        System.out.println("=== DADOS INICIAIS ===");
        a1.exibirDados();
        a2.exibirDados();
        
        // 3. Alterar o peso do Bruno para 78 kg usando o setter
        System.out.println("\n>>> Alterando peso do Bruno para 78 kg... <<<\n");
        a2.setPeso(78.0);
        
        // 4. Exibir novamente os dados do Bruno com o IMC atualizado
        System.out.println("=== DADOS DO BRUNO ATUALIZADOS ===");
        a2.exibirDados();
    }
}
/*1. Defina os atributos
Na classe AlunoAcademia, crie:
• nome: String.
• idade: int.
• peso: double, informado em quilogramas.
• altura: double, informada em metros.
Exemplo: para representar uma pessoa de 1,75 m, utilize 1.75 no código.
Instrutor: Vitor Hugo Almeida de Sousa
32
2. Implemente os métodos
• Um construtor que receba os quatro dados do aluno.
• Métodos get e set para consultar e atualizar os atributos.
• boolean ehMenorDeIdade(): retornar true quando a idade for inferior a 18 
anos e false nos demais casos.
• double calcularIMC(): retornar o resultado de peso dividido pela altura ao 
quadrado.
• void exibirDados(): apresentar os dados do aluno, seu IMC e se ele tem 
direito ao desconto.
No cálculo do IMC, multiplique a altura por ela mesma. Em Java, o símbolo ^ 
não representa potenciação.
Não é necessário calcular o valor do desconto ou classificar o resultado do 
IMC.
*/