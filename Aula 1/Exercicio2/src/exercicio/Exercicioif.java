package exercicio;

import java.util.Scanner;

public class Exercicioif {
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite sua idade: ");
		int numero = leia.nextInt();
		
		if(numero < 5)  System.out.println(numero + "  Menor que 5 anos: nenhuma categoria");
		
		else if (numero >= 5 && numero < 7 )System.out.println(numero + " De 5 a 7 anos: infantil");
		else if (numero >= 8 && numero < 10 )System.out.println(numero + " De 8 a 10 anos: juvenil");
		else if (numero >= 11 && numero < 15 )System.out.println(numero + " De 11 a 15 anos: adolescente");
		else if (numero >= 16 && numero < 30 )System.out.println(numero + " De 16 a 30 anos: adulto");
		
		else  System.out.println (numero + " Acima de 30 anos: sênior");
		
	}

}
/*2. Categoria de um nadador
Desenvolva um programa que solicite a idade de um nadador e informe a
categoria correspondente.
Considere as seguintes regras:
• Menor que 5 anos: nenhuma categoria;
• De 5 a 7 anos: infantil;
• De 8 a 10 anos: juvenil;
• De 11 a 15 anos: adolescente;
• De 16 a 30 anos: adulto;
• Acima de 30 anos: sênior.
Utilize uma estrutura condicional encadeada com if, else if e else.*/