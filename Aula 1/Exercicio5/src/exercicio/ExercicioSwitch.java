package exercicio;

import java.util.Scanner;

public class ExercicioSwitch {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int opcao;
		
		System.out.print("Digite um número entre 1 e 7: ");
        opcao = leia.nextInt();
        
        switch(opcao){
        	case 1: 
        		System.out.println ("Domingo");
        		break;
             case 2:
                 System.out.println("Segunda-feira");
                 break;
             case 3:
                 System.out.println("Terça-feira");
                 break;
             case 4:
                 System.out.println("Quarta-feira");
                 break;
             case 5:
                 System.out.println("Quinta-feira");
                 break;
             case 6:
                 System.out.println("Sexta-feira");
                 break;
             case 7:
                 System.out.println("Sábado");
                 break;
             default:
	                System.out.println("Opção inválida.");
	                break;
        }
	}
	
}

       
	




/*5. Dia da semana
Desenvolva um programa que solicite um número inteiro entre 1 e 7 e informe o
dia da semana correspondente.
Considere:
1 — Domingo;
2 — Segunda-feira;
3 — Terça-feira;
4 — Quarta-feira;
5 — Quinta-feira;
6 — Sexta-feira;
7 — Sábado.
Utilize a estrutura switch.
Caso o usuário digite um valor que não esteja entre 1 e 7, o programa deverá
informar que a opção é inválida.*/

