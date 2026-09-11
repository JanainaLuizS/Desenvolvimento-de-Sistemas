package alunos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Estrutura do HashMap: Chave Integer (Matrícula) e Valor Aluno
        HashMap<Integer, Aluno> alunos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("\n=== SISTEMA DE ALUNOS ===");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Pesquisar aluno");
            System.out.println("3 - Listar alunos");
            System.out.println("4 - Alterar nota");
            System.out.println("5 - Remover aluno");
            System.out.println("0 - Encerra");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            int matricula;

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite a matrícula do aluno: ");
                    matricula = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner

                    if (alunos.containsKey(matricula)) {
                        System.out.println("Erro: Já existe um aluno cadastrado com essa matrícula!");
                    } else {
                        System.out.print("Digite o nome do aluno: ");
                        String nome = scanner.nextLine();

                        System.out.print("Digite o curso do aluno: ");
                        String curso = scanner.nextLine();

                        System.out.print("Digite a nota do aluno: ");
                        double nota = scanner.nextDouble();

                        // Criação do objeto e armazenamento no HashMap
                        Aluno aluno = new Aluno(nome, curso, nota);
                        alunos.put(matricula, aluno);
                        System.out.println("Aluno cadastrado com sucesso!");
                    }
                    break;

                case 2:
                    System.out.print("\nDigite a matrícula do aluno para pesquisa: ");
                     matricula = scanner.nextInt();

                    if (alunos.containsKey(matricula)) {
                        alunos.get(matricula).exibirDados();
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 3:
                    if (alunos.isEmpty()) {
                        System.out.println("\nNenhum aluno cadastrado.");
                    } else {
                    	
                        System.out.println("\n=== LISTA DE ALUNOS ===");
                        for (Map.Entry<Integer, Aluno> aluno : alunos.entrySet()) {
                             aluno.getValue().exibirDados();
                           
                        }
                    }
                    break;

                case 4:
                    System.out.print("\nDigite a matrícula do aluno para alterar a nota: ");
                     matricula = scanner.nextInt();

                    if (alunos.containsKey(matricula)) {
                        System.out.print("Digite a nova nota: ");
                        double novaNota = scanner.nextDouble();

                        Aluno alunoEncontrado = alunos.get(matricula);
                        alunoEncontrado.setNota(novaNota);
                        System.out.println("Nota alterada com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado para a matrícula informada.");
                    }
                    break;

                case 5:
                    System.out.print("\nDigite a matrícula do aluno a ser removido: ");
                     matricula = scanner.nextInt();

                    if (alunos.remove(matricula) != null) {
                        System.out.println("Aluno removido com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado para a matrícula informada.");
                    }
                    break;

                case 0:
                    System.out.println("\nPrograma encerrado.");
                    break;

                default:
                    System.out.println("\nOpção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}