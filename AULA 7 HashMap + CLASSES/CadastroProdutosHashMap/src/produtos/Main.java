package produtos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando a estrutura do HashMap
        HashMap<Integer, Produto> produtos = new HashMap<>();

        // Requisito 1: Cadastrar pelo menos 4 produtos
        produtos.put(1, new Produto("Teclado", 120.00, 10));
        produtos.put(2, new Produto("Mouse Optico", 50.00, 25));
        produtos.put(3, new Produto("Monitor 24 polegadas", 850.00, 5));
        produtos.put(4, new Produto("Headset Gamer", 200.00, 15));

        // Requisito 2: Listar todos os produtos cadastrados
        System.out.println("=== LISTA DE PRODUTOS CADASTRADOS ===");
        
        for (Map.Entry<Integer, Produto> prod : produtos.entrySet()) {
            prod.getValue().exibirDados();
            
            System.out.println("-----------------------------------");
        }

        // Requisito 3: Solicitar um código ao usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o código do produto para pesquisa: ");
        int codigoBuscado = scanner.nextInt();

        // Requisito 4, 5 e 6: Pesquisar produto pelo código e exibir resultado
        if (produtos.containsKey(codigoBuscado)) {
            produtos.get(codigoBuscado).exibirDados();
        } else {
            System.out.println("\nProduto não encontrado com o código " + codigoBuscado + ".");
        }

        scanner.close();
    }
}
