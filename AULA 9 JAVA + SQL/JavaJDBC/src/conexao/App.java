package conexao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        AlunoDao dao = new AlunoDao();

        try (Scanner teclado = new Scanner(System.in)) {
            while (true) {
                System.out.println("\n===== CADASTRO DE ALUNOS =====");
                System.out.println("1 - Cadastrar");
                System.out.println("2 - Listar");
                System.out.println("3 - Buscar por ID");
                System.out.println("4 - Atualizar");
                System.out.println("5 - Excluir");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");

                String opcao = teclado.nextLine();

                try {
                    switch (opcao) {
                        case "1": {
                            System.out.print("Nome: ");
                            String nome = teclado.nextLine();

                            System.out.print("E-mail: ");
                            String email = teclado.nextLine();

                            Aluno novoAluno = new Aluno(0, nome, email);

                            int linhas = dao.cadastrar(novoAluno);
                            System.out.println("Alunos cadastrados: " + linhas);
                            break;
                        }

                        case "2": {
                            ArrayList<Aluno> alunos = dao.listar();

                            if (alunos.isEmpty()) {
                                System.out.println("Nenhum aluno cadastrado.");
                            } else {
                                for (Aluno aluno : alunos) {
                                    exibirAluno(aluno);
                                }
                            }
                            break;
                        }

                        case "3": {
                            System.out.print("ID do aluno: ");
                            int id = Integer.parseInt(teclado.nextLine());

                            Aluno aluno = dao.buscarPorId(id);

                            if (aluno != null) {
                                exibirAluno(aluno);
                            } else {
                                System.out.println("Aluno não encontrado.");
                            }
                            break;
                        }

                        case "4": {
                            System.out.print("ID do aluno: ");
                            int id = Integer.parseInt(teclado.nextLine());

                            Aluno aluno = dao.buscarPorId(id);

                            if (aluno == null) {
                                System.out.println("Aluno não encontrado.");
                                break;
                            }

                            exibirAluno(aluno);

                            System.out.print("Novo nome: ");
                            aluno.setNome(teclado.nextLine());

                            System.out.print("Novo e-mail: ");
                            aluno.setEmail(teclado.nextLine());

                            int linhas = dao.atualizar(aluno);
                            System.out.println("Retorno da atualização: " + linhas);
                            System.out.println("Consulte o aluno para conferir os dados.");
                            break;
                        }

                        case "5": {
                            System.out.print("ID do aluno: ");
                            int id = Integer.parseInt(teclado.nextLine());

                            Aluno aluno = dao.buscarPorId(id);

                            if (aluno == null) {
                                System.out.println("Aluno não encontrado.");
                                break;
                            }

                            exibirAluno(aluno);

                            System.out.print("Confirma a exclusão? (S/N): ");
                            String confirmacao = teclado.nextLine();

                            if (confirmacao.equalsIgnoreCase("S")) {
                                int linhas = dao.excluir(id);
                                System.out.println("Alunos excluídos: " + linhas);
                            } else {
                                System.out.println("Exclusão cancelada.");
                            }
                            break;
                        }

                        case "0": {
                            System.out.println("Programa encerrado.");
                            return;
                        }

                        default: {
                            System.out.println("Opção inválida.");
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("O ID deve ser um número inteiro.");
                } catch (SQLException e) {
                    System.out.println("Erro no acesso ao banco: " + e.getMessage());
                }
            }
        }
    }

    // Método auxiliar para exibir os dados formatados do aluno
    private static void exibirAluno(Aluno aluno) {
        System.out.println("ID: " + aluno.getId() + " | Nome: " + aluno.getNome() + " | E-mail: " + aluno.getEmail());
    }
}

