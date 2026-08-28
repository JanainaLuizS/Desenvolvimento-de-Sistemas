package exercicio;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner (System.in);
	
	  double base;
      double altura;
	
      
      do {
          System.out.print("Informe a base do triângulo: ");
          base = leia.nextDouble();
          
          System.out.print("Informe a altura do triângulo: ");
          altura = leia.nextDouble();
          
          
          if (base <= 0 || altura <= 0) {
              System.out.println("Erro: A base e a altura devem ser maiores que zero.\n");
          }
          
      } while (base <= 0 || altura <= 0); 
      
     
      
      double area = (base * altura) / 2;
      
 
      System.out.printf("\nA área do triângulo é: %.2f\n", area);
      
      leia.close();
	}

 
	}
/*3. Área de um triângulo com validação
Desenvolva um programa que solicite a base e a altura de um triângulo e
calcule sua área.
A base e a altura devem ser maiores que zero. Caso o usuário informe um valor
menor ou igual a zero, o programa deverá mostrar uma mensagem de erro e
solicitar novamente as duas medidas.
Utilize a estrutura do-while para realizar a validação.
A área deve ser calculada utilizando a fórmula:
Área = (base × altura) ÷ 2*/