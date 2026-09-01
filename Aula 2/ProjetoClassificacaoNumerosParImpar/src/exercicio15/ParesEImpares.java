package exercicio15;

import java.util.Scanner;

public class ParesEImpares {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // 1. Vetor de números inteiros
        int[] numeros = new int[8];
        
        // Variáveis "contadores" declaradas FORA do laço para acumular o total
        int qtdPares = 0;
        int qtdImpares = 0;
        
        // MOMENTO 1: Leitura dos 8 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("\n--- CLASSIFICAÇÃO DOS NÚMEROS ---");
        
        // MOMENTO 2: Percorrer o vetor, classificar e contar
        for (int i = 0; i < numeros.length; i++) {
            
            // Testa se o VALOR GUARDADO NO VETOR é par
            if (numeros[i] % 2 == 0) {
                System.out.println("O número " + numeros[i] + " é PAR");
                
                qtdPares++; // Incrementa +1 no contador de pares
                
            } else {
                System.out.println("O número " + numeros[i] + " é ÍMPAR");
                qtdImpares++; // Incrementa +1 no contador de ímpares
            }
        }
        
        // MOMENTO 3: Exibição do resultado final
        System.out.println("\n--- RESUMO FINAL ---");
        System.out.println("Quantidade de números pares: " + qtdPares);
        System.out.println("Quantidade de números ímpares: " + qtdImpares);
        
        scanner.close();
    }
}

/*
 * 15. Vetores com condicionais
 * 
 * Descrição Desenvolva um programa que: 1. Crie um vetor com oito números
 * inteiros. 2. Solicite os valores ao usuário. 3. Percorra o vetor depois do
 * preenchimento. 4. Utilize uma estrutura if para verificar se cada número é
 * par ou ímpar. 5. Exiba a classificação de cada número. 6. Ao final, mostre: o
 * quantidade de números pares; o quantidade de números ímpares.
 */