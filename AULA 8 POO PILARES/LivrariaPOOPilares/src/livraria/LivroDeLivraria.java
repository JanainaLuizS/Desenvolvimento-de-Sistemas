package livraria;


public class LivroDeLivraria extends Livro {

    private double preco;
    private int quantidadeEstoque;

    // Construtor usando super() para repassar os dados bibliográficos
    public LivroDeLivraria(String titulo, String autor, String editora, int numeroPaginas, 
                           int anoPublicacao, double preco, int quantidadeEstoque) {
        super(titulo, autor, editora, numeroPaginas, anoPublicacao);
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Sobrescrita para exibir dados bibliográficos + comerciais
    @Override
    public void exibirDados() {
        super.exibirDados(); // Exibe título, autor, editora, etc.
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Estoque disponível: " + quantidadeEstoque + " unidade(s)");
        System.out.println("------------------------------------------");
    }

    // Getters e Setters específicos
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public void setQuantidadeEstoque(int quantidadeEstoque) { this.quantidadeEstoque = quantidadeEstoque; }
}