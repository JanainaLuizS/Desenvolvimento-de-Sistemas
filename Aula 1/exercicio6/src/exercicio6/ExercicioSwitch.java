package exercicio6;

import java.util.Scanner;

public class ExercicioSwitch {

	public static void main(String[] args) {
			
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número inteiro entre 1 e 12: ");
		        int mes = scanner.nextInt();

		        // Estrutura switch para mapear o número ao mês correspondente
		        switch (mes) {
		            case 1:
		                System.out.println("Janeiro");
		                break;
		            case 2:
		                System.out.println("Fevereiro");
		                break;
		            case 3:
		                System.out.println("Março");
		                break;
		            case 4:
		                System.out.println("Abril");
		                break;
		            case 5:
		                System.out.println("Maio");
		                break;
		            case 6:
		                System.out.println("Junho");
		                break;
		            case 7:
		                System.out.println("Julho");
		                break;
		            case 8:
		                System.out.println("Agosto");
		                break;
		            case 9:
		                System.out.println("Setembro");
		                break;
		            case 10:
		                System.out.println("Outubro");
		                break;
		            case 11:
		                System.out.println("Novembro");
		                break;
		            case 12:
		                System.out.println("Dezembro");
		                break;
		            default:
		                System.out.println("Não existe um mês correspondente.");
		                break;
		        }

		        scanner.close();
		    }
		}

	


/*6. Mês do ano
Desenvolva um programa que solicite um número inteiro entre 1 e 12 e informe
o mês correspondente.
Considere:
1 — Janeiro;
2 — Fevereiro;
3 — Março;
4 — Abril;
5 — Maio;
6 — Junho;
7 — Julho;
8 — Agosto;
9 — Setembro;
10 — Outubro;
11 — Novembro;
12 — Dezembro.
Utilize a estrutura switch.
Caso o usuário digite um valor que não esteja entre 1 e 12, o programa deverá
informar que não existe um mês correspondente. */