package exercicio14;

import java.util.Scanner;

public class AnaliseTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] temperatura = new double[7];
        int i;
        
        // 1. Leitura dos dados
        for (i = 0; i < temperatura.length; i++) {
            System.out.print((i + 1) + "° valor: ");
            temperatura[i] = scanner.nextDouble(); 
        }
        
        // 2. Inicialização do maior e menor FORA do laço
        // Pegamos a primeira temperatura informada (índice 0)
        double maior = temperatura[0];
        double menor = temperatura[0];
        
        // 3. Laço para encontrar o maior e o menor
        // Podemos começar em i = 1 pois o i = 0 já foi salvo acima
        for (i = 1; i < temperatura.length; i++) {
            
            if (temperatura[i] > maior) {
                maior = temperatura[i];
            }
            
            if (temperatura[i] < menor) {
                menor = temperatura[i];
            }
        }
        
        // 4. Exibição de todas as temperaturas
        System.out.println("\n--- Temperaturas Cadastradas ---");
        for (i = 0; i < temperatura.length; i++) {
            System.out.println((i + 1) + "° temperatura: " + temperatura[i]);
        }
        
        // 5. Exibição do maior e menor valor
        System.out.println("\nMaior temperatura: " + maior);
        System.out.println("Menor temperatura: " + menor);
        
        scanner.close();
    } 
}

/*Objetivo
Encontrar o maior e o menor valor armazenado em um vetor.
Descrição
Desenvolva um programa que:
1. Crie um vetor para armazenar sete temperaturas. 
2. Solicite uma temperatura para cada dia da semana. 
3. Depois do preenchimento, considere inicialmente: 
4. a primeira temperatura como a maior; 
5. a primeira temperatura como a menor. 
6. Percorra o vetor para identificar a maior e a menor temperatura. 
7. Exiba todos os valores cadastrados. 
8. Exiba a maior e a menor temperatura*/
