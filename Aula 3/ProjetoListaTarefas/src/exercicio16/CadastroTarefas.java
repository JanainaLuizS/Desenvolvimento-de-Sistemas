package exercicio16;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroTarefas {

	public static void main(String[] args) {
		
	
		String resposta;
		
		Scanner scn = new Scanner(System.in);
		
		ArrayList<String> tarefas = new ArrayList<>();
		
		do {
			System.out.println("Digite uma tarefa: ");
			tarefas.add(scn.nextLine());
			
			System.out.println("Deseja cadastrar outra tarefa? s/n : ");
			resposta = scn.nextLine();
			

		}while (resposta.equalsIgnoreCase("s"));
		

		 
		for(String t: tarefas ) {
			
			
			System.out.println("Tarefas cadastradas: ");
			
			System.out.println(t);
			
			
		}
		
		
		
	}

}
