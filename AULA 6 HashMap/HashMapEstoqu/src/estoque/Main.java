package estoque;

import java.util.HashMap;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // Criando o HashMap para o controle de estoque
        HashMap<String, Integer> estoque = new HashMap<>();

        // 1. Cadastre pelo menos quatro produtos (usando .put)
        estoque.put("Teclado", 10);
        estoque.put("Mouse", 15);
        estoque.put("Monitor", 6);
        estoque.put("Notebook", 4);

        // 2. Exiba todos os produtos e suas quantidades
        System.out.println("=== ESTOQUE INICIAL ===");
        System.out.println(estoque);
        System.out.println("-------------------------------------\n");

        // 3. Pesquise a quantidade de determinado produto
        String produtoPesquisado = "Mouse";
        
        System.out.println(">>> CONSULTA DE PRODUTO <<<");
        if (estoque.containsKey(produtoPesquisado)) {
            int quantidade = estoque.get(produtoPesquisado);
            System.out.println("Quantidade em estoque de '" + produtoPesquisado + "': " + quantidade + " unidades.");
        } else {
            System.out.println("O produto '" + produtoPesquisado + "' não foi encontrado.");
        }
        System.out.println("-------------------------------------\n");

        // 4. Altere a quantidade de um produto
        // No HashMap, usar o .put() com uma chave JÁ EXISTENTE sobrescreve/atualiza o valor antigo!
        System.out.println(">>> ATUALIZANDO ESTOQUE <<<");
        System.out.println("Alterando quantidade de 'Notebook' de 4 para 12 unidades...");
        estoque.put("Notebook", 12);
        System.out.println("-------------------------------------\n");

        // 5. Remova um produto do estoque (usando .remove)
        System.out.println(">>> REMOVENDO PRODUTO <<<");
        System.out.println("Removendo 'Teclado' do estoque...");
        estoque.remove("Teclado");
        System.out.println("-------------------------------------\n");

        // 6. Exiba novamente o estoque atualizado
        System.out.println("=== ESTOQUE ATUALIZADO ===");
        System.out.println(estoque);
    }
}
