package estacionamento;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Estrutura do HashMap: Chave Integer (Código) e Valor Veiculo
        HashMap<Integer, Veiculo> veiculos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("\n=== SISTEMA DE ESTACIONAMENTO ===");
            System.out.println("1 - Registrar entrada de veículo");
            System.out.println("2 - Pesquisar veículo pelo código");
            System.out.println("3 - Listar veículos");
            System.out.println("4 - Alterar proprietário");
            System.out.println("5 - Registrar saída do veículo");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o código de entrada do veículo: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner

                    if (veiculos.containsKey(codigo)) {
                        System.out.println("Erro: Já existe um veículo registrado com este código!");
                    } else {
                        System.out.print("Digite a placa do veículo: ");
                        String placa = scanner.nextLine();

                        System.out.print("Digite o modelo do veículo: ");
                        String modelo = scanner.nextLine();

                        System.out.print("Digite o nome do proprietário: ");
                        String proprietario = scanner.nextLine();

                        System.out.print("Digite o ano do veículo: ");
                        int ano = scanner.nextInt();

                        // Criação do objeto e armazenamento no HashMap
                        Veiculo veiculo = new Veiculo(placa, modelo, proprietario, ano);
                        veiculos.put(codigo, veiculo);
                        System.out.println("Veículo cadastrado com sucesso!");
                    }
                    break;

                case 2:
                    System.out.print("\nDigite o código do veículo para pesquisa: ");
                    int codPesquisa = scanner.nextInt();

                    if (veiculos.containsKey(codPesquisa)) {
                        System.out.println("\n--- DADOS DO VEÍCULO ---");
                        System.out.println("Código: " + codPesquisa);
                        veiculos.get(codPesquisa).exibirDados();
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;

                case 3:
                    if (veiculos.isEmpty()) {
                        System.out.println("\nNenhum veículo estacionado.");
                    } else {
                        System.out.println("\n=== LISTA DE VEÍCULOS ESTACIONADOS ===");
                        for (Map.Entry<Integer, Veiculo> entry : veiculos.entrySet()) {
                            System.out.println("Código: " + entry.getKey());
                            entry.getValue().exibirDados();
                            System.out.println("-----------------------------------");
                        }
                    }
                    break;

                case 4:
                    System.out.print("\nDigite o código do veículo para alterar o proprietário: ");
                    int codAlterar = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer

                    if (veiculos.containsKey(codAlterar)) {
                        System.out.print("Digite o novo nome do proprietário: ");
                        String novoProprietario = scanner.nextLine();

                        Veiculo veiculoEncontrado = veiculos.get(codAlterar);
                        veiculoEncontrado.setProprietario(novoProprietario);
                        System.out.println("Proprietário alterado com sucesso!");
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("\nDigite o código do veículo para registrar a saída: ");
                    int codSaida = scanner.nextInt();

                    if (veiculos.remove(codSaida) != null) {
                        System.out.println("Saída registrada! Veículo removido do sistema com sucesso.");
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("\nSistema encerrado.");
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
