package notas;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // Criando o HashMap para armazenar (Nome -> Nota)
        HashMap<String, Double> notas = new HashMap<>();

        // 1. Cadastrando pelo menos cinco alunos
        notas.put("Carlos", 8.5);
        notas.put("Ana", 6.0);
        notas.put("Bruno", 7.0);
        notas.put("Mariana", 9.5);
        notas.put("Diego", 4.5);

        // Variáveis para os cálculos 
        double somaNotas = 0.0;
        double maiorNota = Double.MIN_VALUE; // Começa com o menor valor possível em Java
        double menorNota = Double.MAX_VALUE; // Começa com o maior valor possível em Java

        System.out.println("=RELATÓRIO INDIVIDUAL DOS ALUNOS=");

        // 2. Percorrendo o HashMap chave por chave (usando keySet)
        for (String aluno : notas.keySet()) {
            double nota = notas.get(aluno);
            
            // Verificação de Aprovado / Reprovado (Requisito)
            String situacao = (nota >= 7.0) ? "Aprovado" : "Reprovado";

            System.out.println("----------------------------------");
            System.out.println("Aluno: " + aluno);
            System.out.printf("Nota: %.1f\n", nota);
            System.out.println("Situação: " + situacao);

            // Acumulando para a média
            somaNotas += nota;

            // Verificando maior e menor nota
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            
            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        // 3. Calculando a média da turma
        double mediaTurma = somaNotas / notas.size();

        // 4. Apresentando o resumo estatístico ao final
        System.out.println("\n==================================");
        System.out.println("       RESUMO DA TURMA");
        System.out.println("==================================");
        System.out.printf("Maior Nota: %.1f\n", maiorNota);
        System.out.printf("Menor Nota: %.1f\n", menorNota);
        System.out.printf("Média da Turma: %.2f\n", mediaTurma);
        System.out.println("==================================");
    }
}

