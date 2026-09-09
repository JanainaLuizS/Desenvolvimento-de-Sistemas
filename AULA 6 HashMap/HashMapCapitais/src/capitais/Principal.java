package capitais;

import java.util.HashMap;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		HashMap<String, String> capitais = new HashMap<>();

		// cadastro capitais

		capitais.put("Rio de Janeiro", "Rio de Janeiro");
		capitais.put("São Paulo", "SP");
		capitais.put("Minas Gerais", "BH");
		capitais.put("Bahia", "Salvador");
		capitais.put("Paraná", "Curitiba");

		System.out.println("Digita o Estado para saber a capital: ");
		String nome = scn.nextLine();

		if (capitais.containsKey(nome)){
			System.out.println(capitais.get(nome));
		}else {
			System.out.println("Estado não encontrado");
		}
		
	}

}
