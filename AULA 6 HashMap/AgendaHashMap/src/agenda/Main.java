package agenda;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
        
        // Chave: Nome da pessoa (String) | Valor: Telefone (String)
        HashMap<String, String> agenda = new HashMap<>();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n========== AGENDA TELEFÔNICA ==========");
            System.out.println("1 - Cadastrar contato");
            System.out.println("2 - Pesquisar contato");
            System.out.println("3 - Alterar telefone");
            System.out.println("4 - Remover contato");
            System.out.println("5 - Listar contatos");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado após ler número
            //ou faz opcao = Integer.parseInt(leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nomeCadastrar = scanner.nextLine();

                    // Requisito: Verificar se o contato já existe antes de cadastrar
                    if (agenda.containsKey(nomeCadastrar)) {
                        System.out.println("Erro: O contato '" + nomeCadastrar + "' já está cadastrado!");
                    } else {
                        System.out.print("Digite o telefone: ");
                        String telefone = scanner.nextLine();
                        agenda.put(nomeCadastrar, telefone);
                        System.out.println("Contato cadastrado com sucesso!");
                    }
                    break;

                case 2:
                    System.out.print("Digite o nome do contato para pesquisar: ");
                    String nomePesquisar = scanner.nextLine();

                    if (agenda.containsKey(nomePesquisar)) {
                        String telEncontrado = agenda.get(nomePesquisar);
                        System.out.println("Telefone de " + nomePesquisar + ": " + telEncontrado);
                    } else {
                        System.out.println("Contato não encontrado na agenda.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do contato que deseja alterar: ");
                    String nomeAlterar = scanner.nextLine();

                    if (agenda.containsKey(nomeAlterar)) {
                        System.out.print("Digite o NOVO telefone: ");
                        String novoTelefone = scanner.nextLine();
                        // .put() com chave existente substitui o valor antigo
                        agenda.put(nomeAlterar, novoTelefone);
                        System.out.println("Telefone de " + nomeAlterar + " atualizado com sucesso!");
                    } else {
                        System.out.println("Erro: Não foi possível alterar. Contato não cadastrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do contato para remover: ");
                    String nomeRemover = scanner.nextLine();

                    if (agenda.containsKey(nomeRemover)) {
                        agenda.remove(nomeRemover);
                        System.out.println("Contato '" + nomeRemover + "' removido da agenda!");
                    } else {
                        System.out.println("Erro: Contato não encontrado para remoção.");
                    }
                    break;

                case 5:
                    System.out.println("\n--- LISTA DE CONTATOS ---");
                    if (agenda.isEmpty()) {
                        System.out.println("A agenda está vazia.");
                    } else {
                        // Percorrendo a agenda usando for-each nas chaves (keySet)
                        for (String nome : agenda.keySet()) {
                            System.out.println("Nome: " + nome + " | Telefone: " + agenda.get(nome));
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando a aplicação da Agenda... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
