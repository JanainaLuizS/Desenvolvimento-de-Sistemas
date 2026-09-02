package exercicio17;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaConvidados {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		ArrayList<String> convidados = new ArrayList<>();
		
		int opcao;
		
		do {
			System.out.println("1- Adicionar 2-Alterar 3- remover 4 - Procurar convidado 5 - Exibir convidados 6 - Encerrar");
			opcao = Integer.parseInt(scn.nextLine());
			
			switch (opcao) {
			case 1: 
				
			System.out.println("Nome: ");
			convidados.add(scn.nextLine());
			break;
			
			case 2:
				System.out.println("Posição: ");
				int p = Integer.parseInt(scn.nextLine());
				if (p>=0 && p < convidados.size()) 
					System.out.println("Novo Nome: ");
					convidados.set(p,scn.nextLine());
					
					else
				
					System.out.println("Não encontrado");
				break;
				
			case 3:
				System.out.println("Nome: ");
				String remover = scn.nextLine();
				if (convidados.contains(remover))
				convidados.remove(remover);
					
				else 
					System.out.println("Posição inválida");
				break;
				
			case 4:
				System.out.println("Nome: ");
				int indice = convidados.indexOf(scn.nextLine());
				System.out.println(indice <0 ? "Não encontrado" : "Posição");
				break;
				
			case 5	:	
			for(String nome: convidados)
				System.out.println(nome);
			break;
			
			case 6:
				break;
				
				default:
				
					System.out.println("opção inválida");
			
			
			}
		} while (opcao!=6);
		
		
	}
}



