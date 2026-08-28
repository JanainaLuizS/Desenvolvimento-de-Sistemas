package exercicio;

import java.util.Scanner;

public class ExercicioIf {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um número interiro: ");
		int numero = leia.nextInt();
		
		if(numero > 20) System.out.println(numero + " é maior que 20");
		else  System.out.println (numero + " não é maior que 20");
		
		System.out.println
		("O número " + numero + (numero> 20?" é maior que ": " é menor que ")+ "20");
				
				leia.close();
		
	}

}

/*1. Comparação com o número 20
Desenvolva um programa que solicite ao usuário um número inteiro.
O programa deverá verificar se o número digitado é maior que 20 e apresentar
uma mensagem com o resultado da comparação.
Utilize a estrutura condicional if/else.*/