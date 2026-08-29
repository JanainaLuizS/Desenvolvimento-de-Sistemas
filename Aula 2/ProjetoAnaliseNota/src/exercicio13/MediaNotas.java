package exercicio13;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double[] valor = new double  [5];
		double soma= 0;
		double media = 0;
			
			for(int i = 0; i < valor.length ;i++) {
				System.out.print ((i+1) +"° valor: " );
				valor[i] = scanner.nextInt();
				
			soma += valor[i];
		}
			
			media = soma /valor.length;
			
			
	
			for(int i = 0; i < valor.length ;i++) {
				System.out.println ((i+1) +"° valor é : " + valor[i]);
				
	}
			System.out.printf("Soma %.2f%n ", soma  );
			System.out.printf("Média: %.2f%n " , media);


}
}

/*Objetivo
Utilizar um vetor para armazenar notas e realizar cálculos.
Descrição
Desenvolva um programa que:
Instrutor: Vitor Hugo Almeida de Sousa
10
1. Crie um vetor do tipo double com quatro posições. 
2. Solicite quatro notas ao usuário. 
3. Armazene as notas no vetor. 
4. Some todas as notas durante o preenchimento. 
5. Calcule a média da turma. 
6. Exiba as notas e a média final*/