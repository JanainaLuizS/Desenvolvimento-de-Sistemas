package exercicio;

public class Principal {

	public static void main(String[] args) {

		int resultado = Calculadora.somar(5, 5);

		System.out.println(resultado);

		
		System.out.println("subtração: " + Calculadora.subtrair(5, 5));

		int resultado2 = Calculadora.multiplicar(5, 5);

		System.out.println(resultado2);

		int resultado3 = Calculadora.maiornum(5, 4);

		System.out.println(resultado3);
	}

}
