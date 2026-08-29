package exercicio14;

import java.util.Scanner;

public class AnaliseTemperatura {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double[] temperatura = new double [7];
		int i;
		double maior;
		double menor;
		
		for( i = 0; i < temperatura.length ;i++) {
			System.out.print ((i+1) +"° valor: " );
			temperatura[i] = scanner.nextInt();}
		
		
		for( i = 0; i < temperatura.length ;i++) {
			System.out.print ((i+1) +"° valor: " + temperatura );
		
		
		 maior = temperatura[i];
		 menor = temperatura [i];
			
			
			if (temperatura[i]> maior) {
				
				maior = temperatura[i];
			}
			
			if (temperatura[i]< menor) {
				
				menor= temperatura[i];
			}
		}
		
		
		for( i = 0; i < temperatura.length ;i++) {
			
		System.out.println ((i+1) +"° temperatura: " + temperatura [i]);
		}
		
		
		System.out.println ("Maior temperatura: "  maior );
		System.out.println ("Menor temperatura: "+ menor );
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