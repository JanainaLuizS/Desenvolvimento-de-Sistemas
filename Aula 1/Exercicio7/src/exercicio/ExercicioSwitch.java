package exercicio;

import java.util.Scanner;

public class ExercicioSwitch {

	public static void main(String[] args) {
		
	    Scanner leia = new Scanner(System.in);
	    
	            // Leitura dos dois números
	            System.out.print("Digite o primeiro número: ");
	            double num1 = leia.nextDouble();

	            System.out.print("Digite o segundo número: ");
	            double num2 = leia.nextDouble();

	            // Exibição do menu
	            System.out.println("\n--- MENU DE OPERAÇÕES ---");
	            System.out.println("1 - Calcular a média dos números");
	            System.out.println("2 - Subtrair o menor número do maior");
	            System.out.println("3 - Multiplicar os números");
	            System.out.println("4 - Dividir o primeiro número pelo segundo");
	            System.out.print("Escolha uma opção: ");
	            int opcao = leia.nextInt();

	            System.out.println(); // Linha em branco para organização

	            // Estrutura switch para executar a opção escolhida
	            switch (opcao) {
	                case 1:
	                    double media = (num1 + num2) / 2;
	                    System.out.printf("A média dos números é: %.2f\n", media);
	                    break;

	                case 2:
	                    // Estrutura IF para identificar qual é o maior número
	                    if (num1 >= num2) {
	                        double resultado = num1 - num2;
	                        System.out.printf("Subtração (%.2f - %.2f): %.2f\n", num1, num2, resultado);
	                    } else {
	                        double resultado = num2 - num1;
	                        System.out.printf("Subtração (%.2f - %.2f): %.2f\n", num2, num1, resultado);
	                    }
	                    break;

	                case 3:
	                    double multiplicacao = num1 * num2;
	                    System.out.printf("A multiplicação dos números é: %.2f\n", multiplicacao);
	                    break;

	                case 4:
	                    // Validação para evitar divisão por zero
	                    if (num2 != 0) {
	                        double divisao = num1 / num2;
	                        System.out.printf("A divisão de %.2f por %.2f é: %.2f\n", num1, num2, divisao);
	                    } else {
	                        System.out.println("Erro: Não é possível dividir por zero!");
	                    }
	                    break;

	                default:
	                    System.out.println("Opção inválida! Escolha um número de 1 a 4.");
	                    break;
	            }

	            leia.close();
	        }
	    }
		



/*7. Menu de operações matemáticas
Desenvolva um programa que solicite dois números e apresente o seguinte
menu:
1 - Calcular a média dos números;
2 - Subtrair o menor número do maior;
3 - Multiplicar os números;
4 - Dividir o primeiro número pelo segundo.
Utilize a estrutura switch para executar a opção escolhida.
Na opção 2, utilize uma estrutura if para identificar qual dos números é o maior
e realizar a subtração corretamente.
Na opção 4, verifique se o segundo número é diferente de zero antes de realizar
a divisão.
Caso o usuário escolha uma opção diferente de 1, 2, 3 ou 4, o programa deverá
informar que a opção é inválida.*/