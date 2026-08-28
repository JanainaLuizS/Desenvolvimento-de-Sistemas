package exercicio;

import java.util.Scanner;

public class ExercicioTabuada {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero = 3;
		
		do {
            System.out.print("Digite um número maior que zero para a tabuada: ");
            numero = leia.nextInt();
            
            if (numero <= 0) {
                System.out.println(" O número deve ser maior que zero.\n");
            }
        } while (numero <= 0);
        
       
        System.out.println("\n--- Tabuada do " + numero + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        leia.close();
    }
}
/*4. Tabuada em três etapas
Desenvolva um programa para mostrar a tabuada de um número, realizando o
exercício em três etapas.
Etapa 1 — Número fixo
Defina um número diretamente no código e utilize obrigatoriamente a estrutura
de repetição for para mostrar sua tabuada de 1 até 10.
Etapa 2 — Número informado pelo usuário
Modifique o programa para que o usuário possa digitar o número cuja tabuada
deseja visualizar.
Continue utilizando a estrutura for para realizar as multiplicações de 1 até 10.
Etapa 3 — Validação da entrada
Utilize a estrutura do-while para garantir que o número digitado seja maior que
zero.
Enquanto o usuário informar um valor menor ou igual a zero, o programa deverá
solicitar uma nova entrada. Depois de receber um valor válido, deverá utilizar o
for para mostrar a tabuada.*/


      
        

