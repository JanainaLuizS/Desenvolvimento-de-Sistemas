package exercicio12;

import java.util.Scanner;

public class CadastroNumeros {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
		
	int[] valor = new int [5];
		
		for(int i = 0; i < valor.length ;i++) {
			System.out.print ((i+1) +"° valor: " );
			valor[i] = scanner.nextInt();
	}
		
		for(int i = 0; i < valor.length ;i++) {
			System.out.println ((i+1) +"° valor é : " + valor[i]);
			
		}

}
	
}
/*12.Cadastro de cinco números
Nome do projeto Java: ProjetoVetoresBasicos
Pacote: exercicio12
Classe principal: CadastroNumeros
Objetivo
Preencher um vetor com valores informados pelo usuário.
Descrição
Desenvolva um programa que:
1. Crie um vetor de números inteiros com cinco posições. 
2. Utilize Scanner para solicitar os cinco números. 
3. Armazene cada número em uma posição do vetor. 
4. Depois do preenchimento, percorra novamente o vetor. 
5. Exiba todos os números cadastrados*/